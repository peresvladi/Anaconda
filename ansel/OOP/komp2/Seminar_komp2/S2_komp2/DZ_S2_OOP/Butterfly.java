public class Butterfly extends Herbivores implements Flyable{ // Main>>>80) создаем класс бабочка наследник травоядных имплементиурующий интерфейс летунов
    public Butterfly(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() { // 81)..
        return 10;
    }
    public String toString(){ // 82) ..
        return "I'm butterfly. " + super.toString() + ". My speed is " + speedOfFly();
    }


    @Override
    public String say() { // 83).. >>>Main 84)
        return "hhhh";
    }
}
