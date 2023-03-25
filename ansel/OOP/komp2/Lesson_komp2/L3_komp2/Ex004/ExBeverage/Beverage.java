package L3_komp2.Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

import L3_komp2.Ex007.Ingredient;

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