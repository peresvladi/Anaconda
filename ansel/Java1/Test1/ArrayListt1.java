import java.util.ArrayList;
public class ArrayListt1 {

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(5, 12, 9, 3, 15, 88);
        //((Object) list2).asList(5, 12, 9, 3, 15, 88);

   /*      for (int i = 0; i < list2.size(); i++ ){
 System.out.println(list2.get(i)); // иттерация вариант 3
} */
for (Integer item : list2 ){
    System.out.println(item); // иттерация вариант 2
   }
    }
}