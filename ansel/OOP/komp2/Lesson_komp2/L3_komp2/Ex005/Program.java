package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        
         List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
        System.out.println(db);

         db.sort(new AgeComporator());

        System.out.println(db);
        
            
            



    }
    
}

