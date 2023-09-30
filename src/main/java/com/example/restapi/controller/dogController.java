package com.example.restapi.controller;

import com.example.restapi.entity.Dog;
import com.example.restapi.exceptions.DogNotFoundException;
import com.example.restapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class dogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/getAllBreeds")
    public ResponseEntity<List<String>> getAllBreed(){
        List<String> dogAllBreeds = dogService.retrieveDogBreed();
        return new ResponseEntity<>(dogAllBreeds, HttpStatusCode.valueOf(200));
    }
    @GetMapping("/getDogBreedById/{id}")
    public ResponseEntity<Object> getDogBreedByID(@PathVariable Long id){
        Optional<Dog> optionalDog = Optional.ofNullable(dogService.retrieveDogBreedById(id));
        return new ResponseEntity<>(optionalDog.orElseThrow(DogNotFoundException::new), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/getDogBreedNames")
    public ResponseEntity<List<String>> getDogBreedByID(){
        List<String> dogNames = dogService.retrieveDogNames();
        return new ResponseEntity<>(dogNames, HttpStatusCode.valueOf(200));
    }
}
