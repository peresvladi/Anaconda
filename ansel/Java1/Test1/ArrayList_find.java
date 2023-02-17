import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_find<ListArray> {

    public static void main(String[] args) {
        ArrayList<Double>list = new ArrayList<Double>();{
            ListIterator<Double> listItr = list.listIterator();
        
        list = calckulyt(listItr, list);
        System.out.println(list);
        while(listItr.hasNext())
        if((listItr.next()/2)%1==0){
            listItr.remove();
        }
        }
        System.out.println(list);  
    }
    private static ArrayList<Double> calckulyt(ListIterator<Double> listItr, ArrayList<Double> lst) {
    //ListIterator<Double> lstItr = lst.listIterator();
    int int_vall = 0;
    double double_vall = 0.0;
    for (int i = 0; i < 7; i++) {
        int_vall= (int) (Math.random()*40);
        double_vall = int_vall;
        ((ArrayList<Double>) lst).add(double_vall);
    }
    return lst;
}
}
    

