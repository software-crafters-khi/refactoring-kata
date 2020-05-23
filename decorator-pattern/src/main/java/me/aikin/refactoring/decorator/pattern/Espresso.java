package me.aikin.refactoring.decorator.pattern;

import java.util.Arrays;

public class Espresso extends Beverage {
    public Espresso() {
        super(Arrays.asList(
                new Ingredient("Milk", 1.0),
                new Ingredient("Mocha", 3.0)));
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        double condimentCost = 4.00;

        for (Ingredient ingredient : ingredientList) {
            condimentCost += ingredient.getCost();
        }

        return condimentCost;
    }
}

