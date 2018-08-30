package com.github.zainzin.messages;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: messages.proto")
public final class EmployeeServicesGrpc {

  private EmployeeServicesGrpc() {}

  public static final String SERVICE_NAME = "proto.EmployeeServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetByBadgeNumberRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByBadgeNumber",
      requestType = com.github.zainzin.messages.Messages.GetByBadgeNumberRequest.class,
      responseType = com.github.zainzin.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetByBadgeNumberRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod() {
    io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetByBadgeNumberRequest, com.github.zainzin.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod;
    if ((getGetByBadgeNumberMethod = EmployeeServicesGrpc.getGetByBadgeNumberMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetByBadgeNumberMethod = EmployeeServicesGrpc.getGetByBadgeNumberMethod) == null) {
          EmployeeServicesGrpc.getGetByBadgeNumberMethod = getGetByBadgeNumberMethod = 
              io.grpc.MethodDescriptor.<com.github.zainzin.messages.Messages.GetByBadgeNumberRequest, com.github.zainzin.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.EmployeeServices", "getByBadgeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.GetByBadgeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("getByBadgeNumber"))
                  .build();
          }
        }
     }
     return getGetByBadgeNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetAllrequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.github.zainzin.messages.Messages.GetAllrequest.class,
      responseType = com.github.zainzin.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetAllrequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.GetAllrequest, com.github.zainzin.messages.Messages.EmployeeResponse> getGetAllMethod;
    if ((getGetAllMethod = EmployeeServicesGrpc.getGetAllMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getGetAllMethod = EmployeeServicesGrpc.getGetAllMethod) == null) {
          EmployeeServicesGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.github.zainzin.messages.Messages.GetAllrequest, com.github.zainzin.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.EmployeeServices", "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.GetAllrequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("getAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getSaveEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveEmployee",
      requestType = com.github.zainzin.messages.Messages.EmployeeRequest.class,
      responseType = com.github.zainzin.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getSaveEmployeeMethod() {
    io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest, com.github.zainzin.messages.Messages.EmployeeResponse> getSaveEmployeeMethod;
    if ((getSaveEmployeeMethod = EmployeeServicesGrpc.getSaveEmployeeMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getSaveEmployeeMethod = EmployeeServicesGrpc.getSaveEmployeeMethod) == null) {
          EmployeeServicesGrpc.getSaveEmployeeMethod = getSaveEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.github.zainzin.messages.Messages.EmployeeRequest, com.github.zainzin.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.EmployeeServices", "saveEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("saveEmployee"))
                  .build();
          }
        }
     }
     return getSaveEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getSaveAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveAll",
      requestType = com.github.zainzin.messages.Messages.EmployeeRequest.class,
      responseType = com.github.zainzin.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest,
      com.github.zainzin.messages.Messages.EmployeeResponse> getSaveAllMethod() {
    io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.EmployeeRequest, com.github.zainzin.messages.Messages.EmployeeResponse> getSaveAllMethod;
    if ((getSaveAllMethod = EmployeeServicesGrpc.getSaveAllMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getSaveAllMethod = EmployeeServicesGrpc.getSaveAllMethod) == null) {
          EmployeeServicesGrpc.getSaveAllMethod = getSaveAllMethod = 
              io.grpc.MethodDescriptor.<com.github.zainzin.messages.Messages.EmployeeRequest, com.github.zainzin.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.EmployeeServices", "saveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("saveAll"))
                  .build();
          }
        }
     }
     return getSaveAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.AddPhotoRequest,
      com.github.zainzin.messages.Messages.AddPhotoResponse> getAddPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPhoto",
      requestType = com.github.zainzin.messages.Messages.AddPhotoRequest.class,
      responseType = com.github.zainzin.messages.Messages.AddPhotoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.AddPhotoRequest,
      com.github.zainzin.messages.Messages.AddPhotoResponse> getAddPhotoMethod() {
    io.grpc.MethodDescriptor<com.github.zainzin.messages.Messages.AddPhotoRequest, com.github.zainzin.messages.Messages.AddPhotoResponse> getAddPhotoMethod;
    if ((getAddPhotoMethod = EmployeeServicesGrpc.getAddPhotoMethod) == null) {
      synchronized (EmployeeServicesGrpc.class) {
        if ((getAddPhotoMethod = EmployeeServicesGrpc.getAddPhotoMethod) == null) {
          EmployeeServicesGrpc.getAddPhotoMethod = getAddPhotoMethod = 
              io.grpc.MethodDescriptor.<com.github.zainzin.messages.Messages.AddPhotoRequest, com.github.zainzin.messages.Messages.AddPhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.EmployeeServices", "addPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.AddPhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.zainzin.messages.Messages.AddPhotoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServicesMethodDescriptorSupplier("addPhoto"))
                  .build();
          }
        }
     }
     return getAddPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServicesStub newStub(io.grpc.Channel channel) {
    return new EmployeeServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByBadgeNumber(com.github.zainzin.messages.Messages.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByBadgeNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.github.zainzin.messages.Messages.GetAllrequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void saveEmployee(com.github.zainzin.messages.Messages.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveEmployeeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSaveAllMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.AddPhotoResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddPhotoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByBadgeNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.zainzin.messages.Messages.GetByBadgeNumberRequest,
                com.github.zainzin.messages.Messages.EmployeeResponse>(
                  this, METHODID_GET_BY_BADGE_NUMBER)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.github.zainzin.messages.Messages.GetAllrequest,
                com.github.zainzin.messages.Messages.EmployeeResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getSaveEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.zainzin.messages.Messages.EmployeeRequest,
                com.github.zainzin.messages.Messages.EmployeeResponse>(
                  this, METHODID_SAVE_EMPLOYEE)))
          .addMethod(
            getSaveAllMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.github.zainzin.messages.Messages.EmployeeRequest,
                com.github.zainzin.messages.Messages.EmployeeResponse>(
                  this, METHODID_SAVE_ALL)))
          .addMethod(
            getAddPhotoMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.github.zainzin.messages.Messages.AddPhotoRequest,
                com.github.zainzin.messages.Messages.AddPhotoResponse>(
                  this, METHODID_ADD_PHOTO)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServicesStub extends io.grpc.stub.AbstractStub<EmployeeServicesStub> {
    private EmployeeServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesStub(channel, callOptions);
    }

    /**
     */
    public void getByBadgeNumber(com.github.zainzin.messages.Messages.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.github.zainzin.messages.Messages.GetAllrequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEmployee(com.github.zainzin.messages.Messages.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSaveAllMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.AddPhotoResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddPhotoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServicesBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServicesBlockingStub> {
    private EmployeeServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.zainzin.messages.Messages.EmployeeResponse getByBadgeNumber(com.github.zainzin.messages.Messages.GetByBadgeNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByBadgeNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.github.zainzin.messages.Messages.EmployeeResponse> getAll(
        com.github.zainzin.messages.Messages.GetAllrequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.zainzin.messages.Messages.EmployeeResponse saveEmployee(com.github.zainzin.messages.Messages.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServicesFutureStub extends io.grpc.stub.AbstractStub<EmployeeServicesFutureStub> {
    private EmployeeServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.zainzin.messages.Messages.EmployeeResponse> getByBadgeNumber(
        com.github.zainzin.messages.Messages.GetByBadgeNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.zainzin.messages.Messages.EmployeeResponse> saveEmployee(
        com.github.zainzin.messages.Messages.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_BADGE_NUMBER = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_SAVE_EMPLOYEE = 2;
  private static final int METHODID_SAVE_ALL = 3;
  private static final int METHODID_ADD_PHOTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_BADGE_NUMBER:
          serviceImpl.getByBadgeNumber((com.github.zainzin.messages.Messages.GetByBadgeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.github.zainzin.messages.Messages.GetAllrequest) request,
              (io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse>) responseObserver);
          break;
        case METHODID_SAVE_EMPLOYEE:
          serviceImpl.saveEmployee((com.github.zainzin.messages.Messages.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse>) responseObserver);
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
        case METHODID_SAVE_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveAll(
              (io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.EmployeeResponse>) responseObserver);
        case METHODID_ADD_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addPhoto(
              (io.grpc.stub.StreamObserver<com.github.zainzin.messages.Messages.AddPhotoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.zainzin.messages.Messages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeServices");
    }
  }

  private static final class EmployeeServicesFileDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier {
    EmployeeServicesFileDescriptorSupplier() {}
  }

  private static final class EmployeeServicesMethodDescriptorSupplier
      extends EmployeeServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServicesFileDescriptorSupplier())
              .addMethod(getGetByBadgeNumberMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getSaveEmployeeMethod())
              .addMethod(getSaveAllMethod())
              .addMethod(getAddPhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
