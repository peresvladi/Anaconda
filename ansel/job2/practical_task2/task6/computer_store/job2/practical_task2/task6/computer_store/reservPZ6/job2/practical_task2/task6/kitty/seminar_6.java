package job2.practical_task2.task6.kitty;
import java.util.HashSet;
import java.util.List;


public class seminar_6 {

    public static void main(String[] args) {

   
        
    cat cat1 = new cat();
    cat1.name = "Barsik";
    cat1.color = "yellow";
    cat1.breed = "siberian";
    cat1.gender = "w";
    cat1.purring = true;
    cat1.id = 12345;

    cat cat2 = new cat( "Василий",  44, "brown", "ciberian", "w", true, 23456);

    cat cat3 = new cat( "Евгений",  4, "black", "russian", "f", true, 34567);
    
    //HashSet catSet = new HashSet<>();
    HashSet <cat> catSet = new HashSet<>();
    
    catSet.add(cat1);
    catSet.add(cat2);
    catSet.add(cat3);
    List<cat>queryCat = cat3.findCat(catSet, "f");
    for (cat cat : queryCat) {
        System.out.println(cat.printCat());
    }
}
}

    




