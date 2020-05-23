package me.aikin.refactoring.decorator.pattern;

public class Ingredient {
    private String name;
    private double cost;

    public Ingredient(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
