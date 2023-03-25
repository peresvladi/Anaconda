public class Walrus extends Predator implements Runable, Floatingable {

    public Walrus(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfFloating() {
        return 23;
    }

    @Override
    public int speedOfRun() {
        return 2;
    }

    @Override
    public String say() {
       return "urr-urr";
    }

    @Override
    public String toString() {
      return "I'm Walrus" + super.toString() + ". My speed is " + speedOfRun() + " My Floating " + speedOfFloating();
    }
    
}
