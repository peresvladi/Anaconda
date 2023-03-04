 package job2.practical_task2.task6.kitty;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class cat {
    String name;
    int age;
    String color;
    String breed;
    String gender;
    Boolean purring;
    int id;
    public String toString() {
        return super.toString();
    }
    public cat() {
    }

    public cat(
        String name,
        int age,
        String color,
        String breed,
        String gender,
        Boolean purring,
        int id

    ){
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        this.purring = purring;
        this.age = age;
        this.id = id;
    }

    public String printCat(){ 
        return " Name:" +name+ ", breed: "+breed+", color: "+color+", purring: "+purring+", id: "+ id;
    }
    
    public List <cat> findCat(HashSet<cat>hashCat, String gndr){
        ArrayList <cat> catList = new ArrayList<cat>();
        for (cat i : hashCat){
        if(i.gender.equals(gndr)){
            catList.add(i);
           }
    }
    return catList;

   
}    
}


