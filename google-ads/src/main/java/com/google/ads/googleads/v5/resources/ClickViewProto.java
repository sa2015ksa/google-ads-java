// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/click_view.proto

package com.google.ads.googleads.v5.resources;

public final class ClickViewProto {
  private ClickViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ClickView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ClickView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v5/resources/clic" +
      "k_view.proto\022!google.ads.googleads.v5.re" +
      "sources\0323google/ads/googleads/v5/common/" +
      "click_location.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032\034google/api/annotations.proto\"\266\005\n\tClick" +
      "View\022A\n\rresource_name\030\001 \001(\tB*\340A\003\372A$\n\"goo" +
      "gleads.googleapis.com/ClickView\022\027\n\005gclid" +
      "\030\010 \001(\tB\003\340A\003H\000\210\001\001\022L\n\020area_of_interest\030\003 \001" +
      "(\0132-.google.ads.googleads.v5.common.Clic" +
      "kLocationB\003\340A\003\022P\n\024location_of_presence\030\004" +
      " \001(\0132-.google.ads.googleads.v5.common.Cl" +
      "ickLocationB\003\340A\003\022\035\n\013page_number\030\t \001(\003B\003\340" +
      "A\003H\001\210\001\001\022D\n\013ad_group_ad\030\n \001(\tB*\340A\003\372A$\n\"go" +
      "ogleads.googleapis.com/AdGroupAdH\002\210\001\001\022Y\n" +
      "\030campaign_location_target\030\013 \001(\tB2\340A\003\372A,\n" +
      "*googleads.googleapis.com/GeoTargetConst" +
      "antH\003\210\001\001\022A\n\tuser_list\030\014 \001(\tB)\340A\003\372A#\n!goo" +
      "gleads.googleapis.com/UserListH\004\210\001\001:U\352AR" +
      "\n\"googleads.googleapis.com/ClickView\022,cu" +
      "stomers/{customer}/clickViews/{click_vie" +
      "w}B\010\n\006_gclidB\016\n\014_page_numberB\016\n\014_ad_grou" +
      "p_adB\033\n\031_campaign_location_targetB\014\n\n_us" +
      "er_listB\373\001\n%com.google.ads.googleads.v5." +
      "resourcesB\016ClickViewProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v5/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V5.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V5\\Resources\352\002%Google::Ads::Goo" +
      "gleAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.ClickLocationProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_ClickView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ClickView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ClickView_descriptor,
        new java.lang.String[] { "ResourceName", "Gclid", "AreaOfInterest", "LocationOfPresence", "PageNumber", "AdGroupAd", "CampaignLocationTarget", "UserList", "Gclid", "PageNumber", "AdGroupAd", "CampaignLocationTarget", "UserList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.ClickLocationProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
