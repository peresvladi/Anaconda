import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task2_1 {

public static void main(String[] args) {
 
        Integer[]array = {1, 2, 3, 4, 5, 6, 7};
        Queue<Integer> newStack = turnToQueue(array);


        System.out.println(newStack);
        //for(Integer J = 0; J < array.length; J++){
            //System.out.println(newStack.pic()); */
         
        }
        
        public static Queue<Integer> turnToQueue(Integer[]arr){
        Queue<Integer> Queue_input = new LinkedList<Integer>();
        for (Integer i : arr){
        Queue_input.add(i);
        }
        return Queue_input;
    }       
}

