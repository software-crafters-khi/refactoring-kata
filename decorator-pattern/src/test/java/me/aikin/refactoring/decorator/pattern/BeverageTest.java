package me.aikin.refactoring.decorator.pattern;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class BeverageTest {
    @Test
    public void should_pay_1_when_buy_espresso() {
        Beverage espresso = new Espresso();

        assertTrue(espresso.getCost() == 4.0);
    }

    @Test
    public void should_pay_5_when_buy_espresso_with_milk() {
        Beverage espresso = new AddMilk(new Espresso());

        assertTrue(espresso.getCost() == 5.0);
    }

    @Test
    public void should_pay_7_when_buy_espresso_with_mocha() {
        Beverage espresso = new AddMocha(new Espresso());

        assertTrue(espresso.getCost() == 7.0);
    }

    @Test
    public void should_pay_8_when_buy_espresso_with_milk_and_mocha() {
        Beverage espresso = new AddMilk(new AddMocha(new Espresso()));

        assertTrue(espresso.getCost() == 8.0);
    }

    @Test
    public void should_return_espresso_when_get_espresso_description() {
        Beverage espresso = new Espresso();

        assertTrue(Objects.equals(espresso.getDescription(), "Espresso"));
    }
}
