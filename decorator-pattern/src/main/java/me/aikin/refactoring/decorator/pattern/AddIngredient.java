package me.aikin.refactoring.decorator.pattern;

public abstract class AddIngredient extends Beverage {

  Beverage beverage;

  protected AddIngredient(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription();
  }

  @Override
  public double getCost() {
   return beverage.getCost();
  }
}
