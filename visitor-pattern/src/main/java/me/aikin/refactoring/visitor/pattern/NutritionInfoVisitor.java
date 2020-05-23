package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class NutritionInfoVisitor implements IVisitor{

    @Override
    public int getHealthRatingFor(Ingredient ingredient) {
        return ingredient.getNutrition().getHealthRating();
    }

    @Override
    public List<Integer> getHealthRatingFor(MenuItem menuItem) {
        return menuItem.getIngredients().stream()
                .map(this::getHealthRatingFor)
                .collect(Collectors.toList());
    }

}
