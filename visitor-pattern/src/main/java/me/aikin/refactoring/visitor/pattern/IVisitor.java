package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public interface IVisitor {
    public int getHealthRatingFor(Ingredient ingredient);

    public List<Integer> getHealthRatingFor(MenuItem menuItem);

}
