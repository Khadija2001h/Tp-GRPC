// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.emsi.tpgrpcbanque.stubs;

/**
 * <pre>
 * Response containing accounts of the specified type
 * </pre>
 *
 * Protobuf type {@code GetComptesByTypeResponse}
 */
public  final class GetComptesByTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetComptesByTypeResponse)
    GetComptesByTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetComptesByTypeResponse.newBuilder() to construct.
  private GetComptesByTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetComptesByTypeResponse() {
    comptes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetComptesByTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetComptesByTypeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              comptes_ = new java.util.ArrayList<ma.emsi.tpgrpcbanque.stubs.Compte>();
              mutable_bitField0_ |= 0x00000001;
            }
            comptes_.add(
                input.readMessage(ma.emsi.tpgrpcbanque.stubs.Compte.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        comptes_ = java.util.Collections.unmodifiableList(comptes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.class, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.Builder.class);
  }

  public static final int COMPTES_FIELD_NUMBER = 1;
  private java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte> comptes_;
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  public java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte> getComptesList() {
    return comptes_;
  }
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  public java.util.List<? extends ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder> 
      getComptesOrBuilderList() {
    return comptes_;
  }
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  public int getComptesCount() {
    return comptes_.size();
  }
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  public ma.emsi.tpgrpcbanque.stubs.Compte getComptes(int index) {
    return comptes_.get(index);
  }
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  public ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder getComptesOrBuilder(
      int index) {
    return comptes_.get(index);
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
    for (int i = 0; i < comptes_.size(); i++) {
      output.writeMessage(1, comptes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < comptes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, comptes_.get(i));
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
    if (!(obj instanceof ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse)) {
      return super.equals(obj);
    }
    ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse other = (ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse) obj;

    if (!getComptesList()
        .equals(other.getComptesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getComptesCount() > 0) {
      hash = (37 * hash) + COMPTES_FIELD_NUMBER;
      hash = (53 * hash) + getComptesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parseFrom(
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
  public static Builder newBuilder(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse prototype) {
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
   * <pre>
   * Response containing accounts of the specified type
   * </pre>
   *
   * Protobuf type {@code GetComptesByTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetComptesByTypeResponse)
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.class, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.Builder.class);
    }

    // Construct using ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.newBuilder()
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
        getComptesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (comptesBuilder_ == null) {
        comptes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        comptesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeResponse_descriptor;
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse getDefaultInstanceForType() {
      return ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse build() {
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse buildPartial() {
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse result = new ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse(this);
      int from_bitField0_ = bitField0_;
      if (comptesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          comptes_ = java.util.Collections.unmodifiableList(comptes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.comptes_ = comptes_;
      } else {
        result.comptes_ = comptesBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse) {
        return mergeFrom((ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse other) {
      if (other == ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse.getDefaultInstance()) return this;
      if (comptesBuilder_ == null) {
        if (!other.comptes_.isEmpty()) {
          if (comptes_.isEmpty()) {
            comptes_ = other.comptes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureComptesIsMutable();
            comptes_.addAll(other.comptes_);
          }
          onChanged();
        }
      } else {
        if (!other.comptes_.isEmpty()) {
          if (comptesBuilder_.isEmpty()) {
            comptesBuilder_.dispose();
            comptesBuilder_ = null;
            comptes_ = other.comptes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            comptesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getComptesFieldBuilder() : null;
          } else {
            comptesBuilder_.addAllMessages(other.comptes_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte> comptes_ =
      java.util.Collections.emptyList();
    private void ensureComptesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        comptes_ = new java.util.ArrayList<ma.emsi.tpgrpcbanque.stubs.Compte>(comptes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ma.emsi.tpgrpcbanque.stubs.Compte, ma.emsi.tpgrpcbanque.stubs.Compte.Builder, ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder> comptesBuilder_;

    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte> getComptesList() {
      if (comptesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(comptes_);
      } else {
        return comptesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public int getComptesCount() {
      if (comptesBuilder_ == null) {
        return comptes_.size();
      } else {
        return comptesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public ma.emsi.tpgrpcbanque.stubs.Compte getComptes(int index) {
      if (comptesBuilder_ == null) {
        return comptes_.get(index);
      } else {
        return comptesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder setComptes(
        int index, ma.emsi.tpgrpcbanque.stubs.Compte value) {
      if (comptesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComptesIsMutable();
        comptes_.set(index, value);
        onChanged();
      } else {
        comptesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder setComptes(
        int index, ma.emsi.tpgrpcbanque.stubs.Compte.Builder builderForValue) {
      if (comptesBuilder_ == null) {
        ensureComptesIsMutable();
        comptes_.set(index, builderForValue.build());
        onChanged();
      } else {
        comptesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder addComptes(ma.emsi.tpgrpcbanque.stubs.Compte value) {
      if (comptesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComptesIsMutable();
        comptes_.add(value);
        onChanged();
      } else {
        comptesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder addComptes(
        int index, ma.emsi.tpgrpcbanque.stubs.Compte value) {
      if (comptesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComptesIsMutable();
        comptes_.add(index, value);
        onChanged();
      } else {
        comptesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder addComptes(
        ma.emsi.tpgrpcbanque.stubs.Compte.Builder builderForValue) {
      if (comptesBuilder_ == null) {
        ensureComptesIsMutable();
        comptes_.add(builderForValue.build());
        onChanged();
      } else {
        comptesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder addComptes(
        int index, ma.emsi.tpgrpcbanque.stubs.Compte.Builder builderForValue) {
      if (comptesBuilder_ == null) {
        ensureComptesIsMutable();
        comptes_.add(index, builderForValue.build());
        onChanged();
      } else {
        comptesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder addAllComptes(
        java.lang.Iterable<? extends ma.emsi.tpgrpcbanque.stubs.Compte> values) {
      if (comptesBuilder_ == null) {
        ensureComptesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, comptes_);
        onChanged();
      } else {
        comptesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder clearComptes() {
      if (comptesBuilder_ == null) {
        comptes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        comptesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public Builder removeComptes(int index) {
      if (comptesBuilder_ == null) {
        ensureComptesIsMutable();
        comptes_.remove(index);
        onChanged();
      } else {
        comptesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public ma.emsi.tpgrpcbanque.stubs.Compte.Builder getComptesBuilder(
        int index) {
      return getComptesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder getComptesOrBuilder(
        int index) {
      if (comptesBuilder_ == null) {
        return comptes_.get(index);  } else {
        return comptesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public java.util.List<? extends ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder> 
         getComptesOrBuilderList() {
      if (comptesBuilder_ != null) {
        return comptesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(comptes_);
      }
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public ma.emsi.tpgrpcbanque.stubs.Compte.Builder addComptesBuilder() {
      return getComptesFieldBuilder().addBuilder(
          ma.emsi.tpgrpcbanque.stubs.Compte.getDefaultInstance());
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public ma.emsi.tpgrpcbanque.stubs.Compte.Builder addComptesBuilder(
        int index) {
      return getComptesFieldBuilder().addBuilder(
          index, ma.emsi.tpgrpcbanque.stubs.Compte.getDefaultInstance());
    }
    /**
     * <code>repeated .Compte comptes = 1;</code>
     */
    public java.util.List<ma.emsi.tpgrpcbanque.stubs.Compte.Builder> 
         getComptesBuilderList() {
      return getComptesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ma.emsi.tpgrpcbanque.stubs.Compte, ma.emsi.tpgrpcbanque.stubs.Compte.Builder, ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder> 
        getComptesFieldBuilder() {
      if (comptesBuilder_ == null) {
        comptesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ma.emsi.tpgrpcbanque.stubs.Compte, ma.emsi.tpgrpcbanque.stubs.Compte.Builder, ma.emsi.tpgrpcbanque.stubs.CompteOrBuilder>(
                comptes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        comptes_ = null;
      }
      return comptesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetComptesByTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:GetComptesByTypeResponse)
  private static final ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse();
  }

  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetComptesByTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetComptesByTypeResponse>() {
    @java.lang.Override
    public GetComptesByTypeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetComptesByTypeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetComptesByTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetComptesByTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

