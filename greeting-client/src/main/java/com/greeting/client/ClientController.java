package com.greeting.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    private final GrpcClientService grpcClientService;

    public ClientController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @GetMapping("sayHello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello world");
    }

    @GetMapping("/get")
    public ResponseEntity<String> printMessage() {
        return ResponseEntity.ok(grpcClientService.receiveGreeting("name"));
    }

    @GetMapping("/getServerStream")
    public ResponseEntity<List<String>> prinMessageServerStream() throws InterruptedException {
        List<String> list = Arrays.asList("123", "234", "345");
        return ResponseEntity.ok(grpcClientService.receiveGreetingServerStream(list));
    }

    @GetMapping("/getClientStream")
    public ResponseEntity<List<String>> prinMessageClientStream() throws InterruptedException {
        List<String> list = Arrays.asList("123", "234", "345");
        return ResponseEntity.ok(grpcClientService.receiveGreetingClientStream(list));
    }

    @GetMapping("/getBidirectionalStream")
    public ResponseEntity<List<String>> printMessageBidirectionalStream() throws InterruptedException {
        List<String> list = Arrays.asList("123", "234", "345");
        return ResponseEntity.ok(grpcClientService.receiveGreetingBidirectionalStream(list));
    }
}
