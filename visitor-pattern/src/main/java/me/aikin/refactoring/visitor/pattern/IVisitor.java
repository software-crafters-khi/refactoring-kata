package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public interface IVisitor {
    public int getHealthRatingForIngredient(Ingredient ingredient);

    public List<Integer> getHealthRatingForMenuItem(MenuItem menuItem);

}
