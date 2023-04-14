package com.example.assignment2restapislaughterhouse.mediator;

import com.example.assignment2restapislaughterhouse.mediator.CreateProductDb.CreateProductDao;
import com.example.assignment2restapislaughterhouse.mediator.CreateProductDb.CreateProductDaoImpl;
import com.example.assignment2restapislaughterhouse.mediator.GetListsDb.GetLists;
import com.example.assignment2restapislaughterhouse.mediator.GetListsDb.GetListsImpl;
import com.example.assignment2restapislaughterhouse.mediator.RegisterAnimalDb.RegisterAnimalDaoImpl;
import com.example.assignment2restapislaughterhouse.mediator.RegisterAnimalDb.RegsiterAnimalDao;
import com.example.assignment2restapislaughterhouse.model.Animal;
import com.example.assignment2restapislaughterhouse.model.Product;

public class Test {
    public static void main(String[] args) {
        RegsiterAnimalDao regsiterAnimalDao = new RegisterAnimalDaoImpl();
        CreateProductDao createProductDao = new CreateProductDaoImpl();
        GetLists getLists = new GetListsImpl();
//        System.out.println(createProductDao.CreateProduct(new Product(3,"Wings",1235)));
//        System.out.println(getLists.getProductsByAnimalRegNumber(1234).toString());
//        System.out.println(getLists.getAnimalByProductId(1));
        System.out.println(regsiterAnimalDao.addAnimal(new Animal(1237,"12/03/2023","RoggersFarm",123,"Bull")));

    }
}
