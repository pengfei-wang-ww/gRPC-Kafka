/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ww.api.hs.messaging.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2054319526454568816L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.ww.api.hs.messaging.avro\",\"fields\":[{\"name\":\"aggregate_type\",\"type\":\"string\"},{\"name\":\"aggregate_id\",\"type\":\"string\"},{\"name\":\"action\",\"type\":\"string\"},{\"name\":\"version\",\"type\":\"int\"},{\"name\":\"json\",\"type\":\"string\"},{\"name\":\"metadata\",\"type\":{\"type\":\"record\",\"name\":\"EventMetadata\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"feedback_id\",\"type\":\"string\"},{\"name\":\"service\",\"type\":\"string\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Event> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Event to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Event from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Event instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence aggregate_type;
  @Deprecated public java.lang.CharSequence aggregate_id;
  @Deprecated public java.lang.CharSequence action;
  @Deprecated public int version;
  @Deprecated public java.lang.CharSequence json;
  @Deprecated public com.ww.api.hs.messaging.avro.EventMetadata metadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param aggregate_type The new value for aggregate_type
   * @param aggregate_id The new value for aggregate_id
   * @param action The new value for action
   * @param version The new value for version
   * @param json The new value for json
   * @param metadata The new value for metadata
   */
  public Event(java.lang.CharSequence aggregate_type, java.lang.CharSequence aggregate_id, java.lang.CharSequence action, java.lang.Integer version, java.lang.CharSequence json, com.ww.api.hs.messaging.avro.EventMetadata metadata) {
    this.aggregate_type = aggregate_type;
    this.aggregate_id = aggregate_id;
    this.action = action;
    this.version = version;
    this.json = json;
    this.metadata = metadata;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return aggregate_type;
    case 1: return aggregate_id;
    case 2: return action;
    case 3: return version;
    case 4: return json;
    case 5: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: aggregate_type = (java.lang.CharSequence)value$; break;
    case 1: aggregate_id = (java.lang.CharSequence)value$; break;
    case 2: action = (java.lang.CharSequence)value$; break;
    case 3: version = (java.lang.Integer)value$; break;
    case 4: json = (java.lang.CharSequence)value$; break;
    case 5: metadata = (com.ww.api.hs.messaging.avro.EventMetadata)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'aggregate_type' field.
   * @return The value of the 'aggregate_type' field.
   */
  public java.lang.CharSequence getAggregateType() {
    return aggregate_type;
  }


  /**
   * Sets the value of the 'aggregate_type' field.
   * @param value the value to set.
   */
  public void setAggregateType(java.lang.CharSequence value) {
    this.aggregate_type = value;
  }

  /**
   * Gets the value of the 'aggregate_id' field.
   * @return The value of the 'aggregate_id' field.
   */
  public java.lang.CharSequence getAggregateId() {
    return aggregate_id;
  }


  /**
   * Sets the value of the 'aggregate_id' field.
   * @param value the value to set.
   */
  public void setAggregateId(java.lang.CharSequence value) {
    this.aggregate_id = value;
  }

  /**
   * Gets the value of the 'action' field.
   * @return The value of the 'action' field.
   */
  public java.lang.CharSequence getAction() {
    return action;
  }


  /**
   * Sets the value of the 'action' field.
   * @param value the value to set.
   */
  public void setAction(java.lang.CharSequence value) {
    this.action = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public int getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(int value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'json' field.
   * @return The value of the 'json' field.
   */
  public java.lang.CharSequence getJson() {
    return json;
  }


  /**
   * Sets the value of the 'json' field.
   * @param value the value to set.
   */
  public void setJson(java.lang.CharSequence value) {
    this.json = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return The value of the 'metadata' field.
   */
  public com.ww.api.hs.messaging.avro.EventMetadata getMetadata() {
    return metadata;
  }


  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(com.ww.api.hs.messaging.avro.EventMetadata value) {
    this.metadata = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.ww.api.hs.messaging.avro.Event.Builder newBuilder() {
    return new com.ww.api.hs.messaging.avro.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.ww.api.hs.messaging.avro.Event.Builder newBuilder(com.ww.api.hs.messaging.avro.Event.Builder other) {
    if (other == null) {
      return new com.ww.api.hs.messaging.avro.Event.Builder();
    } else {
      return new com.ww.api.hs.messaging.avro.Event.Builder(other);
    }
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.ww.api.hs.messaging.avro.Event.Builder newBuilder(com.ww.api.hs.messaging.avro.Event other) {
    if (other == null) {
      return new com.ww.api.hs.messaging.avro.Event.Builder();
    } else {
      return new com.ww.api.hs.messaging.avro.Event.Builder(other);
    }
  }

  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.CharSequence aggregate_type;
    private java.lang.CharSequence aggregate_id;
    private java.lang.CharSequence action;
    private int version;
    private java.lang.CharSequence json;
    private com.ww.api.hs.messaging.avro.EventMetadata metadata;
    private com.ww.api.hs.messaging.avro.EventMetadata.Builder metadataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ww.api.hs.messaging.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.aggregate_type)) {
        this.aggregate_type = data().deepCopy(fields()[0].schema(), other.aggregate_type);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.aggregate_id)) {
        this.aggregate_id = data().deepCopy(fields()[1].schema(), other.aggregate_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.action)) {
        this.action = data().deepCopy(fields()[2].schema(), other.action);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.json)) {
        this.json = data().deepCopy(fields()[4].schema(), other.json);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.metadata)) {
        this.metadata = data().deepCopy(fields()[5].schema(), other.metadata);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasMetadataBuilder()) {
        this.metadataBuilder = com.ww.api.hs.messaging.avro.EventMetadata.newBuilder(other.getMetadataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ww.api.hs.messaging.avro.Event other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.aggregate_type)) {
        this.aggregate_type = data().deepCopy(fields()[0].schema(), other.aggregate_type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.aggregate_id)) {
        this.aggregate_id = data().deepCopy(fields()[1].schema(), other.aggregate_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.action)) {
        this.action = data().deepCopy(fields()[2].schema(), other.action);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.json)) {
        this.json = data().deepCopy(fields()[4].schema(), other.json);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.metadata)) {
        this.metadata = data().deepCopy(fields()[5].schema(), other.metadata);
        fieldSetFlags()[5] = true;
      }
      this.metadataBuilder = null;
    }

    /**
      * Gets the value of the 'aggregate_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getAggregateType() {
      return aggregate_type;
    }


    /**
      * Sets the value of the 'aggregate_type' field.
      * @param value The value of 'aggregate_type'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setAggregateType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.aggregate_type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'aggregate_type' field has been set.
      * @return True if the 'aggregate_type' field has been set, false otherwise.
      */
    public boolean hasAggregateType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'aggregate_type' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearAggregateType() {
      aggregate_type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'aggregate_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getAggregateId() {
      return aggregate_id;
    }


    /**
      * Sets the value of the 'aggregate_id' field.
      * @param value The value of 'aggregate_id'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setAggregateId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.aggregate_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'aggregate_id' field has been set.
      * @return True if the 'aggregate_id' field has been set, false otherwise.
      */
    public boolean hasAggregateId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'aggregate_id' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearAggregateId() {
      aggregate_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'action' field.
      * @return The value.
      */
    public java.lang.CharSequence getAction() {
      return action;
    }


    /**
      * Sets the value of the 'action' field.
      * @param value The value of 'action'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setAction(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.action = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearAction() {
      action = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public int getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setVersion(int value) {
      validate(fields()[3], value);
      this.version = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearVersion() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'json' field.
      * @return The value.
      */
    public java.lang.CharSequence getJson() {
      return json;
    }


    /**
      * Sets the value of the 'json' field.
      * @param value The value of 'json'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setJson(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.json = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'json' field has been set.
      * @return True if the 'json' field has been set, false otherwise.
      */
    public boolean hasJson() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'json' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearJson() {
      json = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'metadata' field.
      * @return The value.
      */
    public com.ww.api.hs.messaging.avro.EventMetadata getMetadata() {
      return metadata;
    }


    /**
      * Sets the value of the 'metadata' field.
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder setMetadata(com.ww.api.hs.messaging.avro.EventMetadata value) {
      validate(fields()[5], value);
      this.metadataBuilder = null;
      this.metadata = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'metadata' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.ww.api.hs.messaging.avro.EventMetadata.Builder getMetadataBuilder() {
      if (metadataBuilder == null) {
        if (hasMetadata()) {
          setMetadataBuilder(com.ww.api.hs.messaging.avro.EventMetadata.newBuilder(metadata));
        } else {
          setMetadataBuilder(com.ww.api.hs.messaging.avro.EventMetadata.newBuilder());
        }
      }
      return metadataBuilder;
    }

    /**
     * Sets the Builder instance for the 'metadata' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.ww.api.hs.messaging.avro.Event.Builder setMetadataBuilder(com.ww.api.hs.messaging.avro.EventMetadata.Builder value) {
      clearMetadata();
      metadataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'metadata' field has an active Builder instance
     * @return True if the 'metadata' field has an active Builder instance
     */
    public boolean hasMetadataBuilder() {
      return metadataBuilder != null;
    }

    /**
      * Clears the value of the 'metadata' field.
      * @return This builder.
      */
    public com.ww.api.hs.messaging.avro.Event.Builder clearMetadata() {
      metadata = null;
      metadataBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.aggregate_type = fieldSetFlags()[0] ? this.aggregate_type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.aggregate_id = fieldSetFlags()[1] ? this.aggregate_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.action = fieldSetFlags()[2] ? this.action : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.version = fieldSetFlags()[3] ? this.version : (java.lang.Integer) defaultValue(fields()[3]);
        record.json = fieldSetFlags()[4] ? this.json : (java.lang.CharSequence) defaultValue(fields()[4]);
        if (metadataBuilder != null) {
          try {
            record.metadata = this.metadataBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("metadata"));
            throw e;
          }
        } else {
          record.metadata = fieldSetFlags()[5] ? this.metadata : (com.ww.api.hs.messaging.avro.EventMetadata) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.aggregate_type);

    out.writeString(this.aggregate_id);

    out.writeString(this.action);

    out.writeInt(this.version);

    out.writeString(this.json);

    this.metadata.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.aggregate_type = in.readString(this.aggregate_type instanceof Utf8 ? (Utf8)this.aggregate_type : null);

      this.aggregate_id = in.readString(this.aggregate_id instanceof Utf8 ? (Utf8)this.aggregate_id : null);

      this.action = in.readString(this.action instanceof Utf8 ? (Utf8)this.action : null);

      this.version = in.readInt();

      this.json = in.readString(this.json instanceof Utf8 ? (Utf8)this.json : null);

      if (this.metadata == null) {
        this.metadata = new com.ww.api.hs.messaging.avro.EventMetadata();
      }
      this.metadata.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.aggregate_type = in.readString(this.aggregate_type instanceof Utf8 ? (Utf8)this.aggregate_type : null);
          break;

        case 1:
          this.aggregate_id = in.readString(this.aggregate_id instanceof Utf8 ? (Utf8)this.aggregate_id : null);
          break;

        case 2:
          this.action = in.readString(this.action instanceof Utf8 ? (Utf8)this.action : null);
          break;

        case 3:
          this.version = in.readInt();
          break;

        case 4:
          this.json = in.readString(this.json instanceof Utf8 ? (Utf8)this.json : null);
          break;

        case 5:
          if (this.metadata == null) {
            this.metadata = new com.ww.api.hs.messaging.avro.EventMetadata();
          }
          this.metadata.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










