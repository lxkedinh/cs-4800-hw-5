package decorator;

import decorator.foods.IFoodItem;

import java.util.List;
import java.util.Vector;

public class Order implements IOrder {
    private List<IFoodItem> foodItems = new Vector<>();

    public Order() {}

    public int getAmountInOrder() {
        return foodItems.size();
    }

    public void addFoodItem(IFoodItem item) {
        foodItems.add(item);
    }

    @Override
    public double getTotalPrice() {
        double total = 0;

        for (IFoodItem item : foodItems) {
            total += item.getTotalPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (IFoodItem foodItem : foodItems) {
            s.append(foodItem);
        }

        s.append("---------------------\n");
        s.append(
                String.format("%-20s: $%.2f\n", "Total Cost", getTotalPrice())
        );

        return s.toString();
    }
}
