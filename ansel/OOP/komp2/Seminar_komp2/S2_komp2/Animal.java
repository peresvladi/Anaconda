public abstract class Animal implements Sayable { // 1) создаем abdtract класс 42) Sayadle >>> навешиваем (имлеметируем) данный интерфейс
    public String nickname; // 2) создаем поле

    public Animal(String nickname) { // 3) создаем коструктор, что бы инициализировать поле
        this.nickname = nickname;
    }

    // 43) удаляем (т.к. данный метод приходит из интерфейса ): public abstract String feed(); // 4) в созданом абстрактном классе Animal, создаем абстрактный метод feed (обязуемся, что будем его переопределять представляет метод кормления зверей ) >>> 5) Predator >>> 44 Radio
    
    public String toString(){ //Cow >>> 27) переопределяем метод toString  >>> Dog 28) 
        return "My nickname is " + nickname;
    }

    public abstract String say(); // Dog>>> 14) создаем абстрактный метод общения >>> Dog 15)
    
    
    
}

