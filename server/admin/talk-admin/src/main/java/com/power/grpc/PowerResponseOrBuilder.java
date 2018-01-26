// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: power.proto

package com.power.grpc;

public interface PowerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.power.grpc.PowerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 10;</code>
   */
  int getId();

  /**
   * <code>int32 power_id = 4;</code>
   */
  int getPowerId();

  /**
   * <code>string power_name = 1;</code>
   */
  java.lang.String getPowerName();
  /**
   * <code>string power_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getPowerNameBytes();

  /**
   * <code>string power_url = 2;</code>
   */
  java.lang.String getPowerUrl();
  /**
   * <code>string power_url = 2;</code>
   */
  com.google.protobuf.ByteString
      getPowerUrlBytes();

  /**
   * <code>int32 parent_id = 3;</code>
   */
  int getParentId();

  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  java.util.List<com.power.grpc.Power> 
      getPowerList();
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  com.power.grpc.Power getPower(int index);
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  int getPowerCount();
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  java.util.List<? extends com.power.grpc.PowerOrBuilder> 
      getPowerOrBuilderList();
  /**
   * <code>repeated .com.power.grpc.Power power = 5;</code>
   */
  com.power.grpc.PowerOrBuilder getPowerOrBuilder(
      int index);

  /**
   * <code>int32 status_id = 6;</code>
   */
  int getStatusId();
}
