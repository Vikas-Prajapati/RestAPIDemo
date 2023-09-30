package com.example.restapi.repository;

import com.example.restapi.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
    @Query("SELECT b.breed FROM Dog b")
    List<String> retrieveDogBreed();

    @Query("SELECT b FROM Dog b WHERE b.Id=:id")
    Dog retrieveDogBreedById(@Param("id") Long id);
    @Query("SELECT b.name FROM Dog b")
    List<String> retrieveDogNames();
}
