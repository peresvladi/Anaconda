public class Rabbit extends Herbivores implements Runable { // Cat>>>19) Создаем класс кролик наследник травоядных // Rubable >>> 55) имплеминтируем интерфейс Runable (вещаем) кролику ) 
    public Rabbit (String nickname) { //20)...
        super(nickname);
    }

    public String toString(){ // 21)...
        return "I'm rabbit. " + super.toString() + ". My speed is " + speedOfRun(); // Cat >>>30) перегружаем метод (добавляем: + super.toString()) >>> Cow 31) // 62) добавляем в toString строку скорость бега (То же самое делаем для всех животных. А, по окончании этого создаем класс утка)
    }
    public String say(){ // 22) ... >>> Cow 23)
        return "kdfgk";
    }

    @Override                   // 56) Создаем недостающий метод >>> Dog 57)
    public int speedOfRun() {
        return 30;
    }
}
