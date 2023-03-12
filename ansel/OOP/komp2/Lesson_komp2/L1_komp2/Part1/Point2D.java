/**
 * Это точка 2D
 */
public class Point2D {
   private int x, y; // 1) закрываем координаты х и у (с помощью private, как на чтение так и на запись, однако по логике нам может понадобиться чтение поэтому продолжаем изменения)
    
   /**
    * Это конструктор
    * @param valueX это координата х
    * @param valueY это координата у
    */
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }
   
    public Point2D(int value){
        this(value, value);
    } 

     public Point2D() {
        this(0);
    }
    
    public int getX(){ // 2) создаем методы возвращающие координаты х 
        return x;
    }
    public int getY(){ // и y 
        return y;
    }


    public void setX(int value){ // 5) создаем метод изменить координату х
        this.x = value;
    }
    public void setY(int value){ // 6) создаем метод именить координату у
        this.y = value;
    }
    
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
