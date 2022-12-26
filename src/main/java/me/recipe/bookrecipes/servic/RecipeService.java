package me.recipe.bookrecipes.servic;

import me.recipe.bookrecipes.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Service
public class RecipeService {
    private final Map<Integer, Recipe> recipes = new HashMap<>();

    private int id = 0;

    public Collection<Recipe> getAll() {// получение всех рец
        return recipes.values();
    }

    public Recipe getById(int id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new RuntimeException(" Такого рецепта нет!");
        }
    }

    public Recipe addRecipe(Recipe recipe) {
        if (recipes.containsKey(id)) {
            throw new RuntimeException("Такой рецепт уже есть!");
        } else {
            recipes.put(id++, recipe);
        }
        return recipe;
    }
}









