package com.example.recipe.controllers;

import com.example.recipe.domain.Category;
import com.example.recipe.domain.UnitOfMeasure;
import com.example.recipe.repositories.CategoryRepository;
import com.example.recipe.repositories.UnitofMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitofMeasureRepository unitofMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitofMeasureRepository unitofMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitofMeasureRepository = unitofMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitofMeasure = unitofMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is : " + categoryOptional.get().getId());
        System.out.println("Uom id is : " + unitofMeasure.get().getId());
        return "index";
    }
}
