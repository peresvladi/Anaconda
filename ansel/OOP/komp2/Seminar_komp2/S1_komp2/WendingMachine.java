import java.util.ArrayList;
import java.util.List;

public class WendingMachine { // 7) объявляем класс WendingMachine (по логике этого
                              // ООП - машина которая торгует созданным продуктом)
                              // данный класс содержит в первую очередь List (список продуктов)

    public void printList(){ // 26)создаем метод для итерации и вывода списка продуктов >>>M
        for (Product prod : this.getProducts()){
            System.out.println(prod);
        }
    }
    public Double getMoney() { // 25) создаем геттер на money
        return money;
    }

    private Double money = 0.0; // 31) Инициализируем  money (возвращаемся и повторно запускаем ) >>>M после запуска и проверки возвращаемся сюда и изменяем toString в нижних строках

    public List<Product> getProducts() { 
        return products;
    }

    private List<Product> products = new ArrayList<>(); // 8) переменной products присваиваем структуру ArrayList (т.е. создаем List в котором будем содержать список продуктов) >>>M 
    // 14) Здесь же делаем геттер переменной products контекстным меню (у меня что-то меню нужное не нашлось, может не там искал)>>>M


    public WendingMachine addProduct(Product product){ // 11) создаем функцию (для работы которой, так же раннеe создали   см. 8) и 10)) с индефикатором addProduct, для добавления продуктов >>>M 
        this.products.add(product);

        return this;
    }

    public Product findProduct(String name){ // 21) создаем метод поиска продукта, который проходит циклом по списку продуктов и возвращаем продукт равный переменной mame. >>>M
        for (Product prod : getProducts() ) {
            if (prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
     }

    public Product buy(String name, Double price){ // 24) Создаем метод поиска товара по цене и его удаления, который так же суммирует стоимость удаленного товара (т.к. считается, что товар удален по причине его продажи) с выводом в терминал
        Product something = findProduct(name);
        if (something == null ) return null;
        if (price.equals(something.getPrice())) {
            products.remove(something);
            money += price;
            return something;
        }
        System.out.println(">>>price is wrong<<<");
        return null;
    }

    @Override // 32) переопределяем toString() >>>M
    public String toString(){
        StringBuilder wdProducts = new StringBuilder();

        for (Product prod : this.getProducts() ) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }
}