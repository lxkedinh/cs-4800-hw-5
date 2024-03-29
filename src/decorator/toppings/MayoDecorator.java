package decorator.toppings;

import decorator.foods.IFoodItem;

public class MayoDecorator extends ToppingDecorator implements IFoodItem {
    public MayoDecorator(IFoodItem foodItem) {
        super(foodItem, 0.5);
        this.toppingName = "Mayonnaise";
    }
}
