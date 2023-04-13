package com.example.assignment2restapislaughterhouse.api.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String part;
    private int  AnimalId;

    public Product(int Id, String part, int animalId) {
        id=Id;
        this.part = part;
        AnimalId = animalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getAnimalId() {
        return AnimalId;
    }

    public void setAnimalId(int animalId) {
        AnimalId = animalId;
    }
}
