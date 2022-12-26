package me.recipe.bookrecipes.servic;

import me.recipe.bookrecipes.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Collection;



public interface RecipeService {
    Collection<Recipe> getAll();
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipeById(int idRecipe);

}










