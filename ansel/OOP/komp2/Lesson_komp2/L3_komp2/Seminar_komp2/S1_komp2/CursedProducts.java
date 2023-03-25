public class CursedProducts extends Product { // 16) создаем класс для описания сущности скоропортищиеся продукты с более ограниченными сроками годности
                                              // указываем что класс будет наследоваться от класса Product (extends Product)/

    private Integer longevity; // 18) создаем переменную longevity (поле longevity используемое ниже в кострукторе см.: 17))

    public CursedProducts(String name, Double price, Integer longevity) { // 17) создаем конструктор, который принимает унаследованнные поля (вот так: super(name, price);) и дополнительно принимает поле текущего класса: Integer longevity (this.longevity = longevity;)
        super(name, price);
        this.longevity = longevity;
    }

    @Override // 19) перегружаем (ли? так или нет называется? ) toString() c использование наследования значений ( см. строка кода ниже: super.toString())>>>WM
    public String toString(){
        return String.format("%s longevity = %d  " , super.toString(), longevity);
    }

} 
