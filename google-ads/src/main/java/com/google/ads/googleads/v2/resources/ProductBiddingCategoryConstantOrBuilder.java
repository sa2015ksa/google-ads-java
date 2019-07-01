// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/product_bidding_category_constant.proto

package com.google.ads.googleads.v2.resources;

public interface ProductBiddingCategoryConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.ProductBiddingCategoryConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the product bidding category.
   * Product bidding category resource names have the form:
   * `productBiddingCategoryConstants/{country_code}~{level}~{id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the product bidding category.
   * Product bidding category resource names have the form:
   * `productBiddingCategoryConstants/{country_code}~{level}~{id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * ID of the product bidding category.
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 3;</code>
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 3;</code>
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Two-letter upper-case country code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_bidding_category_constant_parent = 4;</code>
   */
  boolean hasProductBiddingCategoryConstantParent();
  /**
   * <pre>
   * Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_bidding_category_constant_parent = 4;</code>
   */
  com.google.protobuf.StringValue getProductBiddingCategoryConstantParent();
  /**
   * <pre>
   * Resource name of the parent product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue product_bidding_category_constant_parent = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getProductBiddingCategoryConstantParentOrBuilder();

  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 5;</code>
   */
  int getLevelValue();
  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 5;</code>
   */
  com.google.ads.googleads.v2.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel getLevel();

  /**
   * <pre>
   * Status of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus status = 6;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus status = 6;</code>
   */
  com.google.ads.googleads.v2.enums.ProductBiddingCategoryStatusEnum.ProductBiddingCategoryStatus getStatus();

  /**
   * <pre>
   * Language code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 7;</code>
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * Language code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 7;</code>
   */
  com.google.protobuf.StringValue getLanguageCode();
  /**
   * <pre>
   * Language code of the product bidding category.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageCodeOrBuilder();

  /**
   * <pre>
   * Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue localized_name = 8;</code>
   */
  boolean hasLocalizedName();
  /**
   * <pre>
   * Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue localized_name = 8;</code>
   */
  com.google.protobuf.StringValue getLocalizedName();
  /**
   * <pre>
   * Display value of the product bidding category localized according to
   * language_code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue localized_name = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLocalizedNameOrBuilder();
}