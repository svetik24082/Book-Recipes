package me.recipe.bookrecipes.servic;

import me.recipe.bookrecipes.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.Collection;


public interface IngredientService {
    Collection<Ingredient> getAllIngredient();
    Ingredient addIngredient (Ingredient ingredient);
    Ingredient getIngredientById ( int idIngredient);

}
