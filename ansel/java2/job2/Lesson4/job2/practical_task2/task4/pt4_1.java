package job2.practical_task2.task4;
import java.util.LinkedList;
import java.util.Stack;
import java.lang.Math;

public class pt4_1 {
    public static void main(String[] args) {
        LinkedList<Integer>lnk1 = new LinkedList<Integer>();
        LinkedList<Integer>lnk2 = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<>();
        System.out.println(placeholder(lnk1));
        st.addAll(lnk1);
        System.out.println("LinkedList 1: "+lnk1);
        for (Integer i : st) {
            lnk2.push(i);        
        }
        System.out.println("LinkedList 2: "+lnk2);
        }
        private static LinkedList<Integer> placeholder(LinkedList<Integer> ln) {
        int int_vall = 0;
        for(int i = 0; i<3; i++){
        int_vall = (int) (Math.random()*100);
        ln.add(int_vall);
        }
        return ln;
    }
}
