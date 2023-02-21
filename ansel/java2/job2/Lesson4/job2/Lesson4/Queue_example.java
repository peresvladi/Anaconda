package job2.Lesson4;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

// пример объявления коллекции Queue, добавление элементов q.add(11);
public class Queue_example {
    public static void main(String[] args) {
        Queue<Integer>  q = new LinkedList<Integer>();
        q.add(4);
        q.add(11);
        q.remove(); // удаляется элемент который был первым добавлен ("первый пришел, первый ушел")



    }
    
}
