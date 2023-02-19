package Java.Test;
import Java.Test.Product;
import Java.Test.WendingMashine;

public class Main {
    public static void main (String[]args) {
        WendingMashine store = new WendingMashine();
        
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
