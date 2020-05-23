package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class Visitor implements IVisitor{
    @Override
    public int getHealthRatingForIngredient(Ingredient ingredient) {
        return 0;
    }

    @Override
    public List<Integer> getHealthRatingForMenuItem(MenuItem menuItem) {
        return menuItem.getIngredients().stream()
                .map(Ingredient::getHealthRating)
                .collect(Collectors.toList());
    }

}
