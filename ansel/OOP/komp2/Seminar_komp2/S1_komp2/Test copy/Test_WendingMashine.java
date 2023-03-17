

import java.util.ArrayList;
import java.util.List;

public class Test_WendingMashine {

	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public Test_WendingMashine<Test_WendingMachine> addProduct(Test_Product product) {
		this.products.add(product);

		return this;
	}
}
