
import java.util. *;
public class Main { // 9) созадем класс клиентского кода c именем Main
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine(); // 10) объявляем переменую store с типом данных WegdingVachine, для создания удобной функции инициализации и возврата конкретных данных продуктов >>>WM

        store.addProduct(new Product("Lays" , 123.45)) // 12) заполняем список продуктов (данная функция возвращаем один и тот же элемент что позволяет выстраивать подобные цепочки, что иногда удобно использовать)>>>P
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fn" , 41.29))
                .addProduct(new CursedProducts("milk", 56.65, 7)) // 20) вносим новый продук который имеет 2(nime, price) наследуемых значения и дополнительное новое значение (longevity) срок годности >>>WM
                .addProduct(new Beer("alcoholfree" , 67.89)) // 39) добавляем новый продук - пиво по конструктору без значения - градусы
                .addProduct(new Beer("notbeer" , 67.89, 9))
                .addProduct(new CursedProducts("milk" , 56.65, 7)); // 40) добавляем новый продук - пиво по конструктору с значением - градусы
        
        for (Product prod : store.getProducts()) { // 15) создаем цикл для вывода продуктов (примечание: в коде занятия на GitHabe строк под 15) нет !) >>>CP
         System.out.println("foreach: "+prod);   
        }
        
        store.printList(); // 27) вызываем метод store.printList();
        System.out.println(store.getMoney()); // 30) вывод в терминал (вылетело в ексепшен, вносим исправления) >>>WM
         
        System.out.println("searching for Lay's"); // 23) Вывод в терминале подписи перед строкой поиска >>>WM 
        System.out.println(store.findProduct("Lays")); // 22) Создаем строку инициализации поиска

        System.out.println("buying Lay's" ); // 29) строка подписи вывода (  см. 28) ) покупрки в терминале
        store.buy("Lays", 123.45); // 28) вывод покупки товара
        System.out.println(store); // 33) после переопределения toString в WendingMachine делам новый вывод в терминал >>>B
        
        System.out.println("buying fan's" );
        store.buy("fan", 43.21);
        System.out.println(store);

        System.out.println("buying a's" );
        store.buy("fan", 4.1);
        System.out.println(store);

        System.out.println("buying a's" );
        store.buy("milk", 56.65);
        System.out.println(store);
    }
}