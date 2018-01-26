// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manager.proto

package com.manager.grpc;

public final class ManagerOuterClass {
  private ManagerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manager_grpc_Manager_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manager_grpc_Manager_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manager_grpc_ManagerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manager_grpc_ManagerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_manager_grpc_ManagerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_manager_grpc_ManagerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmanager.proto\022\020com.manager.grpc\"n\n\007Man" +
      "ager\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022\020\n\010pa" +
      "ssword\030\003 \001(\t\022\r\n\005token\030\006 \001(\t\022\024\n\014introduct" +
      "ion\030\007 \001(\t\022\016\n\006avatar\030\010 \001(\t\"\262\001\n\016ManagerReq" +
      "uest\022\017\n\007role_id\030\007 \003(\005\022\n\n\002id\030\001 \001(\005\022\020\n\010use" +
      "rname\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\r\n\005token\030\004" +
      " \001(\t\022\024\n\014introduction\030\t \001(\t\022\016\n\006avatar\030\010 \001" +
      "(\t\022*\n\007manager\030\005 \003(\0132\031.com.manager.grpc.M" +
      "anager\"\306\001\n\017ManagerResponse\022\017\n\007role_id\030\007 " +
      "\003(\005\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022\020\n\010pas",
      "sword\030\003 \001(\t\022\021\n\tstatus_id\030\004 \001(\005\022\r\n\005token\030" +
      "\006 \001(\t\022\024\n\014introduction\030\t \001(\t\022\016\n\006avatar\030\010 " +
      "\001(\t\022*\n\007manager\030\005 \003(\0132\031.com.manager.grpc." +
      "Manager2\244\005\n\016ManagerService\022L\n\005login\022 .co" +
      "m.manager.grpc.ManagerRequest\032!.com.mana" +
      "ger.grpc.ManagerResponse\022Q\n\naddManager\022 " +
      ".com.manager.grpc.ManagerRequest\032!.com.m" +
      "anager.grpc.ManagerResponse\022U\n\016modifyPas" +
      "sword\022 .com.manager.grpc.ManagerRequest\032" +
      "!.com.manager.grpc.ManagerResponse\022T\n\rre",
      "moveManager\022 .com.manager.grpc.ManagerRe" +
      "quest\032!.com.manager.grpc.ManagerResponse" +
      "\022R\n\013listManager\022 .com.manager.grpc.Manag" +
      "erRequest\032!.com.manager.grpc.ManagerResp" +
      "onse\022N\n\007getInfo\022 .com.manager.grpc.Manag" +
      "erRequest\032!.com.manager.grpc.ManagerResp" +
      "onse\022Q\n\nchangeRole\022 .com.manager.grpc.Ma" +
      "nagerRequest\032!.com.manager.grpc.ManagerR" +
      "esponse\022M\n\006modify\022 .com.manager.grpc.Man" +
      "agerRequest\032!.com.manager.grpc.ManagerRe",
      "sponseB\002P\001b\006proto3"
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
        }, assigner);
    internal_static_com_manager_grpc_Manager_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_manager_grpc_Manager_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manager_grpc_Manager_descriptor,
        new java.lang.String[] { "Id", "Username", "Password", "Token", "Introduction", "Avatar", });
    internal_static_com_manager_grpc_ManagerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_manager_grpc_ManagerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manager_grpc_ManagerRequest_descriptor,
        new java.lang.String[] { "RoleId", "Id", "Username", "Password", "Token", "Introduction", "Avatar", "Manager", });
    internal_static_com_manager_grpc_ManagerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_manager_grpc_ManagerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_manager_grpc_ManagerResponse_descriptor,
        new java.lang.String[] { "RoleId", "Id", "Username", "Password", "StatusId", "Token", "Introduction", "Avatar", "Manager", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
