package Ex007;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("RaspberryWater"));
        latte.addComponent(new Water("RaspberryWater"));
        latte.addComponent(new Water("LimeWater"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
