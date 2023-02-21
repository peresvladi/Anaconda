package job2.practical_task2.task4;
import java.util.LinkedList;
import java.lang.Math;
public class pt4_2 {
public static void main(String[] args) {
    
    LinkedList<Integer>lnk = new LinkedList<Integer>();
    System.out.println("\nРезультат создания и заполнения LinkedList\n рандомными значениями: "+placeholder(lnk, 3)+"\n");
    
    LinkedList<Integer>lnk2 = new LinkedList<Integer>();
    System.out.println("\nРезультат создания и заполнения LinkedLis2, получение значения: nel_val (значение элемента) : "+placeholder(lnk2, 1)+"\n");
    int el_val = 0;
    el_val = lnk2.peekFirst();
    
    System.out.println("Результат вызова метода enqueue(), LinkedList: "+enqueue(lnk, el_val)+"\n");
    System.out.println("Результат вызова метода bequeue(), LinkedList: "+bequeue(lnk)+"\n");
    System.out.println("Результат вызова метода first(), LinkedList: "+first(lnk)+"\n");
    }

private static LinkedList<Integer> placeholder(LinkedList<Integer> l, int sz) {
    int int_vall = 0;
    for(int i = 0; i<sz; i++){
    int_vall = (int) (Math.random()*100);
    l.add(int_vall);
    }
    return l;
}

private static LinkedList<Integer> enqueue(LinkedList<Integer> lnk, int j) {
    lnk.addLast(j);
    return lnk;
}
private static LinkedList<Integer> bequeue(LinkedList<Integer> lnk1) {
    System.out.println ("Результат возврата первого элемента списка LinkedList\n методом bequeue() с удалением элемента: "+lnk1.poll()+"\n");
    return lnk1;
}
private static LinkedList<Integer> first(LinkedList<Integer> lnk1) {
    System.out.println("Результат возврата первого элемента списка LinkedList\n методом first() без удаления элемента: "+lnk1.peekFirst()+"\n");
    return lnk1;
} 
}

