public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
    System.out.println(a.getX());
    System.out.println(a.getY());

    
    //a.setX(12); // 7) получаем доступ к записи
    
    
    System.out.println(a);
    System.out.println(a.getX()); 
    System.out.println(a.getY());
    Point2D b = new Point2D(0);
    System.out.println(b);

    var dis = Point2D.distance(a,b);
    System.out.println(dis);
   
    } 
}
