package Java1.job1.practical_task.PZ5.task2;

import java.io.FileReader;

/**
 * search_output
 */
public class search_output {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("Java1/job1/practical_task/PZ5/task2/info_list.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (ch == '\n') {
                    System.out.print(ch);
                } else {
                    System.out.print(ch);
                }
            }
        }
    }
                    
} 