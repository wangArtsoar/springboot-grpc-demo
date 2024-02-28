// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet.proto

// Protobuf Java Version: 3.25.1
package com.example;

/**
 * Protobuf type {@code com.example.GreetingResponseList}
 */
public final class GreetingResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.GreetingResponseList)
    GreetingResponseListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetingResponseList.newBuilder() to construct.
  private GreetingResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetingResponseList() {
    messageList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GreetingResponseList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.Greet.internal_static_com_example_GreetingResponseList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.Greet.internal_static_com_example_GreetingResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.GreetingResponseList.class, com.example.GreetingResponseList.Builder.class);
  }

  public static final int MESSAGELIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList messageList_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string messageList = 1;</code>
   * @return A list containing the messageList.
   */
  public com.google.protobuf.ProtocolStringList
      getMessageListList() {
    return messageList_;
  }
  /**
   * <code>repeated string messageList = 1;</code>
   * @return The count of messageList.
   */
  public int getMessageListCount() {
    return messageList_.size();
  }
  /**
   * <code>repeated string messageList = 1;</code>
   * @param index The index of the element to return.
   * @return The messageList at the given index.
   */
  public java.lang.String getMessageList(int index) {
    return messageList_.get(index);
  }
  /**
   * <code>repeated string messageList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the messageList at the given index.
   */
  public com.google.protobuf.ByteString
      getMessageListBytes(int index) {
    return messageList_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < messageList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageList_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < messageList_.size(); i++) {
        dataSize += computeStringSizeNoTag(messageList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessageListList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.GreetingResponseList)) {
      return super.equals(obj);
    }
    com.example.GreetingResponseList other = (com.example.GreetingResponseList) obj;

    if (!getMessageListList()
        .equals(other.getMessageListList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMessageListCount() > 0) {
      hash = (37 * hash) + MESSAGELIST_FIELD_NUMBER;
      hash = (53 * hash) + getMessageListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.GreetingResponseList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.GreetingResponseList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.GreetingResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.GreetingResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.GreetingResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.GreetingResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.GreetingResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.GreetingResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.GreetingResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.GreetingResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.GreetingResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.GreetingResponseList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.GreetingResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.example.GreetingResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.GreetingResponseList)
      com.example.GreetingResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.Greet.internal_static_com_example_GreetingResponseList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.Greet.internal_static_com_example_GreetingResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.GreetingResponseList.class, com.example.GreetingResponseList.Builder.class);
    }

    // Construct using com.example.GreetingResponseList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      messageList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.Greet.internal_static_com_example_GreetingResponseList_descriptor;
    }

    @java.lang.Override
    public com.example.GreetingResponseList getDefaultInstanceForType() {
      return com.example.GreetingResponseList.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.GreetingResponseList build() {
      com.example.GreetingResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.GreetingResponseList buildPartial() {
      com.example.GreetingResponseList result = new com.example.GreetingResponseList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.GreetingResponseList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        messageList_.makeImmutable();
        result.messageList_ = messageList_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.GreetingResponseList) {
        return mergeFrom((com.example.GreetingResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.GreetingResponseList other) {
      if (other == com.example.GreetingResponseList.getDefaultInstance()) return this;
      if (!other.messageList_.isEmpty()) {
        if (messageList_.isEmpty()) {
          messageList_ = other.messageList_;
          bitField0_ |= 0x00000001;
        } else {
          ensureMessageListIsMutable();
          messageList_.addAll(other.messageList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureMessageListIsMutable();
              messageList_.add(s);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList messageList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureMessageListIsMutable() {
      if (!messageList_.isModifiable()) {
        messageList_ = new com.google.protobuf.LazyStringArrayList(messageList_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @return A list containing the messageList.
     */
    public com.google.protobuf.ProtocolStringList
        getMessageListList() {
      messageList_.makeImmutable();
      return messageList_;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @return The count of messageList.
     */
    public int getMessageListCount() {
      return messageList_.size();
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param index The index of the element to return.
     * @return The messageList at the given index.
     */
    public java.lang.String getMessageList(int index) {
      return messageList_.get(index);
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the messageList at the given index.
     */
    public com.google.protobuf.ByteString
        getMessageListBytes(int index) {
      return messageList_.getByteString(index);
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param index The index to set the value at.
     * @param value The messageList to set.
     * @return This builder for chaining.
     */
    public Builder setMessageList(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMessageListIsMutable();
      messageList_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param value The messageList to add.
     * @return This builder for chaining.
     */
    public Builder addMessageList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMessageListIsMutable();
      messageList_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param values The messageList to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessageList(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessageListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, messageList_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageList() {
      messageList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messageList = 1;</code>
     * @param value The bytes of the messageList to add.
     * @return This builder for chaining.
     */
    public Builder addMessageListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureMessageListIsMutable();
      messageList_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.GreetingResponseList)
  }

  // @@protoc_insertion_point(class_scope:com.example.GreetingResponseList)
  private static final com.example.GreetingResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.GreetingResponseList();
  }

  public static com.example.GreetingResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetingResponseList>
      PARSER = new com.google.protobuf.AbstractParser<GreetingResponseList>() {
    @java.lang.Override
    public GreetingResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GreetingResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetingResponseList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.GreetingResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

