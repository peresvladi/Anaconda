
-) Способом ООП создаем проект: две точки (имеющие координады х, у)

<details>

<summary></summary>



```javascript
1.1) в файле: Point2D.java

создаем два поля, так:

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
}

1.2.1) Это позволяет в файле текущей папке в данном случае имеющем имя Program.java описать следующую логику (создали новый метод который принимает две точки (см. строка 31), а у точек затем имеется х и у (см. строка 32) с которыми можно далее манипулировать). 1.2.2) Определеяем экземпляр (представитель) класса точка (см. строка 35). 1.2.3) Указываем значения данных полей (см. строка 36, 37). 1.2.3 Далее вторая точка (см. строка 40) оределяем значения ее полей (см. строка 41, 42) и т.д и т.п. 1.2.4) используя метод distance (см. строка 28, 44) определяем значения передвая в него знаянеия двух точек

package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D();
    a.x = 0;
    a.y = 2;
    System.out.println(a.toString());

    Point2D b = new Point2D();
    b.x = 0;
    b.y = 10;
    System.out.println(b.toString());
    System.out.println(distance(a,b));
    }
  
}




```



</details>


-) Наполяем выше созданный класс необходимым поведением, меняем код в файле Program.java просто вызываем констроктор которому передеаем: 0, 2 (см. строка 81) и добавляем приемлемое для этого поведение в класс, в данном случае в файл: Point2D.java (см. строка 97 - 100) В результате в строке 81 появляются значения 0, 2. Однако это ведет к невозможности использование старого констроктора (констроктор без аргументов (примечание: технически можно создать свой конструктор по умолчанию)) 

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a.toString());

    Point2D b = new Point2D();
    b.x = 0;
    b.y = 10;
    System.out.println(b.toString());
    System.out.println(distance(a, b));
    }
  
}

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }
}

```



</details>


-) Можем описать следующий конструктор в файле класса (см. строка 130-132)

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 
}



```



</details>


-) Можем описать следующий конструктор в файле класса (см. строка 169-171) и запустим код.

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 

    public Point2D(int value) {
        x = value;
        y = value;
    }
}

Результат запуска кода (файл - Program.java):

package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a);

    Point2D b = new Point2D(10);
    System.out.println(b);
    
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}

TERMINAL

ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D@3fee733d
ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D@5acf9800
12.806248474865697
vladi@vladi-x540y:~/Education/master$ 

```

Метод toString по умолчанию выводит имена с использованием хэш-кода (см. строки 203, 204)

</details>


-)Создаем метод для приемлевого вывода значения

<details>

<summary></summary>



```javascript

В файле класса создаем метод getInfo(см. строки 245, 246):

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 

    public Point2D(int value) {
        x = value;
        y = value;
    }
    public String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }
}

Вносим изменение в клиентский файл, что бы использовать метод getInfo  и toString (см. строки 267, 270)
package ansel.OOP.komp2.Lesson_komp2;

package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a.getInfo());

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    
    System.out.println(distance(a, b));
    } 
}


Результат запуска:

TERMINAL

x: 0, y: 2
ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D@4c873330
12.806248474865697

ВЫВОД: значение а выводит в установленном методом приемлемом формате, 
а метод toString нет. (см. строки 281, 282).

```



</details>


-) Переопределяем метод toString, для вывода в приемлемом формате (см. строки 237-239)

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 

    public Point2D(int value) {
        x = value;
        y = value;
    }
    public String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}

Запускаем клиентский код (файл Program):


package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a.getInfo());

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}
 
 Результат:

TERMINAL

x: 0, y: 2
x: 10, y: 10
12.806248474865697

ВЫВОД:
Метод getInfo и toString (который переписан на вывод формата 
с помощью метода getInfo) выводят значения в приемлемом формате.






```



</details>



-) Меняем индефикатор доступа public на private в строке 413.

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 

    public Point2D(int value) {
        x = value;
        y = value;
    }
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}

В клиентскоь коде (файл Program) метод getInfo становится недоступным :


package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a.getInfo());

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}
 

ВЫВОД:
Метод getInfo после изменения индефикатора может быть доступен 
только в коде в котором был описан, из любых других мест стал недоступен.






