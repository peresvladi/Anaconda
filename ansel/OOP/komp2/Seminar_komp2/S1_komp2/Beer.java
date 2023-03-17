public class Beer extends Product { // 34) создали новый класс продукта - пива

    private Integer alcohol = 0; // 35) объявляеь новое поле градусы

    public Beer(String name, Double price) { // 36) создаем конструктор № 1
        super(name, price);
    }
    public Beer(String name, Double price, Integer alcohol) { // 37 создаем конструктор № 2
        this(name, price);
        this.alcohol = alcohol;

    }
    @Override // 38) переопределяем toString
    public String toString(){
        return String.format("%s alcohol = %d  " , super.toString(), alcohol);
    }
}
