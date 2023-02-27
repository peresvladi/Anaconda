package job2.practical_task2.task5.find_sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class input_find {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/home/vladi/Education/master/ansel/java2/job2/Lesson4/job2/practical_task2/task5/find_sort/file_info.txt"));
        String str;
        Map <Integer, String> next_db = new HashMap<>();
        Map <String, Integer> buck_db = new HashMap<>();
        int count = -1;
        while ((str = br.readLine()) !=null) {
        next_db.put(count, str);
        buck_db.put(str.substring(0, str.indexOf(" ")), count = count < 0 ? );
        System.out.println(count +" "+ next_db.get(count));
       // System.out.println(count +" "+ buck_db.get(next_db.get(count)));
        count--;
            
            //buck_db.put(str, null);            //System.out.printf("%s\n", str.substring(0, str.indexOf(" ")));
             // Map <String, Integer> buck_db = new HashMap<>();
    }

   // System.out.println(buck_db.keySet());
    System.out.println(buck_db.values()); 
  }
}
