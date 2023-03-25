package Test;
import java.util.List;
import java.util.ArrayList;

public class Machine_device {

    private double Money = 0.00;
    private Product have = null;
    
    private List<Product> stock = new ArrayList<>();

public Machine_device addProduct(Product product) {
    this.stock.add(product);
    return this;
}
public Product findProductNamePrice(String name, Double price){
    for (Product i : stock) {
     if(i.getName().equals(name) && i.getPrice().equals(price)){
        return i;
     }   
    }
    return null;
}

public Product saleProduct(String name, Double price){
Product have = findProductNamePrice(name, price);
if(have==null) return null;
if(name.equals(have.getName()) && price.equals(have.getPrice())){
stock.remove(have);
Money+=price;
return have;
}
System.out.println("no product");
return null;
}

@Override
public String toString() {

StringBuilder visualProduct = new StringBuilder();
for (Product prdct : stock) {
    visualProduct.append(prdct.toString());
    visualProduct.append("\n");
    }
visualProduct.append(" at the checkout "+Money);
return visualProduct.toString();
    }
}

