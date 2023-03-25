package L3_komp2.Ex004;

import L3_komp2.Ex004.ExBeverage.Coffee;
import L3_komp2.Ex004.ExBeverage.Water;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
