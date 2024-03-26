package decorator;

import decorator.toppings.KetchupDecorator;
import decorator.toppings.MayoDecorator;

public class Driver {
    public static void main(String[] args) {
        IFoodItem mayoKetchupHotdog = new MayoDecorator(new KetchupDecorator(new HotDog()));
        System.out.println(mayoKetchupHotdog.getTotalPrice());
    }
}
