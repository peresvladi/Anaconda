package L3_komp1.Ex002.ExBeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> { // 1) создаем абстрактный класс напиток (Beverage) имплентируя интерфейс итератор (Beverage implements Iterator<Ingredient>)
    List<Ingredient> components; // 2) создаем коллекцию
    int index;
    public Beverage() { // 3) создаем конструктор в котором будет производиться первоначальная настройка
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){ // 4) создаем метод добавления
        components.add(component);
    }

    @Override // 5) переопределяем итератор под логику его дальнейшего использования
    public boolean hasNext() {
        return index < components.size();
    }
    
    @Override // 6) переопределяем итератор под логику его дальнейшего использования
    public Ingredient next() {
        return components.get(index++);
    }
}
