package Java1.job1.practical_task.PZ5.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * search_output
 */
public class search_output_copy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Java1/job1/practical_task/PZ5/task2/info_list.txt"));
        String str;
        Map<String, Integer> db = new HashMap<>();
        int i = 1;
        int min = 0;
        String str_g_key = "";
        Integer int_r_val_stor = 0;
        Integer int_r_val = 1;
        while ((str = br.readLine()) !=null) {
        str_g_key = str.substring(0, (Integer) except(str)).trim();
        //int_r_val = db.get(str_g_key);
        //int min = db.containsKey(str_g_key) == true ? db.put(str_g_key, db.get(str_g_key)+1)  : db.get(str_g_key);
        System.out.println(db.get(str_g_key)+1);
        //////int_r_val_stor = db.containsKey(str_g_key) == true ? db.get(str_g_key)+1 : db.get(str_g_key);
        //////System.out.println(db.put(str_g_key, int_r_val_stor));

       // db.put(str.substring(0, (Integer) except(str)).trim(), db.containsKey(str_g_key) == true ? 
       // db.put(str_g_key, db.get(str_g_key)+1)  : db.get(str_g_key));

       ////System.out.printf("%s ", str_g_key);        
    }
    //db.forEach((key, value) -> System.out.println(key + " : " + value));
    br.close();
    }
        private static Object except(String st) {
        return st.indexOf(" ");
    }
    }
    
