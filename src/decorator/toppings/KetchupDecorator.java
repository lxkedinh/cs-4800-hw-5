package decorator.toppings;

import decorator.IFoodItem;

public class KetchupDecorator extends ToppingDecorator implements IFoodItem {
    public KetchupDecorator(IFoodItem foodItem) {
        super(foodItem, 0.5);
    }
}
