package com.example.recipe.repositories;

import com.example.recipe.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UnitofMeasureRepositoryIT {

    @Autowired
    UnitofMeasureRepository unitofMeasureRepository;

    @BeforeEach
    void setUp() {

    }

    @Test
    void findByDescription() {

        Optional<UnitOfMeasure> uomOptional = unitofMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon",uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionCup() {

        Optional<UnitOfMeasure> uomOptional = unitofMeasureRepository.findByDescription("Cup");
        assertEquals("Cup",uomOptional.get().getDescription());
    }
}