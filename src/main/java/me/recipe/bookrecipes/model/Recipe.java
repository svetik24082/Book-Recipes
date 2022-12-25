package me.recipe.bookrecipes.model;

import java.util.List;

public class Recipe {
    //private int id = 0;
    private String nameRecipe;
    private int time;
    private List<Ingredient> ingredients;
    private List<String> preparingSteps;


    public Recipe( String nameRecipe, int time) {
        this.nameRecipe = nameRecipe;
        this.time = time;


    }

    //public int getId() {
        //return id;
    //}



    public String getNameRecipe() {
        return nameRecipe;
    }

    public int getTime() {
        return time;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getPreparingSteps() {
        return preparingSteps;
    }

   // public void setId(int id) {
       // this.id = id;
    //}

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPreparingSteps(List<String> preparingSteps) {
        this.preparingSteps = preparingSteps;
    }
}
