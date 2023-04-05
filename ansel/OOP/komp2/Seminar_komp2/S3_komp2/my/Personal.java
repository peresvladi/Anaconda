

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

/**
 * 1. Релизовать класс User, с полями firstName, lastName, age. Переопределить метод toString().
2. Создать класс Personal, реализовать интерефейс Iterable<User>.
3. В классе Main создать список пользователей, добавить в его класс Personal, при помощи foreach, задействуя класс Personal, вывести каждого пользователя.

 * User
 */


public class Personal extends User implements Iterable <User> {

public Personal(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        //TODO Auto-generated constructor stub
    }


List<Personal>person = new ArrayList<>();
   

    public Iterator<User> iter = new Iterator()


    @Override
    public Iterator<User> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    } 

    
}