```



</details>


-) Убираем вызов метода getInfo из клиентского кода (файл Program), (см. строки 522)

<details>

<summary></summary>



```javascript

package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(){
        x = 0;
        y = 0;
    } 

    public Point2D(int value) {
        x = value;
        y = value;
    }
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}

Запускаем (файл Program) :


package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a);

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}

Результат:

TERMINAL

x: 0, y: 2
x: 10, y: 10
12.806248474865697

ВЫВОД:
Значения выводятся в удоном формате, т.к. по умолчанию вывод осуществляется
с помощью метода toString, который был переписан для приемлевого вывода.



-) Что такое переопределение.

<details>

<summary></summary>



```javascript

Переопределение это изменение поведения которое было установлено раннее, в перегрузка означает, что в рамках одной сущности переписываются методы отличающиеся сигнатурой (изменяются количество аргументов в одном методе, или тип данных этих аргументов).


```



</details>


-) Возможна ли перегрузка в java по имени аргументов.

<details>

<summary></summary>



```javascript

Нет не возможна. В некоторых других языках програмировния допускается. Например в свифт.


```



</details>


-) Применение принципа Драй (используется код написанный один раз повторно).

<details>

<summary></summary>



```javascript
package ansel.OOP.komp2.Lesson_komp2.L1_komp2;

public class Point2D {
    public int x, y;
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }

    public Point2D(int value){
        this(value, value);
    } 

    public Point2D() {
        this(0);
    }
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}

Запускаем клиентский код (файл Program);

package ansel.OOP.komp2.Lesson_komp2;

import ansel.OOP.komp2.Lesson_komp2.L1_komp2.Point2D;

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
static double distance (Point2D a, Point2D b){
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
   
    System.out.println(a);

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
    
    //System.out.println(b.toString());
    System.out.println(distance(a, b));
    } 
}

Результат:

TERMINAL

x: 0, y: 2
x: 10, y: 10
12.806248474865697

Вывод код работает правильно. (По порядку вызывается строки кода: 608, 609, 604, 605, 599, 600, 601, затем в обратном порядке).

```



</details>


-) Переписать код, что бы защитить его от внешних изменений. Переписываем
нижеследующим образом: 1) строка 680, 2) 695, 3) 731, 4) 732, 5) 702, 
6) 705, 7) 727, 8) 728

<details>

<summary></summary>


```javascript

Переписываем  файл класса и файл клиентского кода:

файл класса:

public class Point2D {
   private int x, y; // 1) закрываем координаты х и у (с помощью private, как на чтение так и на запись, однако по логике нам может понадобиться чтение поэтому продолжаем изменения)
     
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }
   
    public Point2D(int value){
        this(value, value);
    } 

     public Point2D() {
        this(0);
    }
    
    public int getX(){ // 2) создаем методы возвращающие координаты х 
        return x;
    }
    public int getY(){ // и y 
        return y;
    }

    public void setX(int value){ // 5) создаем метод изменить координату х
        this.x = value;
    }
    public void setY(int value){ // 6) создаем метод именить координату у
        this.y = value;
    }
    
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}

файл клиентского кода:

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
    a.setX(12); // 7) получаем доступ к записи
    System.out.println(a.getX()); // 8) получаем доступ к чтению, тем самым разграничили права доступа, т.к. отдельный функционал отвечает за изменение данных, отдельный за чтение данных
    
    System.out.println(a);
    System.out.println(a.getX()); // 3) вносим код метода возращающего координату х (теперь изменить координату возможно только созданием отдельного метода в файле класса)
    System.out.println(a.getY()); // 4) вносим код метода возращающего координату у (теперь изменить координату возможно только созданием отдельного метода в файле класса)

    Point2D b = new Point2D(10);
    System.out.println(b.toString());
   
    } 
}


```



</details>


-) Пример "автодокументации" воспроизводимой из файла класса с помощью 
сниппета: слэш, звездочка, звездочка, enter и с текстовым описанием конструкций
(см. строки 758-760, 764-768), который читается в сплывающих окнах клиентского
кода.

<details>

<summary></summary>



