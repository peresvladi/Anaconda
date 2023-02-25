package Java1.job1.practical_task.PZ5.task2.find_soft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class input_find_copy {
    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new FileReader("/home/vladi/Education/master/ansel/java2/job2/Lesson4/job2/practical_task2/task5/find_sort/file_info.txt"));
           BufferedReader b_r = new BufferedReader(new FileReader("Java1/job1/practical_task/PZ5/task2/find_soft/file_info.txt"));
           String str_n;
           Map <Integer, String> next_db = new LinkedHashMap<>();
           Map <String, Integer> buck_db = new LinkedHashMap<>();
           bulkhead(buck_db, next_db, b_r);
           int count = -1;
        
            
            //buck_db.put(str, null);
            //System.out.printf("%s\n", str.substring(0, str.indexOf(" ")));
             // Map <String, Integer> buck_db = new HashMap<>();
    }

   // System.out.println(buck_db.keySet());
    //System.out.println(buck_db.values()); 
  

          private static void bulkhead(Map<String, Integer> bck_db, Map<Integer, String> nxt_db, BufferedReader br) throws IOException {
          String str;
          int i = -1;
          while ((str = br.readLine()) !=null) {
           nxt_db.put(i, str);
           bck_db.put(str, i);
          /* if (bck_db.get(nxt_db.get(cnt)) < 0){
          
          }  */
          int j = 0;
           int y = 0;
         // System.out.println("1 while + nxt_db.get(i).substring(0, str.indexOf(' ') #" + nxt_db.get(i).substring(0, str.indexOf(" "))+ " # != null && #" + bck_db.get(nxt_db.get(i))+"# < 0 ){");
          while(nxt_db.get(i).substring(0, str.indexOf(" ")) != null && bck_db.get(nxt_db.get(i)) < 0 ){
         // System.out.println("2 while + nxt_db.get(i).substring(0, str.indexOf(' ') #" + nxt_db.get(i).substring(0, str.indexOf(" "))+ " # != null && #" + bck_db.get(nxt_db.get(i))+"# < 0 ){");
          y++;
          j--;


         // System.out.println(" 3 nxt_db.get(j)) # "+nxt_db.get(j) +  " #");
         // System.out.println(" 4 nxt_db.get(j).substring(0, str.indexOf(' ')) # "+nxt_db.get(j).substring(0, str.indexOf(" "))+  " #");
          
          
          
          
         // System.out.println(" 5 if (nxt_db.get(i).substring(0, str.indexOf(' ') #" + nxt_db.get(i).substring(0, str.indexOf(" "))+ " # == " + " nxt_db.get(j).substring(0, str.indexOf(' ')) #" + nxt_db.get(j).substring(0, str.indexOf(" "))+" # ){");
          String t1 = "Светлана";
          String t2 = "Светлана";
          //t1 = nxt_db.get(i).substring(0, str.indexOf(" "));
          //t2 = nxt_db.get(j).substring(0, str.indexOf(" ")); 
                
          System.out.println(t1); 
          System.out.println(t2); 
          System.out.println(t1==t2);         
          System.out.println("6 "+ (nxt_db.get(i).substring(0, str.indexOf(" "))==nxt_db.get(j).substring(0, str.indexOf(" "))));
          
          
          if (nxt_db.get(i).substring(0, str.indexOf(" ")).trim() == nxt_db.get(j).substring(0, str.indexOf(" ")).trim()){
          bck_db.put(nxt_db.get(j), y);
           
        }
         //System.out.println(count +" "+ next_db.get(count));
         System.out.println(nxt_db.get(i).substring(0, str.indexOf(" "))+' ' +bck_db.get(nxt_db.get(i)));
         //System.out.println(count +" "+ buck_db.get(next_db.get(count)));
         

    }
i--;
}
}
}


