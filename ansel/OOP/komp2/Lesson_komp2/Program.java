package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a);
    System.out.println(a.getX()); // 3) вносим код метода возращающего координату х (теперь изменить координату возможно только созданием отдельного метода в файле класса)
    System.out.println(a.getY()); // 4) вносим код метода возращающего координату у (теперь изменить координату возможно только созданием отдельного метода в файле класса)

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    a.setX(12); // 7) получаем доступ к записи
    System.out.println(a.setX()); // 8) получаем доступ к чтению, тем самым разграничили права доступа, т.к. отдельный функционал отвечает за изменение данных, отдельный за чтение данных
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}
