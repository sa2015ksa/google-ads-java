package com.google.ads.googleads.v2.services;

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
 * <pre>
 * Service to manage Keyword Plan ad group keywords.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v2/services/keyword_plan_keyword_service.proto")
public final class KeywordPlanKeywordServiceGrpc {

  private KeywordPlanKeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.KeywordPlanKeywordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest,
      com.google.ads.googleads.v2.resources.KeywordPlanKeyword> getGetKeywordPlanKeywordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeywordPlanKeyword",
      requestType = com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest.class,
      responseType = com.google.ads.googleads.v2.resources.KeywordPlanKeyword.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest,
      com.google.ads.googleads.v2.resources.KeywordPlanKeyword> getGetKeywordPlanKeywordMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest, com.google.ads.googleads.v2.resources.KeywordPlanKeyword> getGetKeywordPlanKeywordMethod;
    if ((getGetKeywordPlanKeywordMethod = KeywordPlanKeywordServiceGrpc.getGetKeywordPlanKeywordMethod) == null) {
      synchronized (KeywordPlanKeywordServiceGrpc.class) {
        if ((getGetKeywordPlanKeywordMethod = KeywordPlanKeywordServiceGrpc.getGetKeywordPlanKeywordMethod) == null) {
          KeywordPlanKeywordServiceGrpc.getGetKeywordPlanKeywordMethod = getGetKeywordPlanKeywordMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest, com.google.ads.googleads.v2.resources.KeywordPlanKeyword>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeywordPlanKeyword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.KeywordPlanKeyword.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanKeywordServiceMethodDescriptorSupplier("GetKeywordPlanKeyword"))
              .build();
        }
      }
    }
    return getGetKeywordPlanKeywordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest,
      com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> getMutateKeywordPlanKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanKeywords",
      requestType = com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest.class,
      responseType = com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest,
      com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> getMutateKeywordPlanKeywordsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest, com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> getMutateKeywordPlanKeywordsMethod;
    if ((getMutateKeywordPlanKeywordsMethod = KeywordPlanKeywordServiceGrpc.getMutateKeywordPlanKeywordsMethod) == null) {
      synchronized (KeywordPlanKeywordServiceGrpc.class) {
        if ((getMutateKeywordPlanKeywordsMethod = KeywordPlanKeywordServiceGrpc.getMutateKeywordPlanKeywordsMethod) == null) {
          KeywordPlanKeywordServiceGrpc.getMutateKeywordPlanKeywordsMethod = getMutateKeywordPlanKeywordsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest, com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanKeywordServiceMethodDescriptorSupplier("MutateKeywordPlanKeywords"))
              .build();
        }
      }
    }
    return getMutateKeywordPlanKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanKeywordServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceStub>() {
        @java.lang.Override
        public KeywordPlanKeywordServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanKeywordServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanKeywordServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanKeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanKeywordServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanKeywordServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanKeywordServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanKeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanKeywordServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanKeywordServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanKeywordServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanKeywordServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords.
   * </pre>
   */
  public static abstract class KeywordPlanKeywordServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Keyword Plan keyword in full detail.
     * </pre>
     */
    public void getKeywordPlanKeyword(com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlanKeyword> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanKeywordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan keywords. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanKeywords(com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlanKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanKeywordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest,
                com.google.ads.googleads.v2.resources.KeywordPlanKeyword>(
                  this, METHODID_GET_KEYWORD_PLAN_KEYWORD)))
          .addMethod(
            getMutateKeywordPlanKeywordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest,
                com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_KEYWORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords.
   * </pre>
   */
  public static final class KeywordPlanKeywordServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanKeywordServiceStub> {
    private KeywordPlanKeywordServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanKeywordServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanKeywordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan keyword in full detail.
     * </pre>
     */
    public void getKeywordPlanKeyword(com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlanKeyword> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanKeywordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan keywords. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanKeywords(com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords.
   * </pre>
   */
  public static final class KeywordPlanKeywordServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanKeywordServiceBlockingStub> {
    private KeywordPlanKeywordServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanKeywordServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanKeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan keyword in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.KeywordPlanKeyword getKeywordPlanKeyword(com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanKeywordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan keywords. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse mutateKeywordPlanKeywords(com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlanKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords.
   * </pre>
   */
  public static final class KeywordPlanKeywordServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanKeywordServiceFutureStub> {
    private KeywordPlanKeywordServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanKeywordServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanKeywordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan keyword in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.KeywordPlanKeyword> getKeywordPlanKeyword(
        com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanKeywordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan keywords. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse> mutateKeywordPlanKeywords(
        com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanKeywordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN_KEYWORD = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLAN_KEYWORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanKeywordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanKeywordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KEYWORD_PLAN_KEYWORD:
          serviceImpl.getKeywordPlanKeyword((com.google.ads.googleads.v2.services.GetKeywordPlanKeywordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.KeywordPlanKeyword>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLAN_KEYWORDS:
          serviceImpl.mutateKeywordPlanKeywords((com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateKeywordPlanKeywordsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeywordPlanKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanKeywordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.KeywordPlanKeywordServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanKeywordService");
    }
  }

  private static final class KeywordPlanKeywordServiceFileDescriptorSupplier
      extends KeywordPlanKeywordServiceBaseDescriptorSupplier {
    KeywordPlanKeywordServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanKeywordServiceMethodDescriptorSupplier
      extends KeywordPlanKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanKeywordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanKeywordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanKeywordServiceFileDescriptorSupplier())
              .addMethod(getGetKeywordPlanKeywordMethod())
              .addMethod(getMutateKeywordPlanKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
