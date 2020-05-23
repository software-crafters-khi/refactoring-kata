package me.aikin.refactoring.decorator.pattern;

import java.util.List;

public abstract class Beverage {

    List<Ingredient> ingredientList;

    protected Beverage(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public String getDescription() {
        return "";
    }

    public abstract double cost();
}
