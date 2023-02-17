import java.util.ArrayList;
import java.util.ListIterator;

import javax.annotation.processing.SupportedSourceVersion;

import java.lang.Math;
public class ArrayList_find_value {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list = getting_values(list);
        System.out.println(list + " наиболе близкое к cреднему значению, значение элемент: " + average_value(list) + "\n" + list + " максимальное значение: " + max_value (list) + "\n" + list + " минимальное значение: " + min_value(list));
    }
     
    private static ArrayList<Integer> getting_values(ArrayList<Integer> lst) {
    int int_vall = 0;
    for (int i = 0; i < 7; i++) {
        int_vall= (int) (Math.random()*100);
        ((ArrayList<Integer>) lst).add(int_vall);
    }
    return lst;   
    }
    private static int average_value (ArrayList<Integer> lst) {
        ListIterator<Integer> lstItr = lst.listIterator();
        int total_elements = 0;
        total_elements = lst.size();
        int sum_of_values = 0;
        System.out.println(lst);
        while(lstItr.hasNext()){
            System.out.println(sum_of_values+=lstItr.next());
          
        }
        System.out.println(sum_of_values);
        int getting_the_average = 0;
        System.out.println("getting_the_average #"+ sum_of_values/total_elements + "# = sum_of_values #"+sum_of_values+"# /total_elements #"+total_elements+"# ;");
        getting_the_average = sum_of_values/total_elements;
        
        int сloser_to_the_middle = 0;
        int element_vall = 0;
        System.out.println(lst);
            while(lstItr.hasPrevious()){
            element_vall=lstItr.previous();  
            System.out.println(element_vall); 
            //if(Math.abs(getting_the_average - lstItr.next()) > Math.abs(getting_the_average - сloser_to_the_middle)) {
            сloser_to_the_middle = (Math.abs(getting_the_average - element_vall) > Math.abs(getting_the_average - сloser_to_the_middle)) ? сloser_to_the_middle : element_vall;
            System.out.println("сloser_to_the_middle # " + сloser_to_the_middle+ " # = (Math.abs(getting_the_average - element_vall) #"+Math.abs(getting_the_average - element_vall)+" # > Math.abs(getting_the_average - сloser_to_the_middle)) #"+Math.abs(getting_the_average - сloser_to_the_middle)+" # ? сloser_to_the_middle : element_vall;");

            }   
            return сloser_to_the_middle;

            
}
private static int max_value (ArrayList<Integer> lst) {
    ListIterator<Integer> lstItr = lst.listIterator();
    int сloser_to_the_max = 0;
    int element_vall = 0;
    System.out.println(lst);
        while(lstItr.hasNext()){
        element_vall=lstItr.next();  
        System.out.println(element_vall); 
        сloser_to_the_max = element_vall < сloser_to_the_max ? сloser_to_the_max : element_vall;
        

        }   
        return сloser_to_the_max;
}
private static int min_value (ArrayList<Integer> lst) {
    ListIterator<Integer> lstItr = lst.listIterator();
    int сloser_to_the_min = 101;
    int element_vall = 0;
    System.out.println(lst);
        while(lstItr.hasNext()){
        element_vall=lstItr.next();  
        System.out.println(element_vall); 
        сloser_to_the_min = element_vall > сloser_to_the_min ? сloser_to_the_min : element_vall;
        //System.out.println("сloser_to_the_max # " + сloser_to_the_min);

        }   
        return сloser_to_the_min;
}
}
