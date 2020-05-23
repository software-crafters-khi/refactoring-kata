package me.aikin.refactoring.decorator.pattern;

public class MochaDecorator extends BeverageDecorator {

  protected MochaDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return String.format("%s, %s", beverage.getDescription(), "mocha");
  }

  @Override
  public double getCost() {
    return beverage.getCost() +  3.0;
  }

}
