package Seminar1;
import java.util.Scanner;

/**
 * srm1_task4
 */
public class srm1_task4 {
public static void main(String[] args) {
starting();
}
private static void starting() {
    System.out.println(calculation());
}
static int calculation(){
    int source_to_result = 1;
    int calculation_end_value = end_value();
    int i = 0;
    for(i = 1; i <= calculation_end_value; i++){
    source_to_result *= i;
    }
    return source_to_result;
   
}
    static int end_value() {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число ограничивающее данный цикл вычисления:");
    int x = iScanner.nextInt();
    iScanner.close();
    return x;  
    }
}
