package com.example.assignment2restapislaughterhouse.api.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private List<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void removeProducts(Animal a){
        for (int i = 0; i <= animals.size(); i++) {
            if(animals.get(i).getRegNumber() == a.getRegNumber()){
                animals.remove(animals.get(i));
                break;
            }
        }
    }

    public int size(){
        return animals.size();
    }

    public Animal getByIndex(int index){
        return animals.get(index);
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public boolean print() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        return true;
    }
}
