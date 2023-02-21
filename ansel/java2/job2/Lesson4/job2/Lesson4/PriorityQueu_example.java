
package job2.Lesson4;

import java.util.PriorityQueue;

//пример работы PriorityQueue (приорити кью - очереди имеющей приоритет) принцип первый пришел первый обслужен ( имеется ввиду вышел, обработан и т.д.) Опеределение размеров не чиловых типов данных является сложной темой. Как я понял определяется описанием при создании собственных типов данных.

public class PriorityQueu_example {
public static void main(String[] args) {
 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
 pq.add(123);
 pq.add(3);
 pq.add(13);
 pq.add(1);
 System.out.println(pq); // вывод списка
 System.out.println(pq.poll()); // вывод по одному элементу
 System.out.println(pq.poll()); // вывод по одному элементу
 System.out.println(pq.poll()); // вывод по одному элементу

}
    
} 