import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * fisherman
 */
public class fisherman implements Iterator<String>{

public String name;
public Integer age;
public String typeOfTackle;


public fisherman(String name, Integer age, String typeOfTackle) {
    this.name = name;
    this.age = age;
    this.typeOfTackle = typeOfTackle;
    this.index = 0;
}

int index;

@Override
public boolean hasNext(){
    return index++ <3;
}

@Override
public String next(){
    switch(index){
        case 1:
            return String.format("name: %s", name);
        case 2:
            return String.format("age: %d", age);           
        default:
            return String.format("typeOfTackle: %s", typeOfTackle);
    }
  }
}


    
