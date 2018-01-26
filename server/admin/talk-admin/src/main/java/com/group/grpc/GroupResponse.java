// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package com.group.grpc;

/**
 * Protobuf type {@code com.group.grpc.GroupResponse}
 */
public  final class GroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.group.grpc.GroupResponse)
    GroupResponseOrBuilder {
  // Use GroupResponse.newBuilder() to construct.
  private GroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupResponse() {
    id_ = 0;
    name_ = "";
    creator_ = 0;
    userCnt_ = 0;
    statusId_ = 0;
    group_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GroupResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            creator_ = input.readInt32();
            break;
          }
          case 32: {

            userCnt_ = input.readInt32();
            break;
          }
          case 40: {

            statusId_ = input.readInt32();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              group_ = new java.util.ArrayList<com.group.grpc.Group>();
              mutable_bitField0_ |= 0x00000020;
            }
            group_.add(
                input.readMessage(com.group.grpc.Group.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        group_ = java.util.Collections.unmodifiableList(group_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.group.grpc.GroupOuterClass.internal_static_com_group_grpc_GroupResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.group.grpc.GroupOuterClass.internal_static_com_group_grpc_GroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.group.grpc.GroupResponse.class, com.group.grpc.GroupResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATOR_FIELD_NUMBER = 3;
  private int creator_;
  /**
   * <code>int32 creator = 3;</code>
   */
  public int getCreator() {
    return creator_;
  }

  public static final int USERCNT_FIELD_NUMBER = 4;
  private int userCnt_;
  /**
   * <code>int32 userCnt = 4;</code>
   */
  public int getUserCnt() {
    return userCnt_;
  }

  public static final int STATUS_ID_FIELD_NUMBER = 5;
  private int statusId_;
  /**
   * <code>int32 status_id = 5;</code>
   */
  public int getStatusId() {
    return statusId_;
  }

  public static final int GROUP_FIELD_NUMBER = 6;
  private java.util.List<com.group.grpc.Group> group_;
  /**
   * <code>repeated .com.group.grpc.Group group = 6;</code>
   */
  public java.util.List<com.group.grpc.Group> getGroupList() {
    return group_;
  }
  /**
   * <code>repeated .com.group.grpc.Group group = 6;</code>
   */
  public java.util.List<? extends com.group.grpc.GroupOrBuilder> 
      getGroupOrBuilderList() {
    return group_;
  }
  /**
   * <code>repeated .com.group.grpc.Group group = 6;</code>
   */
  public int getGroupCount() {
    return group_.size();
  }
  /**
   * <code>repeated .com.group.grpc.Group group = 6;</code>
   */
  public com.group.grpc.Group getGroup(int index) {
    return group_.get(index);
  }
  /**
   * <code>repeated .com.group.grpc.Group group = 6;</code>
   */
  public com.group.grpc.GroupOrBuilder getGroupOrBuilder(
      int index) {
    return group_.get(index);
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (creator_ != 0) {
      output.writeInt32(3, creator_);
    }
    if (userCnt_ != 0) {
      output.writeInt32(4, userCnt_);
    }
    if (statusId_ != 0) {
      output.writeInt32(5, statusId_);
    }
    for (int i = 0; i < group_.size(); i++) {
      output.writeMessage(6, group_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (creator_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, creator_);
    }
    if (userCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, userCnt_);
    }
    if (statusId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, statusId_);
    }
    for (int i = 0; i < group_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, group_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.group.grpc.GroupResponse)) {
      return super.equals(obj);
    }
    com.group.grpc.GroupResponse other = (com.group.grpc.GroupResponse) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getCreator()
        == other.getCreator());
    result = result && (getUserCnt()
        == other.getUserCnt());
    result = result && (getStatusId()
        == other.getStatusId());
    result = result && getGroupList()
        .equals(other.getGroupList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator();
    hash = (37 * hash) + USERCNT_FIELD_NUMBER;
    hash = (53 * hash) + getUserCnt();
    hash = (37 * hash) + STATUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStatusId();
    if (getGroupCount() > 0) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroupList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.group.grpc.GroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group.grpc.GroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group.grpc.GroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.group.grpc.GroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.group.grpc.GroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.group.grpc.GroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.group.grpc.GroupResponse parseFrom(
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
  public static Builder newBuilder(com.group.grpc.GroupResponse prototype) {
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
   * Protobuf type {@code com.group.grpc.GroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.group.grpc.GroupResponse)
      com.group.grpc.GroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.group.grpc.GroupOuterClass.internal_static_com_group_grpc_GroupResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.group.grpc.GroupOuterClass.internal_static_com_group_grpc_GroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.group.grpc.GroupResponse.class, com.group.grpc.GroupResponse.Builder.class);
    }

    // Construct using com.group.grpc.GroupResponse.newBuilder()
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
        getGroupFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      name_ = "";

      creator_ = 0;

      userCnt_ = 0;

      statusId_ = 0;

      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        groupBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.group.grpc.GroupOuterClass.internal_static_com_group_grpc_GroupResponse_descriptor;
    }

    public com.group.grpc.GroupResponse getDefaultInstanceForType() {
      return com.group.grpc.GroupResponse.getDefaultInstance();
    }

    public com.group.grpc.GroupResponse build() {
      com.group.grpc.GroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.group.grpc.GroupResponse buildPartial() {
      com.group.grpc.GroupResponse result = new com.group.grpc.GroupResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.creator_ = creator_;
      result.userCnt_ = userCnt_;
      result.statusId_ = statusId_;
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          group_ = java.util.Collections.unmodifiableList(group_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.group.grpc.GroupResponse) {
        return mergeFrom((com.group.grpc.GroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.group.grpc.GroupResponse other) {
      if (other == com.group.grpc.GroupResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getCreator() != 0) {
        setCreator(other.getCreator());
      }
      if (other.getUserCnt() != 0) {
        setUserCnt(other.getUserCnt());
      }
      if (other.getStatusId() != 0) {
        setStatusId(other.getStatusId());
      }
      if (groupBuilder_ == null) {
        if (!other.group_.isEmpty()) {
          if (group_.isEmpty()) {
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureGroupIsMutable();
            group_.addAll(other.group_);
          }
          onChanged();
        }
      } else {
        if (!other.group_.isEmpty()) {
          if (groupBuilder_.isEmpty()) {
            groupBuilder_.dispose();
            groupBuilder_ = null;
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000020);
            groupBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupFieldBuilder() : null;
          } else {
            groupBuilder_.addAllMessages(other.group_);
          }
        }
      }
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
      com.group.grpc.GroupResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.group.grpc.GroupResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int creator_ ;
    /**
     * <code>int32 creator = 3;</code>
     */
    public int getCreator() {
      return creator_;
    }
    /**
     * <code>int32 creator = 3;</code>
     */
    public Builder setCreator(int value) {
      
      creator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 creator = 3;</code>
     */
    public Builder clearCreator() {
      
      creator_ = 0;
      onChanged();
      return this;
    }

    private int userCnt_ ;
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public int getUserCnt() {
      return userCnt_;
    }
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public Builder setUserCnt(int value) {
      
      userCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public Builder clearUserCnt() {
      
      userCnt_ = 0;
      onChanged();
      return this;
    }

    private int statusId_ ;
    /**
     * <code>int32 status_id = 5;</code>
     */
    public int getStatusId() {
      return statusId_;
    }
    /**
     * <code>int32 status_id = 5;</code>
     */
    public Builder setStatusId(int value) {
      
      statusId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status_id = 5;</code>
     */
    public Builder clearStatusId() {
      
      statusId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.group.grpc.Group> group_ =
      java.util.Collections.emptyList();
    private void ensureGroupIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        group_ = new java.util.ArrayList<com.group.grpc.Group>(group_);
        bitField0_ |= 0x00000020;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.group.grpc.Group, com.group.grpc.Group.Builder, com.group.grpc.GroupOrBuilder> groupBuilder_;

    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public java.util.List<com.group.grpc.Group> getGroupList() {
      if (groupBuilder_ == null) {
        return java.util.Collections.unmodifiableList(group_);
      } else {
        return groupBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public int getGroupCount() {
      if (groupBuilder_ == null) {
        return group_.size();
      } else {
        return groupBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public com.group.grpc.Group getGroup(int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);
      } else {
        return groupBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder setGroup(
        int index, com.group.grpc.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.set(index, value);
        onChanged();
      } else {
        groupBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder setGroup(
        int index, com.group.grpc.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder addGroup(com.group.grpc.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
      } else {
        groupBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder addGroup(
        int index, com.group.grpc.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(index, value);
        onChanged();
      } else {
        groupBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder addGroup(
        com.group.grpc.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder addGroup(
        int index, com.group.grpc.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder addAllGroup(
        java.lang.Iterable<? extends com.group.grpc.Group> values) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, group_);
        onChanged();
      } else {
        groupBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        groupBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public Builder removeGroup(int index) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.remove(index);
        onChanged();
      } else {
        groupBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public com.group.grpc.Group.Builder getGroupBuilder(
        int index) {
      return getGroupFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public com.group.grpc.GroupOrBuilder getGroupOrBuilder(
        int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);  } else {
        return groupBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public java.util.List<? extends com.group.grpc.GroupOrBuilder> 
         getGroupOrBuilderList() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(group_);
      }
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public com.group.grpc.Group.Builder addGroupBuilder() {
      return getGroupFieldBuilder().addBuilder(
          com.group.grpc.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public com.group.grpc.Group.Builder addGroupBuilder(
        int index) {
      return getGroupFieldBuilder().addBuilder(
          index, com.group.grpc.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .com.group.grpc.Group group = 6;</code>
     */
    public java.util.List<com.group.grpc.Group.Builder> 
         getGroupBuilderList() {
      return getGroupFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.group.grpc.Group, com.group.grpc.Group.Builder, com.group.grpc.GroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.group.grpc.Group, com.group.grpc.Group.Builder, com.group.grpc.GroupOrBuilder>(
                group_,
                ((bitField0_ & 0x00000020) == 0x00000020),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.group.grpc.GroupResponse)
  }

  // @@protoc_insertion_point(class_scope:com.group.grpc.GroupResponse)
  private static final com.group.grpc.GroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.group.grpc.GroupResponse();
  }

  public static com.group.grpc.GroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<GroupResponse>() {
    public GroupResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GroupResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupResponse> getParserForType() {
    return PARSER;
  }

  public com.group.grpc.GroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

