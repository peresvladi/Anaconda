import java.util.*;

public class Test_Main {
    public static void main (String[]args) {
        Test_WendingMashine store = new Test_WendingMashine();
        
        store.addProduct(new Product( "Lays",  123.45))
            .addProduct(new Product (  "fanta",  98.75))
            .addProduct(new Product (  "fantab",  98.75))
            .addProduct(new Product (  "fan",  98.75))
            .addProduct(new Product (  "fant",  98.75))
            .addProduct(new Product (  "nta",  98.75));
        
        for (Product prod : store.getProducts()){
            System.out.println(prod);
            }
          }   
}
