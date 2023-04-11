package com.example.assignment2restapislaughterhouse.persistance;

import com.example.assignment2restapislaughterhouse.api.model.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private List<Animal> registeredAnimals;

    public Service() {
        this.registeredAnimals = new ArrayList<>();
        registeredAnimals.add(new Animal(123, 1234,"Cow farm", "01/01/2023", "cow"));
        registeredAnimals.add(new Animal(1, 1235,"Cow farm", "01/02/2023", "chicken"));
    }

    public List getAllAnimals(){
        return registeredAnimals;
    }

    public Optional<Animal> getAnimalByRegNumber(long regNuber){
        Optional<Animal> existing = Optional.empty();
        for (Animal animal: registeredAnimals) {
            if(animal.getRegNumber() == regNuber){
                existing = Optional.of(animal);
            }
        }
        return existing;
    }

    public List<Animal> getAnimalsByType(String type){
        List<Animal> existing = new ArrayList<>();
        for (Animal animal: registeredAnimals) {
            if(animal.getType().equals(type)){
                existing.add(animal);
            }
        }
        return existing;
    }

    public List<Animal> getAnimalsByOrigin(String origin){
        List<Animal> existing = new ArrayList<>();
        for (Animal animal: registeredAnimals) {
            if(animal.getOrigin().equals(origin)){
                existing.add(animal);
            }
        }
        return existing;
    }

    public List<Animal> getAnimalsByRegDate(String date){
        List<Animal> existing = new ArrayList<>();
        for (Animal animal: registeredAnimals) {
            if(animal.getDateOfReg().equals(date)){
                existing.add(animal);
            }
        }
        return existing;
    }

    public boolean registerAnimal(Animal animal){
        Optional<Animal> existing = getAnimalByRegNumber(animal.getRegNumber());
        if(existing.isPresent()){
            return false;
        }
        else{
            registeredAnimals.add(animal);
            return true;
        }
    }


    public void removeAnimalById(long registerNumber) {
        Optional<Animal> existing = getAnimalByRegNumber(registerNumber);
        if (existing.isEmpty()) {
            return;
        }
        registeredAnimals.remove(existing.get());
    }
}
