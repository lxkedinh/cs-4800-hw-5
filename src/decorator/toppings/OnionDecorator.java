package decorator.toppings;

import decorator.foods.IFoodItem;

public class OnionDecorator extends ToppingDecorator implements IFoodItem {
    public OnionDecorator(IFoodItem foodItem) {
        super(foodItem, 0.25);
        this.toppingName = "Onions";
    }
}
