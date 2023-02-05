package Seminar1;
import java.util.Scanner;
public class

sem1_task3 {
     public static void main(String[] args) {
    int countt = ArrLen();
    int[] arr = new int[countt];
    for (int i = 0; i <= countt; i++)
    arr[i] = (int) ( Math.random() * 2 ); 
     }
      

           static int ArrLen(){
          Scanner iScanner = new Scanner (System.in);
          System.out.println("Введите колличество элементов массива: ");
          int countt = iScanner.nextInt();
          return countt;
      }
      
      
     
          
      
  }
  