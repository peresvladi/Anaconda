


public class Cow extends Herbivores implements Runable{ // 23) Создаем класс корова наследник травоядных // Cat>>> 61) Имплиментируем метод Runable корове
    public Cow(String nickname) { //24) ...
        super(nickname);
    }

    public String toString(){ // 25)..
        return "I'm cow" + super.toString() + ". My speed is " + speedOfRun(); // Rabbit >>>31) перегружаем метод (добавляем: + super.toString()) >>> Zoo 32)// 62) добавляем в toString строку скорость бега (То же самое делаем для всех животных. А, по окончании этого создаем класс утка)
    }
    public String say(){ // 26)..>>>Animal 27)
        return "Mu-mu";
    }

    @Override                   // 62) Добавляем недостающий метод 
    public int speedOfRun() {
        return 5;
    }
}