package me.recipe.bookrecipes.controller;

import me.recipe.bookrecipes.model.Recipe;
import me.recipe.bookrecipes.servic.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    public final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) { //
        this.recipeService = recipeService;
    }

    @GetMapping
    public Collection<Recipe> getAll() {
        return this.recipeService.getAll();
    }

    @PostMapping
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return this.recipeService.addRecipe(recipe);
    }
}
