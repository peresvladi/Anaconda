package Seminar1;
import java.util.Scanner;
public class sem1_task33{
     public static void main(String[] args) {
     int countt = ArrLen();
     int[] arr = new int[countt];
     for (int i = 0; i <= countt; i++)
     arr[i] = (int) ( Math.random() * 2 ); 
     check(arr);
      }
        
            private static void check(int[] arr) {
               for (int i = 0; i < arr.length; i++){
                    System.out.println(arr[i]);
               }


     }


          static int ArrLen(){
           Scanner iScanner = new Scanner (System.in);
           System.out.println("Введите колличество элементов массива: ");
           int countt = iScanner.nextInt();
           return countt;
       }
       
       
      
           
       
   }





/* package Seminar1;
import java.util.Scanner;
public class sem1_task33 {
     public static void main(String[] args) {
     int it = ListValue(); 
     } 
    static int ListValue(){
          int randd = (int) ( Math.random() * 2 );
          return randd;
      }
}
 */
/* package Seminar1;
import java.util.Scanner;
public class sem1_task33 {

     public static void main(String[] args) {
     int it = LV();
     System.out.println(it);
     }  
    public static int LV() {
        int ra = (int) (Math.random() * 2);
        return ra;
     }
}
 
 */