package S3_komp2;

import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;

/**
 * 1. Релизовать класс User, с полями firstName, lastName, age. Переопределить метод toString().
2. Создать класс Personal, реализовать интерефейс Iterable<User>.
3. В классе Main создать список пользователей, добавить в его класс Personal, при помощи foreach, задействуя класс Personal, вывести каждого пользователя.

 * User
 */


public class Personal extends Iterable {

    public Personal() {
    }
    List<Personal>personal = new ArrayList<>();

    
}
