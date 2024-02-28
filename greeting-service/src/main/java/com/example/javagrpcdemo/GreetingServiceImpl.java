package com.example.javagrpcdemo;

import com.example.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greetingServerStream(GreetingRequestList request, StreamObserver<GreetingResponse> responseObserver) {
        request.getNameListList().forEach(name -> {
            responseObserver.onNext(GreetingResponse.newBuilder().setMessage(name).build());
        });
        responseObserver.onCompleted();
    }

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getName();
        System.out.println("Received message : " + message);

        GreetingResponse greetingResponse = GreetingResponse.newBuilder()
                .setMessage("Received your " + message + ". Hello From Service")
                .build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GreetingRequest> greetingClientStream(StreamObserver<GreetingResponseList> responseObserver) {
        return new StreamObserver<GreetingRequest>() {
            final GreetingResponseList.Builder greetingResponseList = GreetingResponseList.newBuilder();

            @Override
            public void onNext(GreetingRequest greetingRequest) {
                greetingResponseList.addMessageList("Hello," + greetingRequest.getName());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(greetingResponseList.build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<GreetingRequest> greetingBidirectionalStream(StreamObserver<GreetingResponse> responseObserver) {
        return new StreamObserver<GreetingRequest>() {
            final GreetingResponse.Builder greetingResponse = GreetingResponse.newBuilder();

            @Override
            public void onNext(GreetingRequest greetingRequest) {
                greetingResponse.setMessage("Hello," + greetingRequest.getName());
                responseObserver.onNext(greetingResponse.build());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
