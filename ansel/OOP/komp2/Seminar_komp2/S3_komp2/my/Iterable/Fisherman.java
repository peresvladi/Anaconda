import java.util.Iterator;
/**
 * fisherman
 * @param <fishermans>
 */
public class Fisherman extends Interface {
    
    public Fisherman(String name, Integer age, String typeOfTackle) {
       super(name, age, typeOfTackle);
    }
    public Fisherman() {
    }

    @Override
    public Iterator<Fisherman> iterator() {
    Iterator<Fisherman> it = new Iterator<Fisherman>() {
    @Override
    public boolean hasNext() {
    return index < Skelets.size();
    }
    @Override
    public Fisherman next() {
    return Skelets.get(index++);
    }
    };
    return it;
}
}


    
