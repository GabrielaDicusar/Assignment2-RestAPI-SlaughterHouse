package com.example.assignment2restapislaughterhouse.api.mediator.GetListsDb;

import com.example.assignment2restapislaughterhouse.api.model.AnimalList;
import com.example.assignment2restapislaughterhouse.api.model.ProductList;

public interface GetLists {
    AnimalList getAnimalByProductId(int productId);
    ProductList getProductsByAnimalRegNumber(int RegNumber);
}
