/* Дан массив двоичных чисел, вывести максимальное количество идущих подряд 1. */

import java.util.Scanner;
public class sem1_task33{
     public static void main(String[] args) {
     int countt = ArrLen();
     int[] arr = new int[countt];
     for (int i = 0; i < countt; i++)
     arr[i] = (int) ( Math.random() * 2 ); 
     check(arr);
      }
                   private static void check(int[] ar) {
               int ix = 0;
               int iy = 0;
               int max = 0;
               for (int i = 0; i < ar.length; i++){
               System.out.println("- "+ar[i]);
                     if (ar[i]==1 && i < ar.length-1){
                         ix += 1;
               }else{
                         max = ix > iy ? iy = ix : iy;
                         ix = 0;
                         if (i == ar.length-1){
                         System.out.println(max);          
                         }
                         
                }
                



               
                         }                        
                    }

                    
               
               
         
          static int ArrLen(){
           /* Scanner iScanner = new Scanner (System.in);
           System.out.println("Введите колличество элементов массива: ");
           int countt = iScanner.nextInt(); */
           int countt = 7;
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