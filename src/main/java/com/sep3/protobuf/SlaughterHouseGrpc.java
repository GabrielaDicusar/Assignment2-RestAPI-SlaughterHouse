package com.sep3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class SlaughterHouseGrpc {

  private SlaughterHouseGrpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Animal,
      com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAnimal",
      requestType = com.sep3.protobuf.SlaughterHouseOuterClass.Animal.class,
      responseType = com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Animal,
      com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddAnimalMethod() {
    io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Animal, com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddAnimalMethod;
    if ((getAddAnimalMethod = SlaughterHouseGrpc.getAddAnimalMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getAddAnimalMethod = SlaughterHouseGrpc.getAddAnimalMethod) == null) {
          SlaughterHouseGrpc.getAddAnimalMethod = getAddAnimalMethod =
              io.grpc.MethodDescriptor.<com.sep3.protobuf.SlaughterHouseOuterClass.Animal, com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("AddAnimal"))
              .build();
        }
      }
    }
    return getAddAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
      com.sep3.protobuf.SlaughterHouseOuterClass.Animal> getGetAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimal",
      requestType = com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber.class,
      responseType = com.sep3.protobuf.SlaughterHouseOuterClass.Animal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
      com.sep3.protobuf.SlaughterHouseOuterClass.Animal> getGetAnimalMethod() {
    io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber, com.sep3.protobuf.SlaughterHouseOuterClass.Animal> getGetAnimalMethod;
    if ((getGetAnimalMethod = SlaughterHouseGrpc.getGetAnimalMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetAnimalMethod = SlaughterHouseGrpc.getGetAnimalMethod) == null) {
          SlaughterHouseGrpc.getGetAnimalMethod = getGetAnimalMethod =
              io.grpc.MethodDescriptor.<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber, com.sep3.protobuf.SlaughterHouseOuterClass.Animal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.Animal.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetAnimal"))
              .build();
        }
      }
    }
    return getGetAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.ProductId,
      com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> getGetAnimalsByProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByProductId",
      requestType = com.sep3.protobuf.SlaughterHouseOuterClass.ProductId.class,
      responseType = com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.ProductId,
      com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> getGetAnimalsByProductIdMethod() {
    io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.ProductId, com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> getGetAnimalsByProductIdMethod;
    if ((getGetAnimalsByProductIdMethod = SlaughterHouseGrpc.getGetAnimalsByProductIdMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetAnimalsByProductIdMethod = SlaughterHouseGrpc.getGetAnimalsByProductIdMethod) == null) {
          SlaughterHouseGrpc.getGetAnimalsByProductIdMethod = getGetAnimalsByProductIdMethod =
              io.grpc.MethodDescriptor.<com.sep3.protobuf.SlaughterHouseOuterClass.ProductId, com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsByProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetAnimalsByProductId"))
              .build();
        }
      }
    }
    return getGetAnimalsByProductIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Product,
      com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = com.sep3.protobuf.SlaughterHouseOuterClass.Product.class,
      responseType = com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Product,
      com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.Product, com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> getAddProductMethod;
    if ((getAddProductMethod = SlaughterHouseGrpc.getAddProductMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getAddProductMethod = SlaughterHouseGrpc.getAddProductMethod) == null) {
          SlaughterHouseGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.sep3.protobuf.SlaughterHouseOuterClass.Product, com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("AddProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
      com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> getGetProductByAnimalRegNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductByAnimalRegNumber",
      requestType = com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber.class,
      responseType = com.sep3.protobuf.SlaughterHouseOuterClass.ProductList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
      com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> getGetProductByAnimalRegNumberMethod() {
    io.grpc.MethodDescriptor<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber, com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> getGetProductByAnimalRegNumberMethod;
    if ((getGetProductByAnimalRegNumberMethod = SlaughterHouseGrpc.getGetProductByAnimalRegNumberMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetProductByAnimalRegNumberMethod = SlaughterHouseGrpc.getGetProductByAnimalRegNumberMethod) == null) {
          SlaughterHouseGrpc.getGetProductByAnimalRegNumberMethod = getGetProductByAnimalRegNumberMethod =
              io.grpc.MethodDescriptor.<com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber, com.sep3.protobuf.SlaughterHouseOuterClass.ProductList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductByAnimalRegNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep3.protobuf.SlaughterHouseOuterClass.ProductList.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetProductByAnimalRegNumber"))
              .build();
        }
      }
    }
    return getGetProductByAnimalRegNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub>() {
        @java.lang.Override
        public SlaughterHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseStub(channel, callOptions);
        }
      };
    return SlaughterHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub>() {
        @java.lang.Override
        public SlaughterHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub>() {
        @java.lang.Override
        public SlaughterHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterHouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void addAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.Animal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalsByProductId(com.sep3.protobuf.SlaughterHouseOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByProductIdMethod(), responseObserver);
    }

    /**
     */
    public void addProduct(com.sep3.protobuf.SlaughterHouseOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductByAnimalRegNumber(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByAnimalRegNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep3.protobuf.SlaughterHouseOuterClass.Animal,
                com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>(
                  this, METHODID_ADD_ANIMAL)))
          .addMethod(
            getGetAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
                com.sep3.protobuf.SlaughterHouseOuterClass.Animal>(
                  this, METHODID_GET_ANIMAL)))
          .addMethod(
            getGetAnimalsByProductIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep3.protobuf.SlaughterHouseOuterClass.ProductId,
                com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList>(
                  this, METHODID_GET_ANIMALS_BY_PRODUCT_ID)))
          .addMethod(
            getAddProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep3.protobuf.SlaughterHouseOuterClass.Product,
                com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getGetProductByAnimalRegNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber,
                com.sep3.protobuf.SlaughterHouseOuterClass.ProductList>(
                  this, METHODID_GET_PRODUCT_BY_ANIMAL_REG_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouseStub> {
    private SlaughterHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseStub(channel, callOptions);
    }

    /**
     */
    public void addAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.Animal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByProductId(com.sep3.protobuf.SlaughterHouseOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(com.sep3.protobuf.SlaughterHouseOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductByAnimalRegNumber(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request,
        io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByAnimalRegNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingStub> {
    private SlaughterHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage addAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep3.protobuf.SlaughterHouseOuterClass.Animal getAnimal(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList getAnimalsByProductId(com.sep3.protobuf.SlaughterHouseOuterClass.ProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage addProduct(com.sep3.protobuf.SlaughterHouseOuterClass.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep3.protobuf.SlaughterHouseOuterClass.ProductList getProductByAnimalRegNumber(com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByAnimalRegNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouseFutureStub> {
    private SlaughterHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> addAnimal(
        com.sep3.protobuf.SlaughterHouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3.protobuf.SlaughterHouseOuterClass.Animal> getAnimal(
        com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList> getAnimalsByProductId(
        com.sep3.protobuf.SlaughterHouseOuterClass.ProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage> addProduct(
        com.sep3.protobuf.SlaughterHouseOuterClass.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3.protobuf.SlaughterHouseOuterClass.ProductList> getProductByAnimalRegNumber(
        com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByAnimalRegNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL = 1;
  private static final int METHODID_GET_ANIMALS_BY_PRODUCT_ID = 2;
  private static final int METHODID_ADD_PRODUCT = 3;
  private static final int METHODID_GET_PRODUCT_BY_ANIMAL_REG_NUMBER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ANIMAL:
          serviceImpl.addAnimal((com.sep3.protobuf.SlaughterHouseOuterClass.Animal) request,
              (io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>) responseObserver);
          break;
        case METHODID_GET_ANIMAL:
          serviceImpl.getAnimal((com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber) request,
              (io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.Animal>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_PRODUCT_ID:
          serviceImpl.getAnimalsByProductId((com.sep3.protobuf.SlaughterHouseOuterClass.ProductId) request,
              (io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.AnimalList>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.sep3.protobuf.SlaughterHouseOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ResponceMessage>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ANIMAL_REG_NUMBER:
          serviceImpl.getProductByAnimalRegNumber((com.sep3.protobuf.SlaughterHouseOuterClass.RegNumber) request,
              (io.grpc.stub.StreamObserver<com.sep3.protobuf.SlaughterHouseOuterClass.ProductList>) responseObserver);
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

  private static abstract class SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep3.protobuf.SlaughterHouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse");
    }
  }

  private static final class SlaughterHouseFileDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier {
    SlaughterHouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterHouseMethodDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouseMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlaughterHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouseFileDescriptorSupplier())
              .addMethod(getAddAnimalMethod())
              .addMethod(getGetAnimalMethod())
              .addMethod(getGetAnimalsByProductIdMethod())
              .addMethod(getAddProductMethod())
              .addMethod(getGetProductByAnimalRegNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
