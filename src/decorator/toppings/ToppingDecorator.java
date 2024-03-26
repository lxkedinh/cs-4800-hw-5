package decorator.toppings;

import decorator.IFoodItem;

public abstract class ToppingDecorator implements IFoodItem {
    protected IFoodItem foodItem;
    protected double basePrice;

    protected ToppingDecorator(IFoodItem foodItem, double basePrice) {
        this.foodItem = foodItem;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getTotalPrice() {
        return basePrice + foodItem.getTotalPrice();
    }
}
