package me.aikin.refactoring.decorator.pattern;

public class MilkDecorator extends BeverageDecorator {

  protected MilkDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return "milk";
  }

  @Override
  public double getCost() {
    return beverage.getCost() +  1.0;
  }
}
