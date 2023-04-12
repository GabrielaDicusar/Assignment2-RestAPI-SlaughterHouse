package com.example.assignment2restapislaughterhouse.api.mediator;

import com.example.assignment2restapislaughterhouse.api.mediator.CreateProductDb.CreateProductDao;
import com.example.assignment2restapislaughterhouse.api.mediator.CreateProductDb.CreateProductDaoImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb.GetLists;
import com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb.GetListsImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.RegisterAnimalDb.RegisterAnimalDaoImpl;
import com.example.assignment2restapislaughterhouse.api.mediator.RegisterAnimalDb.RegsiterAnimalDao;

public class Test {
    public static void main(String[] args) {
        RegsiterAnimalDao regsiterAnimalDao = new RegisterAnimalDaoImpl();
        CreateProductDao createProductDao = new CreateProductDaoImpl();
        GetLists getLists = new GetListsImpl();
//        System.out.println(createProductDao.CreateProduct(new Product("Stakes",1234)));
//        System.out.println(getLists.getProductsByAnimalRegNumber(1234).toString());
        System.out.println(getLists.getAnimalByProductId(1));
    }
}