```javascript

/**
 * Это точка 2D
 */
public class Point2D {
   private int x, y; // 1) закрываем координаты х и у (с помощью private, как на чтение так и на запись, однако по логике нам может понадобиться чтение поэтому продолжаем изменения)
    
   /**
    * Это конструктор
    * @param valueX это координата х
    * @param valueY это координата у
    */
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }
   
    public Point2D(int value){
        this(value, value);
    } 

     public Point2D() {
        this(0);
    }
    
    public int getX(){ // 2) создаем методы возвращающие координаты х 
        return x;
    }
    public int getY(){ // и y 
        return y;
    }

    public void setX(int value){ // 5) создаем метод изменить координату х
        this.x = value;
    }
    public void setY(int value){ // 6) создаем метод именить координату у
        this.y = value;
    }
    
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }
}



```



</details>


-) свойство static (см. строки 905, 906)

<details>

<summary></summary>



```javascript
Имеются два файла в одной папке. Файл кода класса, в данном случае Point2D.java,
и файл клиентского кода, в данном случае Program (см. ниже).

Файл кода класса:
/**
 * Это точка 2D
 */
public class Point2D {
   private int x, y; 
    
   /**
    * Это конструктор
    * @param valueX это координата х
    * @param valueY это координата у
    */
    public Point2D(int valueX, int valueY) {
       x = valueX;
       y = valueY;
    }
   
    public Point2D(int value){
        this(value, value);
    } 

     public Point2D() {
        this(0);
    }
    
    public int getX(){ // 2) 
        return x;
    }
    public int getY(){ // и y 
        return y;
    }


    public void setX(int value){ // 5) 
        this.x = value;
    }
    public void setY(int value){ // 6) 
        this.y = value;
    }
    
    private String getInfo() {
    return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
            return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

Файл клиентского кода: 

public class Program {
static double distance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
}
public static void main(String [] args) {
    Point2D a = new Point2D(0, 2);
    System.out.println(a.getX());
    System.out.println(a.getY());

    
    //a.setX(12);
    
    
    System.out.println(a);
    System.out.println(a.getX()); 
    System.out.println(a.getY());
    Point2D b = new Point2D(0);
    System.out.println(b);

    var dis = Point2D.distance(a,b);// функционад который раннее присвоем точкам а, b присваиваем 
    System.out.println(dis);        // dis и далее используем, что как я понял 
                                    // позволяет свойство static, так как  оно дает
                                    // возможность обращаться через имя типа, (а не как
                                    // обычно через конкретный экземпляр класса. 
                                    // В данном случае Point2D - это тип, 
                                    // a - это конкретный экземпляр)
   
    } 
}

```

</details>


-) Что такое Инкапсуляция..

<details>

<summary></summary>

```javascript

Инкапсуляция - это свойство системы, позволяющее объединить данные и методы,
работающие с ними в классе, скрыв детали реализации и защитив от пользователя
этого класса объектов. 


```



</details>



-) Какие неодстатки нижепредставленного кода с точки зрения соблюдения 
   принципов Инкапсуляции и как улучшить код.
Даны два файла в одной папке. Первый файл кода класса - Robot1, второй
файл клиентского кода - Program1.


Первый файл:

public class Robot1 {
    /**Уровень робота */
    public int level;

    /**Имя робота */
    public String name;

    /**
     * Coздание робота
     * @param name Имя робота ! Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot1(String name, int level)
    {
        this.name = name;
        this.level = level;
    }
    // Метод вкл\выкл подсистем

    /**Загружка BIOS */
    public void startBIOS() {System.out.println("Start BIOS...");}


    /**Загрузка OS */
    public void startOS() {System.out.println("Start OS...");}
    
    /**Приветствие  */
    public void sayHi() {System.out.println("Hello word...");}

    /**Выгрузка BIOS */
    public void stopBIOS() {System.out.println("Stop BIOS...");}

    /**Выгрузка OS */
    public void stopOS() {System.out.println("Stop OS...");}

    /**Прощание */
    public void sayBye() {System.out.println("Bye...");}

    /**Работа */
    public void work() {System.out.println("Working...");}
        
    }

    Второй файл:

