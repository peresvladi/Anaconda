import java.util.Scanner;

/**
 * practical_task_1
 */
public class task_3 {
    public static void main(String[] args) {
    starting();
    }

    private static void starting() {
        System.out.println("Результат: " + calculation());
    }

    static int calculation() {
        int i = 0;
        int source_to_result = 1;
        int choosing_an_action = action();
        int calculation_end_value1 = end_value1();
        int calculation_end_value2 = end_value2();
            if (calculation_end_value2 > 0 && calculation_end_value1 > 0 && (choosing_an_action == 1 || choosing_an_action == 2 || choosing_an_action == 3 || choosing_an_action == 4)) {
            int x = choosing_an_action;
        switch(x){
            case 1 : return calculation_end_value1 + calculation_end_value2;
            case 2 : return calculation_end_value1 * calculation_end_value2;
            case 3 : return calculation_end_value1 - calculation_end_value2;
            case 4 : return calculation_end_value1 / calculation_end_value2;
            default:
            return 0;
            }
            }
            return 0;
    }
    static int action() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Вас приветствует простой калькулятор. Для сложения введите +, для умножения *, для вычитания -, для деления '\'");
        String y = iScan.nextLine();
        switch(y){
            case "+": return 1;
            case "*": return 2;
            case "-": return 3;
            case "/": return 4;
            default:
            return 0;
            }
        }
    static int end_value1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число 1 :");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            //iScanner.close();
            return x;
        }
            return 0;
    }
    static int end_value2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число 2 :");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            //iScanner.close();
            return x;
        }
            return 0;
    }
}
