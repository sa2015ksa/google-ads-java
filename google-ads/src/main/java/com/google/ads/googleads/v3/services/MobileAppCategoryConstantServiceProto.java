// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/mobile_app_category_constant_service.proto

package com.google.ads.googleads.v3.services;

public final class MobileAppCategoryConstantServiceProto {
  private MobileAppCategoryConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetMobileAppCategoryConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v3/services/mobil" +
      "e_app_category_constant_service.proto\022 g" +
      "oogle.ads.googleads.v3.services\032Dgoogle/" +
      "ads/googleads/v3/resources/mobile_app_ca" +
      "tegory_constant.proto\032\034google/api/annota" +
      "tions.proto\032\027google/api/client.proto\032\037go" +
      "ogle/api/field_behavior.proto\"A\n#GetMobi" +
      "leAppCategoryConstantRequest\022\032\n\rresource" +
      "_name\030\001 \001(\tB\003\340A\0022\257\002\n MobileAppCategoryCo" +
      "nstantService\022\355\001\n\034GetMobileAppCategoryCo" +
      "nstant\022E.google.ads.googleads.v3.service" +
      "s.GetMobileAppCategoryConstantRequest\032<." +
      "google.ads.googleads.v3.resources.Mobile" +
      "AppCategoryConstant\"H\202\323\344\223\0022\0220/v3/{resour" +
      "ce_name=mobileAppCategoryConstants/*}\332A\r" +
      "resource_name\032\033\312A\030googleads.googleapis.c" +
      "omB\214\002\n$com.google.ads.googleads.v3.servi" +
      "cesB%MobileAppCategoryConstantServicePro" +
      "toP\001ZHgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v3/services;services\242\002" +
      "\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312" +
      "\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Goo" +
      "gle::Ads::GoogleAds::V3::Servicesb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.resources.MobileAppCategoryConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetMobileAppCategoryConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetMobileAppCategoryConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetMobileAppCategoryConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.MobileAppCategoryConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}