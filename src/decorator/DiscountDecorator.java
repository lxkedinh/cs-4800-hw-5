package decorator;

import decorator.foods.IFoodItem;

public class DiscountDecorator implements IOrder {
    private IOrder order;
    private Loyalty status;

    public DiscountDecorator(IOrder order, Loyalty status) {
        this.order = order;
        this.status = status;
    }

    @Override
    public int getAmountInOrder() {
        return order.getAmountInOrder();
    }

    @Override
    public double getTotalPrice() {
        return status.discount * order.getTotalPrice();
    }

    @Override
    public void addFoodItem(IFoodItem foodItem) {
        order.addFoodItem(foodItem);
    }

    @Override
    public String toString() {
        return order.toString() +
                String.format("%s Discount\n", status) +
                String.format("%-20s: $%.2f\n", "Discounted Cost", getTotalPrice());
    }
}
