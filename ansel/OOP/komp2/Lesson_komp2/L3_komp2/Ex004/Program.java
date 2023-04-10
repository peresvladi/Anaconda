package Ex004;

import Ex004.ExBeverage.Coffee;
import Ex004.ExBeverage.Milk;
import Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("сливки"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
