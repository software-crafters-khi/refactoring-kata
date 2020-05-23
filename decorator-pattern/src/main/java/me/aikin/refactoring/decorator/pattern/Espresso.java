package me.aikin.refactoring.decorator.pattern;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}

