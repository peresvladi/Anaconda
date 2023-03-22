


public abstract class Herbivores extends Animal{ // 8) создаем абстрактный класс травоядных животных наследник класса Animal
    public Herbivores(String nickname) { // 9) создаем конструктор имен
        super(nickname);
    }

    public String feed(){ // 10) переопределяем метод еды для травоядных >>> 11) Dog
        return "herb";
    }
}
