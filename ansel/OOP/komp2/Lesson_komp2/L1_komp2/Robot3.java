import java.util.ArrayList;

public class Robot3 {
    enum State{
        On, Off
    }
    private static int defaultIndex; // 1) добавляем статические поля, что бы использовать их свойство запрещающее использование двух персонажей с одним именем.
    private static ArrayList<String> names;

    static{
        defaultIndex = 1; // 2) для использования указанного свойства потребуется дефолтный начальный индекс со значение 1
        names = new ArrayList<String>(); // 3) для использования указанного свойства потребуется кллекция имен, которую инициализируем как пустую коллекцию
    }
    /** Уровено робота */
    private int level; // 4) оставляем поле уровень робота
    /** Имя робота */
    private String name; // 5) оставляем поле имя

    private State state; // 6) добавляем новое поле состояние, которое описывается выше уканные два состояния включен робот, либо выключен(см. строки 4,5)
    
    /**
     * Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    
     public Robot3(String name, int level){
        if((name.isEmpty() // если имя робота заданное пользователем является пустым
        || Character.isDigit(name.charAt(0))) // или если первый символ имя робота  является цифрой
        || Robot3.names.indexOf(name) == - 1) // или такое имя было задано ранее
     {this.name = String.format("DefaultName_%d", defaultIndex++); // при любом из этих условий задается дефaelтное имя
     }else{
        this.name = name; // если вышеуказанные условия отсутствуют будет использоваться имя введенное пользователем
     }
     Robot3.names.add(this.name);
     this.level = level;
     this.state = State.Off;


     public void power(){
        if(this.state == State.Off){
            this.powerOn();
        }
     }

}
}
// Можно также для улучшения добавить:
// public Robot3(String name) // т.е. конструктор имеющий только один аргумент (тогда для правильной работы изменить на this.level = 1; )
// public Robot3()// или описать конструкторо вообще без аргументов где по умолчанию будет
// присваиваться дефолтное имя (this.name = String.ajhvft("DefaultName_%d, defaultIndex++");)
// к этому еще this.level = 1; автоматически добавляя в коллекцию Robot3.names.add(this.name);
// и прописывая состояние выключено: this.state = State.Off; 

