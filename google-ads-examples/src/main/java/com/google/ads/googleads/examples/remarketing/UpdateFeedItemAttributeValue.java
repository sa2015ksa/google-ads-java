// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v2.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.FeedAttribute;
import com.google.ads.googleads.v2.resources.FeedItem;
import com.google.ads.googleads.v2.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v2.services.FeedItemOperation;
import com.google.ads.googleads.v2.services.FeedItemServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v2.services.MutateFeedItemResult;
import com.google.ads.googleads.v2.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v2.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * Updates a the FLIGHT_PRICE FeedItemAttributeValue in a flights feed. To create a flights feed,
 * run the AddFlightsFeed.java example. This example is specific to feeds of type DYNAMIC_FLIGHT,
 * and specifically updates the FLIGHT_PRICE attribute, so the FLIGHT_PRICE attribute must be
 * present on the feed.
 */
public class UpdateFeedItemAttributeValue {
  private static final int PAGE_SIZE = 1_000;

  private static class UpdateFeedItemAttributeValueParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.FEED_ID, required = true)
    private long feedId;

    @Parameter(names = ArgumentNames.FEED_ITEM_ID, required = true)
    private long feedItemId;
  }

  public static void main(String[] args) {
    UpdateFeedItemAttributeValueParams params = new UpdateFeedItemAttributeValueParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedId = Long.parseLong("INSERT_FEED_ID_HERE");
      params.feedItemId = Long.parseLong("INSERT_FEED_ITEM_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new UpdateFeedItemAttributeValue()
          .runExample(googleAdsClient, params);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param params the UpdateFeedItemAttributeValueParams for the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, UpdateFeedItemAttributeValueParams params) {
    updateFeedItem(googleAdsClient, params);
  }

  /**
   * Updates flight price of the feed item. In order to update a FeedItemAttributeValue you must
   * update the FeedItem.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param params the UpdateFeedItemAttributeValueParams for the example.
   */
  private void updateFeedItem(
      GoogleAdsClient googleAdsClient, UpdateFeedItemAttributeValueParams params) {
    // Gets the feed resource name.
    String feedResourceName = ResourceNames.feed(params.customerId, params.feedId);

    // Gets a map of the placeholder values and feed attributes.
    Map<FlightPlaceholderField, FeedAttribute> feedAttributes =
        AddFlightsFeed.getFeed(googleAdsClient, params.customerId, feedResourceName);

    // Gets the ID of the flight price attribute. This is needed to specify which
    // FeedItemAttributeValue will be updated in the given FeedItem.
    int flightPriceId =
        (int) feedAttributes.get(FlightPlaceholderField.FLIGHT_PRICE).getId().getValue();
    // Gets the feed item resource name.
    String feedItemResourceName =
      ResourceNames.feedItem(params.customerId, params.feedId, params.feedItemId);
    // Retrieves the feed item and its associated attributes based on its resource name.
    FeedItem feedItem = getFeedItem(googleAdsClient, params.customerId, feedItemResourceName);
    // Creates the updated FeedItemAttributeValue.
    FeedItemAttributeValue feedItemAttributeValue =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(Int64Value.of(flightPriceId))
            .setStringValue(StringValue.of("699.99 USD"))
            .build();
    // Creates a new FeedItem from the existing FeedItem. Any FeedItemAttributeValues that are
    // not included in the updated FeedItem will be removed from the FeedItem, which is why you
    // must create the FeedItem from the existing FeedItem and set the field(s) that will be
    // updated.
    feedItem =
        feedItem.toBuilder()
            // Sets the attribute value of the FeedItem given its index relative to other attributes
            // in the FeedItem.
            .setAttributeValues(
                // Gets the index of the attribute value that will be updated.
                getAttributeIndex(feedItem, feedItemAttributeValue), feedItemAttributeValue)
            .build();

    // Creates the operation.
    FeedItemOperation operation =
        FeedItemOperation.newBuilder()
            .setUpdate(feedItem)
            .setUpdateMask(FieldMasks.allSetFieldsOf(feedItem))
            .build();

    // Creates the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Updates the feed item.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(
              Long.toString(params.customerId), ImmutableList.of(operation));
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Updated feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }

  /**
   * Retrieves a feed item and its attribute values given a resource name.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedItemResourceName feed item resource name.
   * @return FeedItem with the given resource name.
   */
  private FeedItem getFeedItem(
      GoogleAdsClient googleAdsClient, long customerId, String feedItemResourceName) {
    // Constructs the query.
    String query =
        "SELECT feed_item.attribute_values FROM feed_item WHERE feed_item.resource_name "
            + "= '"
            + feedItemResourceName
            + "'";

    // Constructs the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    // Issues the search request.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Returns the feed item attribute values.
      return searchPagedResponse.getPage().getResponse().getResults(0).getFeedItem();
    }
  }

  /**
   * Gets the ID of the flight price attribute. This is needed to specify which
   * FeedItemAttributeValue will be updated in the given FeedItem.
   *
   * @param feedItem the FeedItem that will be updated.
   * @param newFeedItemAttributeValue the new FeedItemAttributeValue that will be updated.
   * @return Int the index of the attribute.
   */
  private int getAttributeIndex(
      FeedItem feedItem, FeedItemAttributeValue newFeedItemAttributeValue) {
    int attributeIndex = 0;

    // Loops through attribute values to find the index of the FeedItemAttributeValue to update
    for (FeedItemAttributeValue feedItemAttributeValue : feedItem.getAttributeValuesList()) {
      // Checks if the current feedItemAttributeValue is the one we are updating
      if (feedItemAttributeValue.getFeedAttributeId().getValue()
          == newFeedItemAttributeValue.getFeedAttributeId().getValue()) {
        break;
      }
      attributeIndex++;
    }

    return attributeIndex;
  }
}
