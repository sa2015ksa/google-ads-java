// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/ad_type_infos.proto

package com.google.ads.googleads.v2.common;

public interface VideoAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.VideoAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The MediaFile resource to use for the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   * @return Whether the mediaFile field is set.
   */
  boolean hasMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   * @return The mediaFile.
   */
  com.google.protobuf.StringValue getMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue media_file = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMediaFileOrBuilder();

  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   * @return Whether the inStream field is set.
   */
  boolean hasInStream();
  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   * @return The inStream.
   */
  com.google.ads.googleads.v2.common.VideoTrueViewInStreamAdInfo getInStream();
  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   */
  com.google.ads.googleads.v2.common.VideoTrueViewInStreamAdInfoOrBuilder getInStreamOrBuilder();

  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   * @return Whether the bumper field is set.
   */
  boolean hasBumper();
  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   * @return The bumper.
   */
  com.google.ads.googleads.v2.common.VideoBumperInStreamAdInfo getBumper();
  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   */
  com.google.ads.googleads.v2.common.VideoBumperInStreamAdInfoOrBuilder getBumperOrBuilder();

  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoOutstreamAdInfo out_stream = 4;</code>
   * @return Whether the outStream field is set.
   */
  boolean hasOutStream();
  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoOutstreamAdInfo out_stream = 4;</code>
   * @return The outStream.
   */
  com.google.ads.googleads.v2.common.VideoOutstreamAdInfo getOutStream();
  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoOutstreamAdInfo out_stream = 4;</code>
   */
  com.google.ads.googleads.v2.common.VideoOutstreamAdInfoOrBuilder getOutStreamOrBuilder();

  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   * @return Whether the nonSkippable field is set.
   */
  boolean hasNonSkippable();
  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   * @return The nonSkippable.
   */
  com.google.ads.googleads.v2.common.VideoNonSkippableInStreamAdInfo getNonSkippable();
  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   */
  com.google.ads.googleads.v2.common.VideoNonSkippableInStreamAdInfoOrBuilder getNonSkippableOrBuilder();

  public com.google.ads.googleads.v2.common.VideoAdInfo.FormatCase getFormatCase();
}
