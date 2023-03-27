public class Duck extends Herbivores implements Flyable, Runable, Floatingable{ // 63) создаем класс утка наследник клааса травоядных в который имплеминтируем интерфейс Flyable (пока отсутствует), Runable >>> 64 Flyable
    public Duck(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfFly() { // Flyable>>>66) реализуем метод speedOfFly()
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly " + speedOfFly() + ", My Floating " + speedOfFloating(); // 69) переопределяем toString >>> 70 Main)
    }
    @Override
    public int speedOfRun() { // 67) реализуем метод speedOfRun()
        return 7;
    }

    @Override
    public String say() { // 68) реализуем метод say()
        return "Krya-krya";
    }
    @Override
    public int speedOfFloating() {
        return 9;
    }
}
