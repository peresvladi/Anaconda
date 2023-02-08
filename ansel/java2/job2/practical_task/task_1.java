import java.util.Scanner;

/**
 * practical_task_1
 */
public class task_1 {
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
        int calculation_end_value = end_value();
            if (calculation_end_value > 0 && (choosing_an_action == 1 || choosing_an_action == 2)) {
            for (i = 1; i <= calculation_end_value; i++) {
               source_to_result = choosing_an_action == 2 ? source_to_result * i : source_to_result + i;
            }
            return source_to_result;
        } else {
            System.out.println("0 является результатом выполнения программы при введении некорректных данных.\n");
            return 0;
        }
    }
    static int action() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите +, для сложения данных цикла, или *, для перемножения этих значений");
        String y = iScan.nextLine();
        switch(y){
            case "+": return 1;
            case "*": return 2;
            default:
            return 0;
            }
        }
    static int end_value() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число ограничивающее данный цикл вычисления:");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            iScanner.close();
            return x;
        }
            return 0;
    }
}
