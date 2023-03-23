public class Dog extends Predator implements Runable{ //11) создаем класс собака наследник класса хищник // Rabbit 57) Имлементируем интерфейс Runable собаке
    public Dog(String nickname) { // 12) вставляем конструктор имен
        super(nickname);
    }

    public String toString(){ // 13) переопределяем метод вывода строк >>> 14 Animal
        return "I'm dog. " + super.toString() + ". My speed is " + speedOfRun(); // Animal >>>28) перегружаем метод (добавляем: + super.toString()) >>> Cat 29)// 62) добавляем в toString строку скорость бега (То же самое делаем для всех животных. А, по окончании этого создаем класс утка)
    }
    public String say(){ // Animal >>> 15) переопределяем метод общения >>> Cat 16)
        return "gav-gav";
    }

    @Override                          // 58 Добавляем недостающий метод >>> 59) Cat
    public int speedOfRun() {
        return 20;
    }
}
