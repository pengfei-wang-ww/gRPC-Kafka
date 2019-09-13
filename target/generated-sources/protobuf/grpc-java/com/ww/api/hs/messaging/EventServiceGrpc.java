package com.ww.api.hs.messaging;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: messaging.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "com.ww.api.hs.messaging.EventService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ww.api.hs.messaging.Event,
      com.ww.api.hs.messaging.PostResponse> METHOD_POST_ONE =
      io.grpc.MethodDescriptor.<com.ww.api.hs.messaging.Event, com.ww.api.hs.messaging.PostResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ww.api.hs.messaging.EventService", "PostOne"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.Event.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.PostResponse.getDefaultInstance()))
          .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("PostOne"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ww.api.hs.messaging.Event,
      com.ww.api.hs.messaging.PostResponse> METHOD_POST_MANY =
      io.grpc.MethodDescriptor.<com.ww.api.hs.messaging.Event, com.ww.api.hs.messaging.PostResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.ww.api.hs.messaging.EventService", "PostMany"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.Event.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.PostResponse.getDefaultInstance()))
          .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("PostMany"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ww.api.hs.messaging.SubscribeRequest,
      com.ww.api.hs.messaging.SubscribeResponse> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.<com.ww.api.hs.messaging.SubscribeRequest, com.ww.api.hs.messaging.SubscribeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.ww.api.hs.messaging.EventService", "Subscribe"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.SubscribeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.SubscribeResponse.getDefaultInstance()))
          .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("Subscribe"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ww.api.hs.messaging.Feedback,
      com.ww.api.hs.messaging.SendFeedbackResponse> METHOD_SEND_FEEDBACK =
      io.grpc.MethodDescriptor.<com.ww.api.hs.messaging.Feedback, com.ww.api.hs.messaging.SendFeedbackResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ww.api.hs.messaging.EventService", "SendFeedback"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.Feedback.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.SendFeedbackResponse.getDefaultInstance()))
          .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("SendFeedback"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ww.api.hs.messaging.GetFeedbackRequest,
      com.ww.api.hs.messaging.Feedback> METHOD_GET_FEEDBACK =
      io.grpc.MethodDescriptor.<com.ww.api.hs.messaging.GetFeedbackRequest, com.ww.api.hs.messaging.Feedback>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.ww.api.hs.messaging.EventService", "GetFeedback"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.GetFeedbackRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ww.api.hs.messaging.Feedback.getDefaultInstance()))
          .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetFeedback"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    return new EventServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void postOne(com.ww.api.hs.messaging.Event request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_POST_ONE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.Event> postMany(
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_POST_MANY, responseObserver);
    }

    /**
     */
    public void subscribe(com.ww.api.hs.messaging.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    /**
     */
    public void sendFeedback(com.ww.api.hs.messaging.Feedback request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SendFeedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_FEEDBACK, responseObserver);
    }

    /**
     */
    public void getFeedback(com.ww.api.hs.messaging.GetFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.Feedback> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEEDBACK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_POST_ONE,
            asyncUnaryCall(
              new MethodHandlers<
                com.ww.api.hs.messaging.Event,
                com.ww.api.hs.messaging.PostResponse>(
                  this, METHODID_POST_ONE)))
          .addMethod(
            METHOD_POST_MANY,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.ww.api.hs.messaging.Event,
                com.ww.api.hs.messaging.PostResponse>(
                  this, METHODID_POST_MANY)))
          .addMethod(
            METHOD_SUBSCRIBE,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ww.api.hs.messaging.SubscribeRequest,
                com.ww.api.hs.messaging.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            METHOD_SEND_FEEDBACK,
            asyncUnaryCall(
              new MethodHandlers<
                com.ww.api.hs.messaging.Feedback,
                com.ww.api.hs.messaging.SendFeedbackResponse>(
                  this, METHODID_SEND_FEEDBACK)))
          .addMethod(
            METHOD_GET_FEEDBACK,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ww.api.hs.messaging.GetFeedbackRequest,
                com.ww.api.hs.messaging.Feedback>(
                  this, METHODID_GET_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractStub<EventServiceStub> {
    private EventServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     */
    public void postOne(com.ww.api.hs.messaging.Event request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_POST_ONE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.Event> postMany(
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_POST_MANY, getCallOptions()), responseObserver);
    }

    /**
     */
    public void subscribe(com.ww.api.hs.messaging.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SubscribeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendFeedback(com.ww.api.hs.messaging.Feedback request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SendFeedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_FEEDBACK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeedback(com.ww.api.hs.messaging.GetFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.Feedback> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_FEEDBACK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ww.api.hs.messaging.PostResponse postOne(com.ww.api.hs.messaging.Event request) {
      return blockingUnaryCall(
          getChannel(), METHOD_POST_ONE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ww.api.hs.messaging.SubscribeResponse> subscribe(
        com.ww.api.hs.messaging.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.ww.api.hs.messaging.SendFeedbackResponse sendFeedback(com.ww.api.hs.messaging.Feedback request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_FEEDBACK, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ww.api.hs.messaging.Feedback> getFeedback(
        com.ww.api.hs.messaging.GetFeedbackRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_FEEDBACK, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractStub<EventServiceFutureStub> {
    private EventServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ww.api.hs.messaging.PostResponse> postOne(
        com.ww.api.hs.messaging.Event request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_POST_ONE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ww.api.hs.messaging.SendFeedbackResponse> sendFeedback(
        com.ww.api.hs.messaging.Feedback request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_FEEDBACK, getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_ONE = 0;
  private static final int METHODID_SUBSCRIBE = 1;
  private static final int METHODID_SEND_FEEDBACK = 2;
  private static final int METHODID_GET_FEEDBACK = 3;
  private static final int METHODID_POST_MANY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_ONE:
          serviceImpl.postOne((com.ww.api.hs.messaging.Event) request,
              (io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((com.ww.api.hs.messaging.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SubscribeResponse>) responseObserver);
          break;
        case METHODID_SEND_FEEDBACK:
          serviceImpl.sendFeedback((com.ww.api.hs.messaging.Feedback) request,
              (io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.SendFeedbackResponse>) responseObserver);
          break;
        case METHODID_GET_FEEDBACK:
          serviceImpl.getFeedback((com.ww.api.hs.messaging.GetFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.Feedback>) responseObserver);
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
        case METHODID_POST_MANY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.postMany(
              (io.grpc.stub.StreamObserver<com.ww.api.hs.messaging.PostResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ww.api.hs.messaging.Messaging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(METHOD_POST_ONE)
              .addMethod(METHOD_POST_MANY)
              .addMethod(METHOD_SUBSCRIBE)
              .addMethod(METHOD_SEND_FEEDBACK)
              .addMethod(METHOD_GET_FEEDBACK)
              .build();
        }
      }
    }
    return result;
  }
}
