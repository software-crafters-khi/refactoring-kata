package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public interface IVisitor {
    int getHealthRatingFor(Ingredient ingredient);

    List<Integer> getHealthRatingFor(MenuItem menuItem);

    String getProteinFor(Ingredient ingredient);

    List<String> getProteinFor(MenuItem menuItem);

}
