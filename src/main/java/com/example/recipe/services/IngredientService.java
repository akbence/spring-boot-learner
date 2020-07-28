package com.example.recipe.services;

import com.example.recipe.commands.IngredientCommand;
import com.example.recipe.commands.RecipeCommand;
import com.example.recipe.domain.Recipe;

import java.util.Set;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
