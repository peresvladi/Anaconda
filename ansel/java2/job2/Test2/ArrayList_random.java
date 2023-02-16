package java2.job2.Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.random.RandomGeneratorFactory;
import java.util.ListIterator;

/**
 * ArrayList_random
 */
public class ArrayList_random {

    public static void main(String[] args) {
        ArrayList <Integer> list = new <Integer> ArrayList();{
        ListIterator<Integer> lst = list.listIterator(); {
          Integer int_vall = 0;
          for (int i = 0; i < 3; i++) {
          int_vall= (int) (Math.random()*40);
          lst.add(int_vall);
            
          } 
          System.out.println(list);
          Double double_vall = 0.0;
          System.out.println(list.size());
          //while(lst.previous() != null)
          System.out.println(list.contains((double_vall/2.0)%1 == 0));
          while(list.contains(((double_vall/2.0)%1 == 0)== true))
          {int_vall = lst.next();
            double_vall = int_vall.doubleValue();
            if((double_vall/2.0)%1 == 0){
            lst.remove();
            }
            System.out.println(list);
          } 
        }
    }
}
}