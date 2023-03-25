


import java.util.ArrayList;
import java.util.List;



public class Zoo { // Cow>>>32) Создаем класс зоопарк 

    private Radio radio = new Radio(); // Radio 45) создаем поле радио 
    private List<Animal> animals = new ArrayList<>(); // 33) создаем List

    public List<Animal> addAnimals(List<Animal> animals){ // 34) создем метод добавления животного 
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() { // 35) делаем геттер энималс (все возвращаем)>>>36) Main
        return animals;
    }

    public List<Sayable> getSayAble(){ // 46) создаем метод который возвращает классы (все разговаривающих) реализующие интерфейс Sayable
        List<Sayable> result = new ArrayList<>(); // 47) в методе создаем новый список который будем заполнять
        for (Animal item : animals) { // 48 цикл для заполнения списка животными
            result.add(item); // 49) добовляем в список животных
        }
        result.add(radio); // 50) добавляем в список радио
        return result; // 51) возвращаем заполненный список >>>Main 52)
    }

    public List<Runable> getRunable(){ // Main >>> 71) Добавляем метод бега
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){ // 72) Добавляем метод полета >>>Main 73)
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public List<Floatingable>getFloatingable(){
        List<Floatingable> result = new ArrayList<>();
        for(Animal item : animals){
            if(item instanceof Floatingable){
                result.add((Floatingable) item);
            }
        }
        return result;
    }

    public Runable getWinner(){ // >>> Main 77) создаем функцию нахождения чемпиона по бегу >>> 78) Main
        List<Runable> runanimals = getRunable();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals) {
            if (winner.speedOfRun() < item.speedOfRun()){
                winner = item;
            }
        }
        return winner;
    }

    public Flyable getWinnerFly(){ // Main 87) Создаем функцию нахождения чемпиона по скорости полета
        List<Flyable> flyanimals = getFlyable();
        Flyable winner = flyanimals.get(0);
        for (Flyable item : flyanimals) {
            if (winner.speedOfFly() < item.speedOfFly()){
                winner = item;
            }
        }
        return winner;
    }

    public Floatingable getWinnerFloating(){
        List <Floatingable> floatinganimals = getFloatingable();
        Floatingable winner = floatinganimals.get(0);
        for(Floatingable item : floatinganimals){
            if(winner.speedOfFloating() < item.speedOfFloating()){
                winner = item;
            }
        }
        return winner;
    }
}
