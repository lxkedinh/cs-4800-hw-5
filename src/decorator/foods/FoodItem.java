package decorator.foods;

public abstract class FoodItem implements IFoodItem {
    protected double basePrice;
    protected String foodName;

    protected FoodItem() {}

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getTotalPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("%-20s: $%.2f\n", foodName, basePrice);
    }
}
