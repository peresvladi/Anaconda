package java2.job2.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class rfrjqnj {
    public static void main(String[] args) {
        Integer array[] = new Integer [1000];
        for(int i=0; i < array.length; i++){
        array[i] = i;
        }
        check(array);
    }
    private static void check(Integer[]array){
        System.out.println("Array: "
                           + Arrays.toString(array));
        List<Integer> list = convertArrayToList(array);
        System.out.println("List: " + list);
        ListIterator<Integer> listItr = list.listIterator();
        System.out.println("===========Forward=========");
        double true_false = 0.0;
        double deliver = 2.0;
        while(listItr.hasNext()) {
            System.out.println(true_false = listItr.next());
            System.out.println("before checking: if((true_false #"+true_false+"# /deliver #"+deliver+"# )%2 #"+(true_false/deliver)%2+ "# == 0){");
            if((true_false/deliver)%2 == 0){
                System.out.println("deletion after verification: if((true_false #"+true_false+"# /deliver #"+deliver+"# )%2 #"+(true_false/deliver)%2+ "# == 0){");
                listItr.remove();  
            }
        }
        
        System.out.println(list); 
    }
    public static <T> List<T> convertArrayToList(T array[])
    {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;    
        
    }
}
