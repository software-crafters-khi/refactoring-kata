package me.aikin.refactoring.decorator.pattern;

public abstract class BeverageDecorator extends Beverage {

  Beverage beverage;

  protected BeverageDecorator(Beverage beverage) {
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
