package decorator.toppings;

import decorator.foods.IFoodItem;

public abstract class ToppingDecorator implements IFoodItem {
    protected IFoodItem foodItem;
    protected double basePrice;
    protected String toppingName;

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

    @Override
    public String toString() {
        return foodItem + String.format("%-20s: $%.2f\n", toppingName, basePrice);
    }
}
