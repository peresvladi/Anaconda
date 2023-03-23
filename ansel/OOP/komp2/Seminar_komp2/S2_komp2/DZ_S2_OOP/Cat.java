public class Cat extends Predator implements Runable{ // 16) Создаем класс кошка наследник класса хищники // Dog >>> 59) Имплиментируем Runable кошке 
    public Cat(String nickname) {
        super(nickname);
    }
    public String toString(){ // 17) Переопределяем метод строк
        return "I'm cat. " + super.toString() + ". My speed is " + speedOfRun(); // Dog >>>29) перегружаем метод (добавляем: + super.toString()) >>> Rabbit 30)// 62) добавляем в toString строку скорость бега (То же самое делаем для всех животных. А, по окончании этого создаем класс утка)
    }
    public String say(){
        return "meow-meow"; // 18) Переопределяем метод общения >>> 19) Raddin
    }
    @Override                   // 60) добавляем недостающий метод >>> 61) Cow 
    public int speedOfRun() {
        return 10;
    }
}
