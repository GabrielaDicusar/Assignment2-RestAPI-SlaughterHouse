package com.example.assignment2restapislaughterhouse.mediator.GetListsDb;

import com.example.assignment2restapislaughterhouse.model.AnimalList;
import com.example.assignment2restapislaughterhouse.model.ProductList;

public interface GetLists {
    AnimalList getAnimalByProductId(int productId);
    ProductList getProductsByAnimalRegNumber(int RegNumber);
}
