package com.example.restapi.service;

import com.example.restapi.entity.Dog;
import com.example.restapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.retrieveDogBreed();
    }

    @Override
    public Dog retrieveDogBreedById(Long id) {
        return dogRepository.retrieveDogBreedById(id);
    }
    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.retrieveDogNames();
    }
}
