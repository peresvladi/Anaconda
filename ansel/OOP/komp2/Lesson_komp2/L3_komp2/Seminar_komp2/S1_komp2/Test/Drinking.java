package Test;

public class Drinking extends Product{
    private Double volume=0.00;
    public Drinking(String name, Double price, Double volume ){
        super(name, price);
        this.volume = volume;
    }
@Override
public String toString(){
return String.format("%s; Vol: %2.2f", super.toString(), volume);
   }  
}
