package Seminar1;

import java.util.Scanner;
/**
 * sem1_task1
 */
public class sem1_task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет %s !", name);
        iScanner.next();
    }
}