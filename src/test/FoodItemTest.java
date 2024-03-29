package test;

import decorator.foods.Burger;
import decorator.foods.Fries;
import decorator.foods.HotDog;
import decorator.toppings.KetchupDecorator;
import decorator.toppings.MayoDecorator;
import decorator.toppings.OnionDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    @Test
    void shouldReturnFoodBasePrices() {
        var burger = new Burger();
        var fries = new Fries();
        var hotdog = new HotDog();
        assertEquals(5, burger.getBasePrice());
        assertEquals(2.50, fries.getBasePrice());
        assertEquals(3.50, hotdog.getBasePrice());
    }

    @Test
    void shouldReturnFoodTotalPrices() {
        var noToppingBurger = new Burger();
        assertEquals(5, noToppingBurger.getTotalPrice());

        var oneToppingFries = new KetchupDecorator(new Fries());
        assertEquals(3, oneToppingFries.getTotalPrice(), 0.01);

        var twoToppingHotDog = new OnionDecorator(new KetchupDecorator(new HotDog()));
        assertEquals(4.25, twoToppingHotDog.getTotalPrice(), 0.01);
    }
}