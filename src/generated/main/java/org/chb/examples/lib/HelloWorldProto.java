// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package org.chb.examples.lib;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\",\n\014HelloRequest\022\014\n\004na" +
      "me\030\001 \001(\t\022\016\n\006object\030\002 \001(\t\"\035\n\nHelloReply\022\017" +
      "\n\007message\030\001 \001(\t2\254\001\n\006Simple\022(\n\010SayHello\022\r" +
      ".HelloRequest\032\013.HelloReply\"\000\022:\n\030StreamFr" +
      "omServerToClient\022\r.HelloRequest\032\013.HelloR" +
      "eply\"\0000\001\022<\n\030StreamFromClientToServer\022\r.H" +
      "elloRequest\032\013.HelloReply\"\000(\0010\001B)\n\024org.ch" +
      "b.examples.libB\017HelloWorldProtoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Object", });
    internal_static_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}