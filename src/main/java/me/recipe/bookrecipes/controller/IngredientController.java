package me.recipe.bookrecipes.controller;

import me.recipe.bookrecipes.model.Ingredient;
import me.recipe.bookrecipes.servic.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;


    public IngredientController(IngredientService ingredientService) { //
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public Collection<Ingredient> getAllIngredient() {
        return this.ingredientService.getAllIngredient();
    }

    @PostMapping
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return this.ingredientService.addIngredient(ingredient);
    }
}


