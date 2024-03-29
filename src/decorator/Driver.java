package decorator;

import decorator.foods.Burger;
import decorator.foods.HotDog;
import decorator.foods.IFoodItem;
import decorator.toppings.KetchupDecorator;
import decorator.toppings.MayoDecorator;

public class Driver {
    public static void main(String[] args) {
        var burger = new Burger();

        IFoodItem mayoKetchupHotdog = new MayoDecorator(new KetchupDecorator(new HotDog()));

        Order order = new Order();
        order.addFoodItem(mayoKetchupHotdog);
        IOrder discountedOrder = new DiscountDecorator(order, Loyalty.VIP);
        System.out.println(discountedOrder);
    }
}
