package org.chb.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: helloworld.proto")
public final class SimpleGrpc {

  private SimpleGrpc() {}

  public static final String SERVICE_NAME = "Simple";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = SimpleGrpc.getSayHelloMethod) == null) {
      synchronized (SimpleGrpc.class) {
        if ((getSayHelloMethod = SimpleGrpc.getSayHelloMethod) == null) {
          SimpleGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getStreamFromServerToClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamFromServerToClient",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getStreamFromServerToClientMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getStreamFromServerToClientMethod;
    if ((getStreamFromServerToClientMethod = SimpleGrpc.getStreamFromServerToClientMethod) == null) {
      synchronized (SimpleGrpc.class) {
        if ((getStreamFromServerToClientMethod = SimpleGrpc.getStreamFromServerToClientMethod) == null) {
          SimpleGrpc.getStreamFromServerToClientMethod = getStreamFromServerToClientMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamFromServerToClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleMethodDescriptorSupplier("StreamFromServerToClient"))
              .build();
        }
      }
    }
    return getStreamFromServerToClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getStreamFromClientToServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamFromClientToServer",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getStreamFromClientToServerMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getStreamFromClientToServerMethod;
    if ((getStreamFromClientToServerMethod = SimpleGrpc.getStreamFromClientToServerMethod) == null) {
      synchronized (SimpleGrpc.class) {
        if ((getStreamFromClientToServerMethod = SimpleGrpc.getStreamFromClientToServerMethod) == null) {
          SimpleGrpc.getStreamFromClientToServerMethod = getStreamFromClientToServerMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamFromClientToServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleMethodDescriptorSupplier("StreamFromClientToServer"))
              .build();
        }
      }
    }
    return getStreamFromClientToServerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleStub>() {
        @java.lang.Override
        public SimpleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleStub(channel, callOptions);
        }
      };
    return SimpleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub>() {
        @java.lang.Override
        public SimpleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleBlockingStub(channel, callOptions);
        }
      };
    return SimpleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub>() {
        @java.lang.Override
        public SimpleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleFutureStub(channel, callOptions);
        }
      };
    return SimpleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SimpleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 서버측에서 SayHello()의 파라미터 값으로 HelloRequest 의 객체를 받아 로직을 처리하고
     * 직렬화된 데이터를 클라이언트에게 반환한다
     * </pre>
     */
    public void sayHello(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void streamFromServerToClient(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamFromServerToClientMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> streamFromClientToServer(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamFromClientToServerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getStreamFromServerToClientMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_STREAM_FROM_SERVER_TO_CLIENT)))
          .addMethod(
            getStreamFromClientToServerMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_STREAM_FROM_CLIENT_TO_SERVER)))
          .build();
    }
  }

  /**
   */
  public static final class SimpleStub extends io.grpc.stub.AbstractAsyncStub<SimpleStub> {
    private SimpleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버측에서 SayHello()의 파라미터 값으로 HelloRequest 의 객체를 받아 로직을 처리하고
     * 직렬화된 데이터를 클라이언트에게 반환한다
     * </pre>
     */
    public void sayHello(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamFromServerToClient(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamFromServerToClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> streamFromClientToServer(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamFromClientToServerMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SimpleBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimpleBlockingStub> {
    private SimpleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버측에서 SayHello()의 파라미터 값으로 HelloRequest 의 객체를 받아 로직을 처리하고
     * 직렬화된 데이터를 클라이언트에게 반환한다
     * </pre>
     */
    public org.chb.examples.lib.HelloReply sayHello(org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.chb.examples.lib.HelloReply> streamFromServerToClient(
        org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamFromServerToClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimpleFutureStub extends io.grpc.stub.AbstractFutureStub<SimpleFutureStub> {
    private SimpleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버측에서 SayHello()의 파라미터 값으로 HelloRequest 의 객체를 받아 로직을 처리하고
     * 직렬화된 데이터를 클라이언트에게 반환한다
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.examples.lib.HelloReply> sayHello(
        org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_STREAM_FROM_SERVER_TO_CLIENT = 1;
  private static final int METHODID_STREAM_FROM_CLIENT_TO_SERVER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimpleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.chb.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
          break;
        case METHODID_STREAM_FROM_SERVER_TO_CLIENT:
          serviceImpl.streamFromServerToClient((org.chb.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_FROM_CLIENT_TO_SERVER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamFromClientToServer(
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SimpleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chb.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Simple");
    }
  }

  private static final class SimpleFileDescriptorSupplier
      extends SimpleBaseDescriptorSupplier {
    SimpleFileDescriptorSupplier() {}
  }

  private static final class SimpleMethodDescriptorSupplier
      extends SimpleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SimpleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getStreamFromServerToClientMethod())
              .addMethod(getStreamFromClientToServerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
