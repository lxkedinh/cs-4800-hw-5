package decorator;

import decorator.foods.IFoodItem;

public interface IOrder {
    int getAmountInOrder();
    double getTotalPrice();
    void addFoodItem(IFoodItem foodItem);
}
