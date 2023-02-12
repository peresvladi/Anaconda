import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * AddListt
 */
public class AddListt_listIter_Intr_arr {
    public static void main(String args[])

    {

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

        while(listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        
        System.out.println("===========Backward=========");
         
        while(listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
        System.out.println("=========== step 1 =========");

        System.out.println(listItr.next());  

        System.out.println("=========== step 2 =========");

        System.out.println(listItr.next());

        System.out.println("=========== add: aple ! =========");

        listItr.add( 7);

        System.out.println(list);
     
        System.out.println("===========Backward=========");

        System.out.println(listItr.previous());

        System.out.println("=========== step 3 =========");

        System.out.println(listItr.next()); 

        System.out.println("=========== step 4 =========");
         
        System.out.println(listItr.next());

        System.out.println("=========== DEL !? =========");
         
        listItr.remove();       
         
        System.out.println(list); 

        System.out.println("===========Backward=========");

        System.out.println(listItr.previous()); 

    }

    public static <T> List<T> convertArrayToList(T array[])

    {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;

    }


    


}










