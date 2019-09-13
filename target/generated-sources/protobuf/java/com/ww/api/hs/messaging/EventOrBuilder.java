// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package com.ww.api.hs.messaging;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ww.api.hs.messaging.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
   * </pre>
   *
   * <code>string aggregate_type = 1;</code>
   */
  java.lang.String getAggregateType();
  /**
   * <pre>
   * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
   * </pre>
   *
   * <code>string aggregate_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getAggregateTypeBytes();

  /**
   * <pre>
   * uuid, topic key in Kafka
   * </pre>
   *
   * <code>string aggregate_id = 2;</code>
   */
  java.lang.String getAggregateId();
  /**
   * <pre>
   * uuid, topic key in Kafka
   * </pre>
   *
   * <code>string aggregate_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getAggregateIdBytes();

  /**
   * <code>string action = 3;</code>
   */
  java.lang.String getAction();
  /**
   * <code>string action = 3;</code>
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * auto increment by aggregate_id
   * </pre>
   *
   * <code>int32 version = 4;</code>
   */
  int getVersion();

  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  boolean hasJson();
  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  com.google.protobuf.Struct getJson();
  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getJsonOrBuilder();

  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  boolean hasMetadata();
  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  com.ww.api.hs.messaging.EventMetadata getMetadata();
  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  com.ww.api.hs.messaging.EventMetadataOrBuilder getMetadataOrBuilder();
}
