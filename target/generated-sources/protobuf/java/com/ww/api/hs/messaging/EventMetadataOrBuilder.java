// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package com.ww.api.hs.messaging;

public interface EventMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ww.api.hs.messaging.EventMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 timestamp = 1;</code>
   */
  long getTimestamp();

  /**
   * <pre>
   * uuid for tracking feedback
   * </pre>
   *
   * <code>string feedback_id = 2;</code>
   */
  java.lang.String getFeedbackId();
  /**
   * <pre>
   * uuid for tracking feedback
   * </pre>
   *
   * <code>string feedback_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getFeedbackIdBytes();

  /**
   * <pre>
   * from which service the event is created. in namespace format with docker image:version
   * </pre>
   *
   * <code>string service = 3;</code>
   */
  java.lang.String getService();
  /**
   * <pre>
   * from which service the event is created. in namespace format with docker image:version
   * </pre>
   *
   * <code>string service = 3;</code>
   */
  com.google.protobuf.ByteString
      getServiceBytes();
}
