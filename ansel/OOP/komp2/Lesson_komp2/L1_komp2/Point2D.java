package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    private int x, y; // 1) закрываем координаты х и у (с помощью private, как на чтение так и на запись, однако по логике нам может понадобиться чтение поэтому продолжаем изменения)
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public int getX(){ // 2) создаем метод разграничиващий права доступа далее в клиентский файл выводим код этого метода
        return x;
    }
    public int getY(){
        return y;
    }

    public Point2D(int value){
        this(value, value);
    } 

    public void setX(int value){ // 5) создаем метод именить координату х
        this.x = value;
    }

    public void setY(int value){ // 6) создаем метод именить координату у
        this.y = value;
    }

    public Point2D() {
        this(0);
    }
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}
