package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public class Ingredient {
    private NutritionInfo Nutrition;

    public Ingredient(NutritionInfo nutrition) {
        Nutrition = nutrition;
    }

    public void addToPot() {
    }

    public void addWater() {
    }

    public void addOil() {
    }

    public void smell() {
    }

    public NutritionInfo getNutrition() {
        return Nutrition;
    }

    public String getProtein() {
        return Nutrition.getProtein() + " g";
    }

    public String getCalory() {
        return Nutrition.getCalory() + " J";
    }


    public int acceptForMenuItem(IVisitor visitor)
    {
        return visitor.getHealthRatingFor(this);
    }
    public String acceptForingredient(IVisitor visitor)
    {
        return visitor.getProteinFor(this);
    }
}

