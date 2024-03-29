package me.recipe.bookrecipes.servic;

import me.recipe.bookrecipes.model.Ingredient;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IngredientService {
    private final Map<Integer, Ingredient> ingredients = new HashMap<>();
    private int id = 0;

    public Collection<Ingredient>getAllIngredient() {// получение всех ингред
        return ingredients.values();
    }

    public Ingredient addIngredient(Ingredient ingredient) {  // доб рец
        if (ingredients.containsKey(id)) {
            throw new RuntimeException("Такой ингредиент уже есть!");
        } else {
            ingredients.put(id++, ingredient);
        }
        return ingredient;
    }


    public Ingredient getIngredientById(int id) {
        if (ingredients.containsKey(id)) {
            return ingredients.get(id);
        } else {
            throw new RuntimeException(" Такого ингредиента нет!");
        }}}