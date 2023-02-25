package Java1.job1.practical_task.PZ5.task2.find_soft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class input_find_copy2 {
    public static void main(String[] args) throws Exception {
         String str_num;
        // BufferedReader br = new BufferedReader(new FileReader("/home/vladi/Education/master/ansel/java2/job2/Lesson4/job2/practical_task2/task5/find_sort/file_info.txt"));
           BufferedReader b_r = new BufferedReader(new FileReader("Java1/job1/practical_task/PZ5/task2/find_soft/file_info.txt"));
           String str_n;
           String way;
           Map <String, String> next_db = new HashMap<>(); 
           Map <String, String> buck_db = new LinkedHashMap<>();
             
           // Сортируем по алфавиту:        
           buck_db = placeholder("b", buck_db, b_r);
           Map<String, String> sortMap = new TreeMap<>(buck_db);
           sortMap.entrySet().forEach(System.out::println); 


           /* Здесь (т.е. ниже) мы TreeMap с настраиваемым Comparator а в переопределенном compare() мы указали желаемую логику.

           Поскольку у нас нет гарантии, что o1.length() - o2.length() не будет равно 0, простой оператор if гарантирует, что мы сравниваем их лексикографически, если их длина одинакова.
           
           Затем, когда мы определили критерии сортировки для TreeMap , мы использовали putAll() метод , чтобы вставить все элементы из unsortedMap минуты sortedMap . */
           Map<String, String> sortedMap = new TreeMap<>(new Comparator<String>() { 
            @Override
            public int compare(String o1, String o2) { 
            int lengthDifference = o1.length() - o2.length(); 
            if (lengthDifference != 0) return lengthDifference; 
            return o1.compareTo(o2); 
            } 
            }); 
            sortedMap.putAll(buck_db); 
            sortedMap.entrySet().forEach(System.out::println);

             /*  У Map.Entry есть очень удобный метод, который здесь вступает в игру
             - comparingByKey() , который сравнивает ключи, если у них есть
              допустимые методы сравнения. Поскольку мы имеем дело со String s,
               это метод compareTo() , который снова отсортирует String s 
               лексикографически:   

               То, что мы сделали здесь (ниже) потоковый unsortedMap набора «s из Map.Entry 
               объектов. Затем, используя метод sorted() , мы предоставили удобный 
               Comparator созданный с помощью comparingByKey() , который сравнивает 
               данные объекты с их реализацией сравнения по умолчанию. 
               
               После сортировки мы collect() с помощью Collectors.toMap() в новую карту. 
               Конечно, мы будем использовать те же ключи и значения из исходной карты 
               через Map.Entry::getKey и Map.Entry::getValue .

               Наконец, создается новый LinkedHashMap , в который вставляются все эти элементы в 
                отсортированном порядке.
 */


            Map<Object, Object> sMap = buck_db.entrySet().stream() 
            .sorted(Map.Entry.comparingByKey()) 
            .collect(Collectors.toMap( 
            Map.Entry::getKey, 
            Map.Entry::getValue, 
            (a, b) -> { throw new AssertionError(); }, 
            LinkedHashMap::new 
            )); 
            
            sortedMap.entrySet().forEach(System.out::println); 

     
            /* Сортировка ключей HashMap с помощью настраиваемого компаратора
            В качестве альтернативы вы можете использовать свой собственный 
            Comparator вместо того, который сгенерирован 
            Map.Entry.comparingByKey() . Это так же просто, как предоставить
             Comparator.comparing() и передать ему действительное 
             лямбда-выражение :  
             
             Здесь (ниже) мы воссоздали наш настраиваемый компаратор, который сортирует ключи
              по их значению из предыдущих разделов. Теперь String будут отсортированы 
              по их длине, а не по их лексикографическому значению:
             */

             Map<Object, Object> soMap = buck_db.entrySet().stream() 
             .sorted(Comparator.comparing(e -> e.getKey().length())) 
             .collect(Collectors.toMap( 
             Map.Entry::getKey, 
             Map.Entry::getValue, 
             (a, b) -> { throw new AssertionError(); }, 
             LinkedHashMap::new 
             )); 
             
             soMap.entrySet().forEach(System.out::println);


             /* Конечно, вы можете легко переключиться с восходящего на нисходящий порядок, 
             просто добавив - перед e.getKey().length() : */

             Map<Object, Object> tedMap = buck_db.entrySet().stream() 
             .sorted(Comparator.comparing(e -> -e.getKey().length())) 
             .collect(Collectors.toMap( 
             Map.Entry::getKey, 
             Map.Entry::getValue, 
             (a, b) -> { throw new AssertionError(); }, 
             LinkedHashMap::new 
             )); 
             
             tedMap.entrySet().forEach(System.out::println); 

             /* Кроме того, вы можете использовать другие компараторы, такие как 
             Comparator.comparingInt() если вы имеете дело с целочисленными 
             значениями (хотя мы здесь, общий компаратор также работает), Comparator.comparingDouble() или Comparator.comparingLong() чтобы удовлетворить твои нужды.

             Заключение
             В этом руководстве мы рассмотрели, как отсортировать Java HashMap по
              ключу . Первоначально мы использовали TreeMap для сортировки и 
              поддержания порядка отсортированных записей, используя как 
              компаратор по умолчанию, так и настраиваемый компаратор.
             
             Затем у нас есть потоки Java 8 с LinkedHashMap для достижения 
             этой функции, как для стандартных, так и для настраиваемых 
             компараторов в порядке возрастания и убывания. */


    }
    private static String text_numbering(int n) {
        String str_num ="";
        int i = 0;
        for(i = 0; i < 1; i++){
        str_num = String.valueOf(n);
    }
        return str_num;
    }
    
    private static int digital_numbering(String s) {
        int str_num =0;
        int i = 0;
        for(i=0; i < 1; i++){
        str_num = i = Integer.valueOf(s).intValue();
    }
        return str_num;
    }
    
    private static Map<String, String> placeholder(String w, Map<String, String> db, BufferedReader br) throws IOException {
        String str;
        int i = 0;
        while ((str = br.readLine()) !=null) {
            i++;
        switch(w){
                case "n": 
                db.put(text_numbering(i), str);
                break;
                case "b": 
                db.put(str, text_numbering(i));
                break;
                }
        }
        return db;
        }
   

   /*  private static void bulkhead(String way, Map<String, Integer> bck_db, Map<Integer, String> nxt_db, BufferedReader br) throws IOException {
    String str;
    int i = -1;
    while ((str = br.readLine()) !=null) {
    nxt_db.put(i, str);
    bck_db.put(str, i);
    i--;

    } */
    ///System.out.println(nxt_db);
    ///System.out.println(bck_db);

}




