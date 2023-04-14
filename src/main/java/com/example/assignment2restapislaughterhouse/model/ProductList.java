package com.example.assignment2restapislaughterhouse.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public void removeProducts(Product p){
        for (int i = 0; i <= products.size(); i++) {
            if(products.get(i).getId() == p.getAnimalId()){
                products.remove(products.get(i));
                break;
            }
        }
    }

    public Product getByIndex(int index){
        return products.get(index);
    }

    public int size(){
        return products.size();
    }

    public List<Product> getProducts(){
        return products;
    }
}
