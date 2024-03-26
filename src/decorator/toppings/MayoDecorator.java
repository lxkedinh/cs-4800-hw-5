package decorator.toppings;

import decorator.IFoodItem;

public class MayoDecorator extends ToppingDecorator implements IFoodItem {
    public MayoDecorator(IFoodItem foodItem) {
        super(foodItem, 0.5);
    }
}
