package com.service;

import com.example.assignment2restapislaughterhouse.api.mediator.CreateProductDb.CreateProductDao;
import com.example.assignment2restapislaughterhouse.api.mediator.CreateProductDb.CreateProductDaoImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb.GetLists;
import com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb.GetListsImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.RegisterAnimalDb.RegisterAnimalDaoImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.RegisterAnimalDb.RegsiterAnimalDao;
import com.example.assignment2restapislaughterhouse.api.model.Animal;
import com.example.assignment2restapislaughterhouse.api.model.AnimalList;
import com.sep3.protobuf.SlaughterHouseGrpc;
import com.sep3.protobuf.SlaughterHouseOuterClass;
import io.grpc.stub.StreamObserver;

public class Service extends SlaughterHouseGrpc.SlaughterHouseImplBase {
    RegsiterAnimalDao regAnimal = new RegisterAnimalDaoImpl();
    CreateProductDao createProduct = new CreateProductDaoImpl();
    GetLists lists = new GetListsImpl();

    @Override
    public void addAnimal(SlaughterHouseOuterClass.Animal request, StreamObserver<SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
        super.addAnimal(request, responseObserver);

    }

    @Override
    public void getAnimal(SlaughterHouseOuterClass.RegNumber request, StreamObserver<SlaughterHouseOuterClass.Animal> responseObserver) {
        super.getAnimal(request, responseObserver);
    }

    @Override
    public void getAnimals(SlaughterHouseOuterClass.ProductId request, StreamObserver<SlaughterHouseOuterClass.AnimalList> responseObserver) {
        AnimalList animals = lists.getAnimalByProductId(request.getProductId());
        System.out.println(animals.print());
        SlaughterHouseOuterClass.AnimalList.Builder response = SlaughterHouseOuterClass.AnimalList.newBuilder();
        for (Animal animal : animals.getAnimals()) {
            SlaughterHouseOuterClass.Animal.Builder animalBuilder = SlaughterHouseOuterClass.Animal.newBuilder()
                    .setRegNumber(animal.getRegNumber())
                    .setRegDate(animal.getDateOfReg())
                    .setOrigin(animal.getOrigin())
                    .setWeight(animal.getWeigth())
                    .setType(animal.getType());
            response.addAnimals(animalBuilder.build());
        }

        response.setCode(200).setRspMessage("Here you go");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void addProduct(SlaughterHouseOuterClass.Product request, StreamObserver<SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
        super.addProduct(request, responseObserver);
    }

    @Override
    public void getProductByAnimalRegNumber(SlaughterHouseOuterClass.RegNumber request, StreamObserver<SlaughterHouseOuterClass.ProductList> responseObserver) {
        super.getProductByAnimalRegNumber(request, responseObserver);
    }
}
