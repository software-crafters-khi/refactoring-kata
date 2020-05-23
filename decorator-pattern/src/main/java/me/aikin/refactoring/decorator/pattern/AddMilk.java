package me.aikin.refactoring.decorator.pattern;

public class AddMilk extends AddIngredient {

  protected AddMilk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return String.format("%s, %s", beverage.getDescription(), "milk");
  }

  @Override
  public double getCost() {
    return beverage.getCost() +  1.0;
  }
}
