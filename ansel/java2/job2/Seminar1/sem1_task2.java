package Seminar1;
import java.util.Scanner;
import java.time.LocalTime;
public class sem1_task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner (System.in);
        int time1 = LocalTime.of(06, 00).getHour(); //java.time.LocalTime
        int time2 = LocalTime.of(11, 00).getHour(); //java.time.LocalTime
        int time3 = LocalTime.of(18, 00).getHour(); //java.time.LocalTime
        int time4 = LocalTime.of(23, 00).getHour(); //java.time.LocalTime
        int sys_time =LocalTime.now().getHour();
        String hi = "Доброй ночи";
        if (time1 <= sys_time && sys_time < time2)
        hi = "Доброe утро ";
        if (time2 <= sys_time && sys_time < time3)
        hi = "Добрый день ";
        if (time3 <= sys_time && sys_time < time4)
        hi = "Добрый вечер ";
        System.out.println("Введите ваше имя:  ");
        String name = iScanner.nextLine();
        System.out.printf("%s %s !", hi, name);
        iScanner.next();

    }
    
}
