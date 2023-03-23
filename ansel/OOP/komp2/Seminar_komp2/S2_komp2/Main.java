import java.util.List;

public class Main { //Zoo>>>36) создаем клиентский класс
    public static void main(String[] args) { // 37) создаем точку входа
        Zoo zoopark = new Zoo(); // 38) создаем экземпляр класса зоопарк
        zoopark.addAnimals(List.of(new Cat("Barsik"), new Dog("Sharik"), new Rabbit("Whik"), new Cow("Murka"), new Duck("Krya"), new Butterfly("Yellow"))); // через функцию добавления животных добавляем их в класс зоопарк // Duck >>>70) Добавляем утку >>> Zoo 71) // Butterfly >>> 84) добавляем бабочку
                
        for (Sayable item : zoopark.getSayAble()) {// 38) создаем метод вывода в консоль полученого списка >>> 39) Radio // Zoo>>>52) В этой строке for (Animal item : zoopark.getAnimals()), Animal меняем на Sayadle   и  getAnimals меняем на getSayadle в результате получаем список животных с добавление радио >>> 53) Runable
            System.out.println(item.say());
        }
        System.out.println("---------------------------------------------"); // Zoo 73) создаем разделитель консоли
        for (Runable item : zoopark.getRunable()){ // 74) создаем метод вывода в консоль 
            System.out.println(item);
        }
        System.out.println("---------------------------------------------"); // 75) создаем разделитель консоли
        for (Flyable item : zoopark.getFlyable()){ // 76) создаем метод вывода в консоль >>> 77) Zoo
            System.out.println(item);
        }
        System.out.println("---------------------------------------------"); // Zoo>>>78) создаем разделитель
        System.out.println(zoopark.getWinner()); // 79) Создаем метод вывода чемпиона по бегу в консоль >>> 80) Butterfly

        System.out.println("---------------------------------------------"); // 85) создаем разделитель
        System.out.println(zoopark.getWinnerFly()); // 86) Создаем метод выводе чемпиона по скорости полета в консоль >>> 87 Zoo
    }
}
