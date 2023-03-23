public class Seal extends Predator implements Floatingable, Runable{
    public Seal(String nickname){
        super(nickname);
    }

    @Override
    public int speedOfRun() {
        return 3;
    }

    @Override
    public int speedOfFloating() {
       return 18;
    }

    @Override
    public String say() {
        return "yyyrh";
    }

    @Override
    public String toString() {
        return "I'm Seal " + super.toString()+ ". My speed is " + speedOfRun() + ", speed of Floating " + speedOfFloating();
    }


    
}