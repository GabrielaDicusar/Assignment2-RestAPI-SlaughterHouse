package com.service;

import com.example.assignment2restapislaughterhouse.mediator.CreateProductDb.CreateProductDao;
import com.example.assignment2restapislaughterhouse.mediator.CreateProductDb.CreateProductDaoImpl;
import com.example.assignment2restapislaughterhouse.mediator.GetListsDb.GetLists;
import com.example.assignment2restapislaughterhouse.mediator.GetListsDb.GetListsImpl;
import com.example.assignment2restapislaughterhouse.mediator.RegisterAnimalDb.RegisterAnimalDaoImpl;
import com.example.assignment2restapislaughterhouse.mediator.RegisterAnimalDb.RegsiterAnimalDao;
import com.example.assignment2restapislaughterhouse.model.Animal;
import com.example.assignment2restapislaughterhouse.model.AnimalList;
import com.example.assignment2restapislaughterhouse.model.Product;
import com.example.assignment2restapislaughterhouse.model.ProductList;
import com.sep3.protobuf.SlaughterHouseGrpc;
import com.sep3.protobuf.SlaughterHouseOuterClass;
import io.grpc.stub.StreamObserver;


public class Service extends SlaughterHouseGrpc.SlaughterHouseImplBase {
    RegsiterAnimalDao regAnimal = new RegisterAnimalDaoImpl();
    CreateProductDao createProduct = new CreateProductDaoImpl();
    GetLists lists = new GetListsImpl();

    @Override
    public void addAnimal(SlaughterHouseOuterClass.Animal request, StreamObserver<SlaughterHouseOuterClass.ResponceMessage> responseObserver) {
//        super.addAnimal(request, responseObserver);
        int regNumber = request.getRegNumber();
        String regDate = request.getRegDate();
        String origin = request.getOrigin();
        int weight = request.getWeight();
        String type = request.getType();

        SlaughterHouseOuterClass.ResponceMessage.Builder response = SlaughterHouseOuterClass.ResponceMessage.newBuilder();

        if(regAnimal.addAnimal(new Animal(regNumber,regDate,origin,weight,type))){
            response.setCode(210).setRspMessage("Animal added successfully");
        }
        else{
            //return failure message
            response.setCode(500).setRspMessage("Invalid data");
        }
        //wraps the response inside the response observer to send it
        //back to the client
        responseObserver.onNext(response.build());

        //closes the call
        responseObserver.onCompleted();

    }

    @Override
    public void getAnimalsByProductId(SlaughterHouseOuterClass.ProductId request, StreamObserver<SlaughterHouseOuterClass.AnimalList> responseObserver) {
        //got the animals from db
        AnimalList animals = lists.getAnimalByProductId(request.getProductId());
        //building the list
        SlaughterHouseOuterClass.AnimalList.Builder response = SlaughterHouseOuterClass.AnimalList.newBuilder();
        //building the animals and adding them to the list
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
//        super.addProduct(request, responseObserver);
        int id = request.getId();
        String part = request.getPart();
        int animalId = request.getAnimalId();

        SlaughterHouseOuterClass.ResponceMessage.Builder response = SlaughterHouseOuterClass.ResponceMessage.newBuilder();

        if(createProduct.CreateProduct(new Product(id,part,animalId))){
            response.setCode(200).setRspMessage("Product added successfully");
        }
        else{
            //return failure message
            response.setCode(500).setRspMessage("Invalid data");
        }
        //wraps the response inside the response observer to send it
        //back to the client
        responseObserver.onNext(response.build());

        //closes the call
        responseObserver.onCompleted();

    }

    @Override
    public void getProductByAnimalRegNumber(SlaughterHouseOuterClass.RegNumber request, StreamObserver<SlaughterHouseOuterClass.ProductList> responseObserver) {
        ProductList products = lists.getProductsByAnimalRegNumber(request.getRegNumber());
        SlaughterHouseOuterClass.ProductList.Builder response = SlaughterHouseOuterClass.ProductList.newBuilder();
        for (Product p : products.getProducts()) {
            SlaughterHouseOuterClass.Product.Builder productBuilder = SlaughterHouseOuterClass.Product.newBuilder()
                    .setId(p.getId())
                    .setPart(p.getPart())
                    .setAnimalId(p.getAnimalId());

            response.addProducts(productBuilder.build());
        }

        response.setCode(200).setRspMessage("Here you go");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


}
