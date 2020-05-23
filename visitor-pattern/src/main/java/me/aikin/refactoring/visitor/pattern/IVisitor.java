package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public interface IVisitor {
    public int getForIngredient(Ingredient ingredient);

    public List<Integer> getForMenuItem(MenuItem menuItem);

}
