package com.example.assignment2restapislaughterhouse.api.controller;

import com.example.assignment2restapislaughterhouse.api.model.Animal;
import com.example.assignment2restapislaughterhouse.persistance.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal/")
public class AnimalController {

    private Service service;

//    @Autowired
//    public AnimalController(Service service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Animal>> getAllAnimals(){
//        return new ResponseEntity(service.getAllAnimals(), HttpStatus.OK);
//    }
//
//    @GetMapping("regNumber/")
//    public ResponseEntity<Animal> getAnimalByRegNumber(long regNumber){
//        Optional<Animal> existing = service.getAnimalByRegNumber(regNumber);
//        if (existing.isPresent())
//            return new ResponseEntity<>(existing.get(), HttpStatus.OK);
//        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//    @GetMapping("type/")
//    public ResponseEntity<List<Animal>> getAnimalByType(String type){
//        List<Animal> existing = service.getAnimalsByType(type);
//        if (!existing.isEmpty())
//            return new ResponseEntity<>(existing, HttpStatus.OK);
//        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//
//    @GetMapping("origin/")
//    public ResponseEntity<List<Animal>> getAnimalByOrigin(String origin){
//        List<Animal> existing = service.getAnimalsByOrigin(origin);
//        if (!existing.isEmpty())
//            return new ResponseEntity<>(existing, HttpStatus.OK);
//        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//    @GetMapping("date/")
//    public ResponseEntity<List<Animal>> getAnimalByDate(String date){
//        List<Animal> existing = service.getAnimalsByRegDate(date);
//        if (!existing.isEmpty())
//            return new ResponseEntity<>(existing, HttpStatus.OK);
//        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//
//    @PostMapping
//    public ResponseEntity<Animal> registerAnimal(@RequestBody Animal animal){
//        boolean success = service.registerAnimal(animal);
//        if(success){
//            return new ResponseEntity<>(HttpStatus.OK);
//        }else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//
//    @DeleteMapping
//    public ResponseEntity removeAnimal(long regNumber){
//        service.removeAnimalById(regNumber);
//        return new ResponseEntity(HttpStatus.OK);
//    }

}
