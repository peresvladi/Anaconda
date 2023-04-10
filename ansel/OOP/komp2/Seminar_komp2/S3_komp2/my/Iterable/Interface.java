import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Interface implements Iterable<Fisherman> {
    public String name;
    public Integer age;
    public String typeOfTackle;
    
    public int index = 0;

    public Interface(String name, Integer age, String typeOfTackle) {
        this.name = name;
        this.age = age;
        this.typeOfTackle = typeOfTackle;
    }
    public Interface() {
    }

    public List<Fisherman> Skelets = new ArrayList<>();

    public Interface addSkelets(Fisherman fisherman){
    this.Skelets.add(fisherman);
    return this;
}
    @Override
    public String toString() {
    return "<  <  <\nInterface:\nname = " + name + ",\nage = " + age + ", \ntypeOfTackle = " + typeOfTackle + " \n>  >  >\n";
    }
}
