package decorator;

import java.util.List;

public abstract class FoodItem implements IFoodItem {
    protected double basePrice;

    protected FoodItem() {}

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getTotalPrice() {
        return basePrice;
    }
}
