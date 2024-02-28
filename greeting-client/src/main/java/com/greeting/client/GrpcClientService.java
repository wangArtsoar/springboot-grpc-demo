package com.greeting.client;

import com.example.*;
import com.example.GreetingServiceGrpc.GreetingServiceBlockingStub;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class GrpcClientService {

    @GrpcClient("greeting-service")
    GreetingServiceBlockingStub blockingStub;
    @GrpcClient("greeting-service")
    GreetingServiceGrpc.GreetingServiceStub stub;

    public String receiveGreeting(String name) {
        GreetingRequest request = GreetingRequest.newBuilder()
                .setName(name)
                .build();
        return blockingStub.greeting(request).getMessage();
    }

    public List<String> receiveGreetingServerStream(List<String> nameList) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        List<String> response = new ArrayList<>();
        stub.greetingServerStream(GreetingRequestList.newBuilder().addAllNameList(nameList).build(),
                new StreamObserver<GreetingResponse>() {
                    @Override
                    public void onNext(GreetingResponse greetingResponse) {
                        response.add(greetingResponse.getMessage());
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        countDownLatch.countDown();
                    }
                });
        boolean await = countDownLatch.await(5, TimeUnit.SECONDS);
        return await ? response : Collections.emptyList();
    }

    public List<String> receiveGreetingClientStream(List<String> list) throws InterruptedException {
        List<String> response = new ArrayList<>();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<GreetingRequest> greetingClientStream = stub.greetingClientStream(
                new StreamObserver<GreetingResponseList>() {
                    @Override
                    public void onNext(GreetingResponseList greetingResponseList) {
                        response.addAll(greetingResponseList.getMessageListList());
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        countDownLatch.countDown();
                    }
                });
        list.forEach(name -> greetingClientStream.onNext(GreetingRequest.newBuilder().setName(name).build()));
        greetingClientStream.onCompleted();
        boolean await = countDownLatch.await(1, TimeUnit.MINUTES);
        return await ? response : Collections.emptyList();
    }


    public List<String> receiveGreetingBidirectionalStream(List<String> list) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        List<String> response = new ArrayList<>();
        StreamObserver<GreetingRequest> stream = stub.greetingBidirectionalStream(
                new StreamObserver<GreetingResponse>() {
                    @Override
                    public void onNext(GreetingResponse greetingResponse) {
                        System.out.println(greetingResponse.getMessage());
                        response.add(greetingResponse.getMessage());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        countDownLatch.countDown();
                    }
                });
        list.forEach(name -> stream.onNext(GreetingRequest.newBuilder().setName(name).build()));
        stream.onCompleted();
        boolean await = countDownLatch.await(1, TimeUnit.MINUTES);
        return await ? response : Collections.emptyList();
    }
}