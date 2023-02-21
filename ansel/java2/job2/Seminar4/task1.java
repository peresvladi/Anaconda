import java.util.ArrayList;
import java.util.LinkedList;
public class task1 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
          ArrayList <Integer> list = new ArrayList <Integer>(1000000);
        //LinkedList <Integer> list = new LinkedList <Integer>();
        for (int i = 0; i < 1000000; i++){
            list.add(1);
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);
    }
}
