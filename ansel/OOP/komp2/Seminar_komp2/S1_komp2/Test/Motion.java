package Test;

import java.util.TooManyListenersException;

public class Motion {
    public static void main(String[] args) {
        Product thing = new Product();
        
        thing.addProduct(new Product("Hamburger", 347.00));
        System.out.println(thing);

        
    }
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
