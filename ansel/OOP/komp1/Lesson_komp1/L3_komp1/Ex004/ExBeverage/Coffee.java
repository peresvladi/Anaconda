package L3_komp1.Ex004.ExBeverage;

import java.util.Iterator;

import L3_komp1.Ex007.Ingredient;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {

        Iterator<Ingredient> it = new Iterator<Ingredient>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };
        return it;

    }

}
