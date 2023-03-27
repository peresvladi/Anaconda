package Ex002.ExBeverage;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> {
    List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Milk milk){
        components.add(milk);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }
    
    @Override
    public Ingredient next() {
        return components.get(index++);
    }

    public void addComponent(Beans beans) {
    }
}
