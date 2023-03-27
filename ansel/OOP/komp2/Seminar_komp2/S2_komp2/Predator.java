public abstract class Predator extends Animal{ // 5) создаем aбстарктный класс хищников наследник класса Animal
    public Predator(String nickname) { // 6) создаем конструктор который принимает имя nickname
        super(nickname);
    }
    public String feed() { // 7) переопределяем метод feed для класса хищников (едят мясо)  >>> 8) herbivores
        return "meat";
    }
}
