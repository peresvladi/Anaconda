package Java.Test;
import java.util.ArrayList;
import java.util.List;


public class WendingMashine<WendingMachine> {
 
	
	private List <Product> products = new ArrayList<>();
	
	
		public List<Product> getProducts() {
        return products;
    }


        public WendingMashine<WendingMachine> addProduct(Product product){
		this.products.add(product);	
		
		return this;    
}
}
