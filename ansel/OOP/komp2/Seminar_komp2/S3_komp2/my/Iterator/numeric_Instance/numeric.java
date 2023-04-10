package numeric_Instance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class numeric {
public static void main(String[] args) {
    List nums = new ArrayList<>();
    nums.add(101);
    nums.add(202);
    nums.add(303);
    nums.add(404);
    nums.add(505);

Iterator <Integer> Iter = nums.iterator();

    while(Iter.hasNext()){
     System.out.println(Iter.next());
    }
}
}
