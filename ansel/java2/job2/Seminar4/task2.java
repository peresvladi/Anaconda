import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        System.out.println(ArrValStack());
    }
        
        public static Stack<Integer> ArrValStack() {
        Integer[] array = {3, 2, 1, 4, 5, 6};{
        Stack <Integer> stack = new Stack<Integer>();
        for (Integer i : array){
        stack.add(i);
        }
        return stack;
    }
    }

}


    
   

