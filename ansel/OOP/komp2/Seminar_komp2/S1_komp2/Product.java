public class Product {  // 1) объявляем класс Product (схема, шаблон и т.п. )

    private String name; // 2) объявляем переменную (поле name) ;

    private Double price; // 3) объявляем перменную (поле price (цена)) 

    public Product(String name, Double price) { // 4) создаем конструктор инициализирующий 
                                                 //объявленые переменные name и price (цена)
        this.name = name; // this означает что берем значение из поля данного класса name т.е. из этой строки расположенной выше: private String name;  (name без this будет означать, что значение будет забираться из параметра текущего состояния т.е. здесь: public Product(String name, Double price), это расположено в коде на одну строку выше), от куда берется значение поможно посмотреть нажав л. клавишей мыши с Ctr на переменной.
        this.price = price; // this означает что берем значение из поля данного класса price

    }
    public String getName() { // 5)  получение значения переменной privod (метод геттер)
        return name;
    }
    public Double getPrice() { //  6) получение значения переменной privod (метод геттер) переходим в WendingMachige (далее переход будет указан по шаблону: >>>WM)
        return price;
    }
    @Override // 13) переопределяем метод toString, для вывода с возможностью корректного прочтения пользователем
              // (т.к. любой класс наследуется в java от Object и поэтому по умолчанию имеет несколько функций в том числе toString) >>>WM   
    public String toString(){

        return String.format("name = %s ; price = %2.2f ; " , name, price); // 2.2f в строке ограничивает число цифр после точки(запятой) до 2-х символов    }
    }

}
