package test;

import decorator.DiscountDecorator;
import decorator.IOrder;
import decorator.Loyalty;
import decorator.Order;
import decorator.foods.Burger;
import decorator.foods.HotDog;
import decorator.foods.IFoodItem;
import decorator.toppings.KetchupDecorator;
import decorator.toppings.OnionDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void shouldAddFoodItemsToOrder() {
        IOrder order = new Order();
        IFoodItem burger = new Burger();
        order.addFoodItem(burger);
        assertEquals(1, order.getAmountInOrder());
    }

    @Test
    void shouldReturnTotalOrderCost() {
        IOrder order = new Order();
        IFoodItem burger = new Burger();
        IFoodItem ketchupHotdog = new KetchupDecorator(new HotDog());
        order.addFoodItem(burger);
        order.addFoodItem(ketchupHotdog);
        assertEquals(9, order.getTotalPrice());
    }

    @Test
    void shouldReturnDiscountedOrderCost() {
        IOrder order = new Order();
        IFoodItem burger = new KetchupDecorator(new OnionDecorator(new Burger()));
        order.addFoodItem(burger);

        IOrder vipDiscount = new DiscountDecorator(order, Loyalty.VIP);
        assertEquals(4.89, vipDiscount.getTotalPrice(), 0.01);

        IOrder regularDiscount = new DiscountDecorator(order, Loyalty.Regular);
        assertEquals(5.18, regularDiscount.getTotalPrice(), 0.01);

        IOrder militaryDiscount = new DiscountDecorator(order, Loyalty.Military);
        assertEquals(4.6, militaryDiscount.getTotalPrice(), 0.01);
    }
}