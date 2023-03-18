package Test;

import java.util.List;
import java.util.ArrayList;

public class Machine_device {
    public List<Product> stock = new ArrayList<>();

public Machine_device addProduct(Product product) {
    this.stock.add(product);
    return this;
}
}

