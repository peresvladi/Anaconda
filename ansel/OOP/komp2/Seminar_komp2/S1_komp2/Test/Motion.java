package Test;

public class Motion {
    
    public static void main(String[] args) {
        
            
        
        Machine_device thing = new Machine_device();
        
        thing.addProduct(new Product("Hamburger", 347.00))
             .addProduct(new Product("Burger", 277.00))
             .addProduct(new Drinking("Cappuccino", 50.00, 0.25))
             .addProduct(new Drinking("Cappuccino", 75.00, 0.37))
             .addProduct(new Drinking("Cappuccino", 99.99, 0.5));
        System.out.println(thing);

        System.out.println("selected");
        System.out.println(thing.findProductNamePrice("Cappuccino",99.99));
        System.out.println("we sell");
        System.out.println(thing.saleProduct("Cappuccino",99.99)); 
        System.out.println("after");
        System.out.println(thing);
    }
}
