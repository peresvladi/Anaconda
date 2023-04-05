package S3_komp2;
/**
 * 1. Релизовать класс User, с полями firstName, lastName, age. Переопределить метод toString().

3. В классе Main создать список пользователей, добавить в его класс Personal, при помощи foreach, задействуя класс Personal, вывести каждого пользователя.

 * User
 */

 public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User (String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    }
    @Override
    public String toString(){
    return String.format("firstName: %s; lastName: %s; age: %d ", firstName, lastName, age);
    }
     
}