package com.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class StartService {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9091).addService(new Service()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
