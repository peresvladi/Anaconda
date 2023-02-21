package job2.Lesson4;
// пример использования коллекции Deque. Линейная коллекция, которая позволяет поддерживать вставку и удаление элементов на обоих концах.
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_axample {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        // некоторые основные методы;
        deq.addFirst(1);
        deq.addLast(2);
        deq.removeLast();
        deq.offerFirst(1);
        deq.offerLast(2);
        deq.pollFirst();
        deq.pollLast();
        deq.getFirst();
        deq.getLast();
        deq.peekFirst();
        deq.peekLast();
    }
}
