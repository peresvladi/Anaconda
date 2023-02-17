import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
public class ArrayList_find_int {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list = getting_values(list);
        ListIterator<Integer> listItr = list.listIterator();
        double double_vall = 0.0;
        
        int i = 1;
        while(listItr.hasNext()){
        System.out.println("\n----- START of verification: "+ i +"  \n" + new Date()+"\n of verification ----- \n PRINT 1. list: " + list);
        double_vall = listItr.next().doubleValue();
        System.out.println("PRINT 2. double_vall = listItr.next().doubleValue() # " + double_vall + " #");
        System.out.println("PRINT 3. (double_vall/2.0) = " + double_vall/2.0);
        System.out.print("PRINT 4. (double_vall/2.0)%1 = # ");
        System.out.print((double_vall/2.0)%1==0.0);
        System.out.print("  #  \n ----- END of verification "+ i +" ------ \n");
        i++;
        if((double_vall/2.0)%1==0.0){
        System.out.println("\n PRINT 5. list: ---- DEL : "+double_vall+" ---- \n ");
        listItr.remove();
            System.out.println("deletion result: " + list + " \n \n ");  
        }
        }
        System.out.println("PRINT 6. ===== list  ===== OVERALL RESULT): " + list + '\n');  
    }
    private static ArrayList<Integer> getting_values(ArrayList<Integer> lst) {
    int int_vall = 0;
    for (int i = 0; i < 7; i++) {
        int_vall= (int) (Math.random()*40);
        ((ArrayList<Integer>) lst).add(int_vall);
    }
    return lst;
    }
}

