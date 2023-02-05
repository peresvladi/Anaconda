import javax.annotation.processing.SupportedSourceVersion;

/**
 * sem_task333
 */
public class sem_task333 {

    public static void main(String[] args) {
        check(1, 2, 3, 444); 
    }

private static void check(int... a) {
    for (int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
        System.out.println();
}
}
