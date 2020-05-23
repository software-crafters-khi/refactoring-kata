package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class HealthRatingVisitor implements IVisitor{
    @Override
    public int getForIngredient(Ingredient ingredient) {
        return 0;
    }

    @Override
    public List<Integer> getForMenuItem(MenuItem menuItem) {
        return menuItem.getIngredients().stream()
                .map(Ingredient::getHealthRating)
                .collect(Collectors.toList());
    }

}