public class Program1 {
    public static void main(String[] args) {
        // #region Robot1 demo
        Robot1 robot1 = new Robot1("name_1", 1);
        
        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();
        //#rogion

        robot1.level = 100500;
        System.out.printf("%s %d\n", robot1.name, robot1.level);

    }
}

<details>

<summary></summary>



```javascript

1) хаотичный порядок запуска методов безотвественным пользователя может привести в ошибке.
2) можно присвоить посторонним лицом значение Level противоречущее логики работы программы.

 Можно переписать с целью улучшения так:


Первый файл:

 public class Robot2 {
    /**Уровень робота */
    public int level;

    /**Имя робота */
    public String name;

    /**
     * Coздание робота
     * @param name Имя робота ! Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level)
    {
        this.name = name;
        this.level = level;
    }
    // Метод вкл\выкл подсистем


    public void powerOn(){ // 2) вместо набора методов де-
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOf(){ // лаем две конопки.
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){ // 1)для полей описываем отдельные мето-
        return this.level;
    }

    public String getNane(){ //ды только на чтение
        return this.name;
    }

    /**Загружка BIOS */
    public void startBIOS() {System.out.println("Start BIOS...");}


    /**Загрузка OS */
    public void startOS() {System.out.println("Start OS...");}
    
    /**Приветствие  */
    public void sayHi() {System.out.println("Hello word...");}

    /**Выгрузка BIOS */
    public void stopBIOS() {System.out.println("Stop BIOS...");}

    /**Выгрузка OS */
    public void stopOS() {System.out.println("Stop OS...");}

    /**Прощание */
    public void sayBye() {System.out.println("Bye...");}

    /**Работа */
    public void work() {System.out.println("Working...");} // кнопка работы пока остается бесхозной (((
        
    }
 
 
 Второй файл:
    
public class Program2 {
    public static void main(String[] args) {
        // #region Robot2 demo
        Robot2 robot2 = new Robot2("name_2", 1);
        
        System.out.printf("%s %d\n", 
        robot2.getNane(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();


    }
}




```



</details>


-) Какие еще остались недостатки и как еще улучшить код в смысле инкапсуляции.

<details>

<summary></summary>



```javascript

Есть возможность попытки запуска программы без проведения запуска, или наоборот возможна неоднократная инициализация запуска безответсвеным пользователем.

Можно улучшить например так:

mport java.util.ArrayList;

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
        || Robot3.names.indexOf(name) != - 1) // или такое имя было задано ранее
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
// Можно также для большего улучшения добавить:
// public Robot3(String name) // т.е. конструктор имеющий только один аргумент (тогда для правильной работы изменить на this.level = 1; )
// public Robot3()// или описать конструкторо вообще без аргументов где по умолчанию будет
// присваиваться дефолтное имя (this.name = String.ajhvft("DefaultName_%d, defaultIndex++");)
// к этому еще this.level = 1; автоматически добавляя в коллекцию Robot3.names.add(this.name);
// и прописывая состояние выключено: this.state = State.Off; 

Можно кроме того изменить систему включения:

public void power(){ // создаем одну кнопку
    if(this.state == State.Off){ // если система выключена 
        this.powerOn(); // тогда нужно вызвать логику включения
        this.state = State.On; // и поменять состояние на робот включен
        
    }else{
        this.powerOff(); // а, если включен то выключить
        this.state = State.Off; // и поставить соответствующее состояние
    }
    System.out.println();
}



```



</details>


-) Какой принцип нарушает эта конструкция, и как это можно понять.

<details>

<summary></summary>



```javascript

Don`t repeat yourself

Так как мы использовали три конструктора с незначительными отличиями между собой (взяли  Ctr с и два раза Ctr v немного подменив)
Что делать: Написать максимальный конструктор и использовать его.
// правильный конструктор
pudlic Robot3(String name){
    this(name, 1); // конструктор с одним параметром вызывает кон
                  //-структор c двумя аргументами
   public Robot3(){
      this(""); // конструктор без параметров вызывает конструктор с одним параметром передавая ему в качестве аргумента пустую строку
   }
 
}

можно еще добавить private технически скрыв конструктор, тогда пользователю останется только имя либо вообще без каких-либо параметров, остальное система сделает автоматически.


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>


-) -

<details>

<summary></summary>



```javascript

-


```



</details>

