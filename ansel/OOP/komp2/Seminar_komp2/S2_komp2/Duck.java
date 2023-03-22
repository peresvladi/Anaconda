


public class Duck extends Herbivores implements Flyable, Runable{ // 63) создаем класс утка наследник клааса травоядных в который имплеминтируем интерфейс Flyable (пока отсутствует), Runable >>> 64 Flyable
    public Duck(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfFly() { // Flyable>>>66) реализуем метод speedOfFly()
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly " + speedOfFly(); // 69) переопределяем toString >>> 70 Main)
    }
    @Override
    public int speedOfRun() { // 67) реализуем метод speedOfRun()
        return 10;
    }

    @Override
    public String say() { // 68) реализуем метод say()
        return "Krya-krya";
    }
}
