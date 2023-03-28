package Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

import Ex004.ExBeverage.Ingredient;

public abstract class Beverage 
            implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }

}