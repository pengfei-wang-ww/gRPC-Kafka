// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package com.ww.api.hs.messaging;

/**
 * Protobuf type {@code com.ww.api.hs.messaging.Event}
 */
public  final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ww.api.hs.messaging.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
    aggregateType_ = "";
    aggregateId_ = "";
    action_ = "";
    version_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            aggregateType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            aggregateId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            action_ = s;
            break;
          }
          case 32: {

            version_ = input.readInt32();
            break;
          }
          case 42: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (json_ != null) {
              subBuilder = json_.toBuilder();
            }
            json_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(json_);
              json_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            com.ww.api.hs.messaging.EventMetadata.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(com.ww.api.hs.messaging.EventMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ww.api.hs.messaging.Messaging.internal_static_com_ww_api_hs_messaging_Event_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ww.api.hs.messaging.Messaging.internal_static_com_ww_api_hs_messaging_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ww.api.hs.messaging.Event.class, com.ww.api.hs.messaging.Event.Builder.class);
  }

  public static final int AGGREGATE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object aggregateType_;
  /**
   * <pre>
   * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
   * </pre>
   *
   * <code>string aggregate_type = 1;</code>
   */
  public java.lang.String getAggregateType() {
    java.lang.Object ref = aggregateType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggregateType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
   * </pre>
   *
   * <code>string aggregate_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAggregateTypeBytes() {
    java.lang.Object ref = aggregateType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggregateType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGGREGATE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object aggregateId_;
  /**
   * <pre>
   * uuid, topic key in Kafka
   * </pre>
   *
   * <code>string aggregate_id = 2;</code>
   */
  public java.lang.String getAggregateId() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aggregateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * uuid, topic key in Kafka
   * </pre>
   *
   * <code>string aggregate_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAggregateIdBytes() {
    java.lang.Object ref = aggregateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aggregateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object action_;
  /**
   * <code>string action = 3;</code>
   */
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <code>string action = 3;</code>
   */
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private int version_;
  /**
   * <pre>
   * auto increment by aggregate_id
   * </pre>
   *
   * <code>int32 version = 4;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int JSON_FIELD_NUMBER = 5;
  private com.google.protobuf.Struct json_;
  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  public boolean hasJson() {
    return json_ != null;
  }
  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  public com.google.protobuf.Struct getJson() {
    return json_ == null ? com.google.protobuf.Struct.getDefaultInstance() : json_;
  }
  /**
   * <pre>
   * data in JSON format
   * </pre>
   *
   * <code>.google.protobuf.Struct json = 5;</code>
   */
  public com.google.protobuf.StructOrBuilder getJsonOrBuilder() {
    return getJson();
  }

  public static final int METADATA_FIELD_NUMBER = 6;
  private com.ww.api.hs.messaging.EventMetadata metadata_;
  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  public com.ww.api.hs.messaging.EventMetadata getMetadata() {
    return metadata_ == null ? com.ww.api.hs.messaging.EventMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
   */
  public com.ww.api.hs.messaging.EventMetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAggregateTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, aggregateType_);
    }
    if (!getAggregateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aggregateId_);
    }
    if (!getActionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, action_);
    }
    if (version_ != 0) {
      output.writeInt32(4, version_);
    }
    if (json_ != null) {
      output.writeMessage(5, getJson());
    }
    if (metadata_ != null) {
      output.writeMessage(6, getMetadata());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAggregateTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, aggregateType_);
    }
    if (!getAggregateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, aggregateId_);
    }
    if (!getActionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, action_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, version_);
    }
    if (json_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getJson());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getMetadata());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ww.api.hs.messaging.Event)) {
      return super.equals(obj);
    }
    com.ww.api.hs.messaging.Event other = (com.ww.api.hs.messaging.Event) obj;

    boolean result = true;
    result = result && getAggregateType()
        .equals(other.getAggregateType());
    result = result && getAggregateId()
        .equals(other.getAggregateId());
    result = result && getAction()
        .equals(other.getAction());
    result = result && (getVersion()
        == other.getVersion());
    result = result && (hasJson() == other.hasJson());
    if (hasJson()) {
      result = result && getJson()
          .equals(other.getJson());
    }
    result = result && (hasMetadata() == other.hasMetadata());
    if (hasMetadata()) {
      result = result && getMetadata()
          .equals(other.getMetadata());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AGGREGATE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAggregateType().hashCode();
    hash = (37 * hash) + AGGREGATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAggregateId().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    if (hasJson()) {
      hash = (37 * hash) + JSON_FIELD_NUMBER;
      hash = (53 * hash) + getJson().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ww.api.hs.messaging.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ww.api.hs.messaging.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ww.api.hs.messaging.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ww.api.hs.messaging.Event parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ww.api.hs.messaging.Event prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ww.api.hs.messaging.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ww.api.hs.messaging.Event)
      com.ww.api.hs.messaging.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ww.api.hs.messaging.Messaging.internal_static_com_ww_api_hs_messaging_Event_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ww.api.hs.messaging.Messaging.internal_static_com_ww_api_hs_messaging_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ww.api.hs.messaging.Event.class, com.ww.api.hs.messaging.Event.Builder.class);
    }

    // Construct using com.ww.api.hs.messaging.Event.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      aggregateType_ = "";

      aggregateId_ = "";

      action_ = "";

      version_ = 0;

      if (jsonBuilder_ == null) {
        json_ = null;
      } else {
        json_ = null;
        jsonBuilder_ = null;
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ww.api.hs.messaging.Messaging.internal_static_com_ww_api_hs_messaging_Event_descriptor;
    }

    public com.ww.api.hs.messaging.Event getDefaultInstanceForType() {
      return com.ww.api.hs.messaging.Event.getDefaultInstance();
    }

    public com.ww.api.hs.messaging.Event build() {
      com.ww.api.hs.messaging.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ww.api.hs.messaging.Event buildPartial() {
      com.ww.api.hs.messaging.Event result = new com.ww.api.hs.messaging.Event(this);
      result.aggregateType_ = aggregateType_;
      result.aggregateId_ = aggregateId_;
      result.action_ = action_;
      result.version_ = version_;
      if (jsonBuilder_ == null) {
        result.json_ = json_;
      } else {
        result.json_ = jsonBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ww.api.hs.messaging.Event) {
        return mergeFrom((com.ww.api.hs.messaging.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ww.api.hs.messaging.Event other) {
      if (other == com.ww.api.hs.messaging.Event.getDefaultInstance()) return this;
      if (!other.getAggregateType().isEmpty()) {
        aggregateType_ = other.aggregateType_;
        onChanged();
      }
      if (!other.getAggregateId().isEmpty()) {
        aggregateId_ = other.aggregateId_;
        onChanged();
      }
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.hasJson()) {
        mergeJson(other.getJson());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ww.api.hs.messaging.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ww.api.hs.messaging.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object aggregateType_ = "";
    /**
     * <pre>
     * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
     * </pre>
     *
     * <code>string aggregate_type = 1;</code>
     */
    public java.lang.String getAggregateType() {
      java.lang.Object ref = aggregateType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggregateType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
     * </pre>
     *
     * <code>string aggregate_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAggregateTypeBytes() {
      java.lang.Object ref = aggregateType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggregateType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
     * </pre>
     *
     * <code>string aggregate_type = 1;</code>
     */
    public Builder setAggregateType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggregateType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
     * </pre>
     *
     * <code>string aggregate_type = 1;</code>
     */
    public Builder clearAggregateType() {
      
      aggregateType_ = getDefaultInstance().getAggregateType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * in namespace format like: hs.event.&lt;aggregate&gt;, a topic in Kafka for a given domain aggregate
     * </pre>
     *
     * <code>string aggregate_type = 1;</code>
     */
    public Builder setAggregateTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggregateType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object aggregateId_ = "";
    /**
     * <pre>
     * uuid, topic key in Kafka
     * </pre>
     *
     * <code>string aggregate_id = 2;</code>
     */
    public java.lang.String getAggregateId() {
      java.lang.Object ref = aggregateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aggregateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * uuid, topic key in Kafka
     * </pre>
     *
     * <code>string aggregate_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAggregateIdBytes() {
      java.lang.Object ref = aggregateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aggregateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * uuid, topic key in Kafka
     * </pre>
     *
     * <code>string aggregate_id = 2;</code>
     */
    public Builder setAggregateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aggregateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * uuid, topic key in Kafka
     * </pre>
     *
     * <code>string aggregate_id = 2;</code>
     */
    public Builder clearAggregateId() {
      
      aggregateId_ = getDefaultInstance().getAggregateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * uuid, topic key in Kafka
     * </pre>
     *
     * <code>string aggregate_id = 2;</code>
     */
    public Builder setAggregateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aggregateId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object action_ = "";
    /**
     * <code>string action = 3;</code>
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string action = 3;</code>
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string action = 3;</code>
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string action = 3;</code>
     */
    public Builder clearAction() {
      
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <code>string action = 3;</code>
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      action_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * auto increment by aggregate_id
     * </pre>
     *
     * <code>int32 version = 4;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * auto increment by aggregate_id
     * </pre>
     *
     * <code>int32 version = 4;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * auto increment by aggregate_id
     * </pre>
     *
     * <code>int32 version = 4;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct json_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> jsonBuilder_;
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public boolean hasJson() {
      return jsonBuilder_ != null || json_ != null;
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public com.google.protobuf.Struct getJson() {
      if (jsonBuilder_ == null) {
        return json_ == null ? com.google.protobuf.Struct.getDefaultInstance() : json_;
      } else {
        return jsonBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public Builder setJson(com.google.protobuf.Struct value) {
      if (jsonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        json_ = value;
        onChanged();
      } else {
        jsonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public Builder setJson(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (jsonBuilder_ == null) {
        json_ = builderForValue.build();
        onChanged();
      } else {
        jsonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public Builder mergeJson(com.google.protobuf.Struct value) {
      if (jsonBuilder_ == null) {
        if (json_ != null) {
          json_ =
            com.google.protobuf.Struct.newBuilder(json_).mergeFrom(value).buildPartial();
        } else {
          json_ = value;
        }
        onChanged();
      } else {
        jsonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public Builder clearJson() {
      if (jsonBuilder_ == null) {
        json_ = null;
        onChanged();
      } else {
        json_ = null;
        jsonBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public com.google.protobuf.Struct.Builder getJsonBuilder() {
      
      onChanged();
      return getJsonFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    public com.google.protobuf.StructOrBuilder getJsonOrBuilder() {
      if (jsonBuilder_ != null) {
        return jsonBuilder_.getMessageOrBuilder();
      } else {
        return json_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : json_;
      }
    }
    /**
     * <pre>
     * data in JSON format
     * </pre>
     *
     * <code>.google.protobuf.Struct json = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getJsonFieldBuilder() {
      if (jsonBuilder_ == null) {
        jsonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getJson(),
                getParentForChildren(),
                isClean());
        json_ = null;
      }
      return jsonBuilder_;
    }

    private com.ww.api.hs.messaging.EventMetadata metadata_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ww.api.hs.messaging.EventMetadata, com.ww.api.hs.messaging.EventMetadata.Builder, com.ww.api.hs.messaging.EventMetadataOrBuilder> metadataBuilder_;
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public com.ww.api.hs.messaging.EventMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.ww.api.hs.messaging.EventMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public Builder setMetadata(com.ww.api.hs.messaging.EventMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public Builder setMetadata(
        com.ww.api.hs.messaging.EventMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public Builder mergeMetadata(com.ww.api.hs.messaging.EventMetadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            com.ww.api.hs.messaging.EventMetadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public com.ww.api.hs.messaging.EventMetadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    public com.ww.api.hs.messaging.EventMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.ww.api.hs.messaging.EventMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.com.ww.api.hs.messaging.EventMetadata metadata = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ww.api.hs.messaging.EventMetadata, com.ww.api.hs.messaging.EventMetadata.Builder, com.ww.api.hs.messaging.EventMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ww.api.hs.messaging.EventMetadata, com.ww.api.hs.messaging.EventMetadata.Builder, com.ww.api.hs.messaging.EventMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ww.api.hs.messaging.Event)
  }

  // @@protoc_insertion_point(class_scope:com.ww.api.hs.messaging.Event)
  private static final com.ww.api.hs.messaging.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ww.api.hs.messaging.Event();
  }

  public static com.ww.api.hs.messaging.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  public com.ww.api.hs.messaging.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

