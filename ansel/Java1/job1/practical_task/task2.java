package Java1.job1.practical_task;
import java.util.Arrays;
import java.util.List;
public class task2 {
    public static void main(String[] args) {
        Integer array[] = new Integer [1000];
        for(int i=0; i < array.length; i++){
        array[i] = i;
        }
        check(array);
    }
 private static void check(Integer[]arr){
 List<Integer> list = Arrays.asList(arr); // преобразование массива в список
 for (Integer item : list ){
 System.out.println(item); // иттерация вариант 2
}
 }

}
