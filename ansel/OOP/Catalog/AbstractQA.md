
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


-) Что такое наследование...

<details>

<summary></summary>



```javascript

Наследование - это свойство системы, позволяющее описать новый класс на основе уже существующего, с частичной или полность заимствующейся функциональностью.

Класс, от которого производится наследование, называется базовым или родительским.

Новый класс-потомком, наследнимом или производным классом.



```



</details>


-) Имеются два файла класса кода в одной папке. Один описывает Magician (Магов). Второй Priest (Жрецов). И один файл клиентского кода Program. Какой принцип нарущается кодом первого и второго файла учитываю, что код приемущественно дублируется и как это исправить.

<details>

<summary></summary>



```javascript

package Part3;
import java.util.Random;

public class Magician {
    private static int number;
    static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }
        
        public Magician(String name, int hp, int mana){
            this.name = name;
            this.hp = hp;
            this.maxHp = hp;
            this.mana = mana;
            this.maxMana = mana;
        }
    
        public Magician() {
            this(String.format("Hero_Magician #%d", ++Magician.number),
            Magician.r.nextInt(100, 200),
            Magician.r.nextInt(50, 150));
        }

        public int Attack() {
            int damage = Magician.r.nextInt(20, 30);
            this.mana -= (int) (damage * 0.8);
            if(mana < 0) return 0;
            else return damage;
        }

        public String getInfo(){
            return String.format("Name: %s Hp: %d Enegry: %d Type: %s",
            this.name, this.hp, this.mana, this.getClass().getSimpleName());
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }
}
    
    
package Part3;
import java.util.Random;

public class Priest{
    private static final String HERO_PRIEST_D = "HERO_PRIEST_D";
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest(String name, int hp, int elixir){
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.elixir = elixir;
        this.maxElixir = elixir;
    }
    public Priest() {
        this(String.format(HERO_PRIEST_D, ++Priest.number),
        Priest.r.nextInt(100, 200),
        Priest.r.nextInt(50, 150));
    }

    public int Attack() {
        int damage = Priest.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if(elixir < 0) return 0;
        else return damage;
    }
    public String getInfo(){
        return String.format("Name: %s Hp: %d Elixir: %d Type: %s",
        this.name, this.hp, this.elixir, this.getClass().getSimpleName());
    }

    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
    }

    public void GetDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -=damage;
        }
    }

}


package Part3;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());
        
    }

}


Ответ: Don't repeat yourself (не повторяйся).

Исправление: 

1) В первую очередь описывается логика справледливая для обеих персонажей.

package Part4;

import java.util.Random;


public class BaseHero {
    protected static int number; // protected и public будут доступны во всех классах наследниках
    protected static Random r;

    protected  String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
        
        public BaseHero(String name, int hp){
            this.name = name;
            this.hp = hp;
            this.maxHp = hp;
        }
    
        public BaseHero() {
            this(String.format("Hero_Priest #%d", ++BaseHero.number),
            BaseHero.r.nextInt(100, 200));
        }

        public String getInfo(){
            return String.format("Name: %s Hp: %d Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }    
}


2) Дополняем код описывающий индивидуальность персонажей.

Для Magician (Магов) так:

package Part4;

import java.util.Random;

public class Magician extends BaseHero { // extends означает, что Magician является наследником (произоводным) BaseHero, и свойства и методы последнего теперь могут использоваться наследником. Соотвественно BaseHero является родительским классом, а Magician дочерним.
    private int mana;
    private int maxMana;

        public Magician(){
            super(String.format("Hero_Magician #%d", ++Magician.number), // super - принятое обращение к базовому (родительскому) классу, this - так же доступно для обращению к базовому классу, но менее удобно (менее читабильно), при чтении и разборе кода.
                    Magician.r.nextInt(100, 200));
            this.maxMana = Magician.r.nextInt(50, 150);
            this.mana = maxMana;
        }
            
        public int Attack() {
            int damage = BaseHero.r.nextInt(20, 30);
            this.mana -= (int) (damage * 0.8);
            if(mana < 0) return 0;
            else return damage;
        }

        public String getInfo(){
            return String.format("%s Mana: %d", super.getInfo(),
            this.mana);
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }
}
    
    
Для Priest (Жрецов) так:

package Part4;

import java.util.Random;

public class Priest extends BaseHero{ // extends означает, что Priest является наследником (произоводным) BaseHero, и свойства и методы последнего теперь могут использоваться наследником. Соотвественно BaseHero является родительским классом, а Priest дочерним.
    
    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.number), // super - принятое обращение к базовому (родительскому) классу, this - так же доступно для обращению к базовому классу, но менее удобно (менее читабильно), при чтении и разборе кода.
            Priest.r.nextInt(100, 200));
        this.maxElixir = Priest.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if(elixir < 0) return 0;
        else return damage;
    }
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), 
        this.elixir);
    }

    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
    }

    public void GetDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -=damage;
        }
    }

}



```



</details>


-) На основе описанного кода возможно создать сразу массив героев (Magician and Priest), для этого можно создать код их генерации...

<details>

<summary></summary>



```javascript
В отдельном файле Teams.java создаем:

package Part4;


import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10; // создаем условное количество всех персонажей
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount); //генерируем количество магов
        int priestCount = teamCount - magicianCount; // от колличества магов будет зависить колличество жрецов

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount]; // создаем массив для хранения жрецов
        Magician[] magicians = new Magician[magicianCount]; // создаем массив для хранения магов

        for (int i = 0; i < priestCount; i++) { // в цике заполняем массив жрецов
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) { // в цикле заполняем массив магов
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }

    }

}
  


```



</details>


-) Что такое Полиморфизм

<details>

<summary></summary>



```javascript

Полиморфизм - это свойство системы, использовать объекты с одинаковым интерфейсом без информации о типе и внтренней структуре объекта.

Полиморфизм  - способность использовать объект вне зависимости от его реализации, благодаря, полиморфной переменной - это переменная, которая может принимать значения разных типов.

Простостая формулировка определеия Полиморфизма:
Под полиморфизмом понимаем возможность положить в переменную базового класса любого из его производных.


```



</details>


-) Демонстрация полиморфизма на примере предыдущих файлов типов Magician и Priest

<details>

<summary></summary>



```javascript

Изменяем файл Program.java следующим образом (остальные файлы предыдущего примера оставляем без изменения):

package Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 public class Program {
    public static void main(String[] args) {
        
        BaseHero hero3 = new Magician(); // Переменной базового уровня присваеваем экземпляр класса Magician
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new Priest(); // Переменной базового уровня присваеваем экземпляр класса Priest
        System.out.println(hero4.getInfo());
        
    }

}

Результат запуска данного клиенстского кода:

TERMINAL

Name: Hero_Magician #1 Hp: 152 Type: Magician Mana: 122
Name: Hero_Priest #1 Hp: 160 Type: Priest Elixir: 69

Вывод: базовый класс не имея кода описывающего специфику экземпляров класса,
работает использую в том числе и данные описывающие экземпляры класса за 
счет использования свойства полиморфизма.



```



</details>


-) Пример использования полиморфизма для модификации метода атаки...

<details>

<summary></summary>



```javascript

Ниже описанные файлы с кодом находятся в одной папке:

I.

package Part4;

import java.util.Random;

public class Priest extends BaseHero{
    
    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Priest.number),
            Priest.r.nextInt(100, 200));
        this.maxElixir = Priest.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    /* public int Attack() {                        // метод атаки жреца бы здесь, но он переносится в базовый класс
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if(elixir < 0) return 0;
        else return damage;
    } */
    
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), 
        this.elixir);
    }

    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
    }

    public void GetDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -=damage;
        }
    }

}

II.

package Part4;

import java.util.Random;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

        public Magician(){
            super(String.format("Hero_Magician #%d", ++Magician.number),
                    Magician.r.nextInt(100, 200));
            this.maxMana = Magician.r.nextInt(50, 150);
            this.mana = maxMana;
        }
            
       /*  public int Attack() {                       // метод атаки мага бы здесь, но он переносится в базовый класс
            int damage = BaseHero.r.nextInt(20, 30);
            this.mana -= (int) (damage * 0.8);
            if(mana < 0) return 0;
            else return damage;
        } */

        public String getInfo(){
            return String.format("%s Mana: %d", super.getInfo(),
            this.mana);
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }
}
    
    
III.


1) выносим метод атаки в базовый класс:

package Part4;

import java.util.Random;


public class BaseHero {
    protected static int number;
    protected static Random r;

    protected  String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
        
        public BaseHero(String name, int hp){
            this.name = name;
            this.hp = hp;
            this.maxHp = hp;
        }
    
        public BaseHero() {
            this(String.format("Hero_Priest #%d", ++BaseHero.number),
            BaseHero.r.nextInt(100, 200));
        }

        public String getInfo(){
            return String.format("Name: %s Hp: %d Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
        }

        public void healed(int Hp){
            this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.maxHp;
        }

        public void GetDamage(int damage){
            if(this.hp - damage > 0){
                this.hp -=damage;
            }
        }  
        
        public void Attack(BaseHero target){ // 1) выносим метод атаки в базовый класс. В качестве аргумента методу будет передоваться переменная 
                                             //    базового типа tartget
            int damage = BaseHero.r.nextInt(10, 20); // 2) с помощью рандомных числа определяем урон атакуемого
            target.GetDamage(damage);
        }
}


IV.

2) В клиентском коде реализуем метод атаки следующим образом:

package Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 public class Program {
    public static void main(String[] args) {
       
        BaseHero hero3 = new Magician(); // создаем мага
        BaseHero hero4 = new Priest(); // создаем жреца

        System.out.println(hero3.getInfo()); // выводим параметры мага сразу после создания
        System.out.println(hero4.getInfo()); // выводим параметры жреца сразу после создания

        hero3.Attack(hero4); // вызываем метод атаки жреца магом
        hero4.Attack(hero3); // вызываем метод атаки мага жрецом
        
        System.out.println(hero3.getInfo()); // выводим параметры мага после атаки
        System.out.println(hero4.getInfo()); // выводим параметны жреца после атаки


        
    }

}



Результат:

TERMINAL

Name: Hero_Magician #1 Hp: 154 Type: Magician Mana: 101 // выводим параметры мага сразу после создания
Name: Hero_Priest #1 Hp: 195 Type: Priest Elixir: 112  // выводим параметры жреца сразу после создания
Name: Hero_Magician #1 Hp: 140 Type: Magician Mana: 101  // выводим параметры мага после атаки
Name: Hero_Priest #1 Hp: 184 Type: Priest Elixir: 112  // выводим параметны жреца после атаки

Вывод: Параметры мага и жреца после атаки понизились. Программа работает согласно своей логики правильно.

```



</details>


-) Используем полиморфизм для создания команды персонажей

<details>

<summary></summary>



```javascript

Переписываем клиентский код следующим образом (остальной код оставляем без изменений):

package Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 public class Program {
    public static void main(String[] args) {
      
    int teamCount = 10;
    Random rand = new Random();
    int magicianCount = 0;
    int priestCount = 0;

    List<BaseHero> teams = new ArrayList<>();
    for(int i = 0; i < teamCount; i++){
        if(rand.nextInt(2) == 0){
            teams.add(new Priest());
            priestCount++;
        }
        else{
            teams.add(new Magician());
            magicianCount++;
        }
        System.out.println(teams.get(i).getInfo());

    }
    System.out.println();
    System.out.printf("magicalCount: %d priestCount: %d\n\n", magicianCount,
    priestCount);

        
    }

}


Результат:

TERMINAL

Name: Hero_Priest #1 Hp: 120 Type: Priest Elixir: 148
Name: Hero_Priest #2 Hp: 122 Type: Priest Elixir: 83
Name: Hero_Magician #3 Hp: 101 Type: Magician Mana: 128
Name: Hero_Magician #4 Hp: 177 Type: Magician Mana: 148
Name: Hero_Priest #5 Hp: 131 Type: Priest Elixir: 109
Name: Hero_Priest #6 Hp: 186 Type: Priest Elixir: 145
Name: Hero_Priest #7 Hp: 187 Type: Priest Elixir: 62
Name: Hero_Priest #8 Hp: 149 Type: Priest Elixir: 102
Name: Hero_Priest #9 Hp: 178 Type: Priest Elixir: 97
Name: Hero_Priest #10 Hp: 195 Type: Priest Elixir: 141

magicalCount: 2 priestCount: 8


Вывод: С использованием принципа полиморфизма создаем команду персонажей.

```



</details>


-) Пример программы контроля мелких продаж

<details>

<summary></summary>



```javascript
Реализована в 5 файлах. 4 файла классов: Product (родительский класс продуктов), WendingMachine (класс методов), CursedProducts(класс дополнительных (скоропортящихся) продуктов), Beer (класс дополнительных (пивных) продуктов), 1 клиентский файл: Main. Реализация:

public class Product {  // 1) объявляем класс Product (схема, шаблон и т.п. )

    private String name; // 2) объявляем переменную (поле name) ;

    private Double price; // 3) объявляем перменную (поле price (цена)) 

    public Product(String name, Double price) { // 4) создаем конструктор инициализирующий 
                                                 //объявленые переменные name и price (цена)
        this.name = name; // this означает что берем значение из поля данного класса name т.е. из этой строки расположенной выше: private String name;  (name без this будет означать, что значение будет забираться из параметра текущего состояния т.е. здесь: public Product(String name, Double price), это расположено в коде на одну строку выше), от куда берется значение поможно посмотреть нажав л. клавишей мыши с Ctr на переменной.
        this.price = price; // this означает что берем значение из поля данного класса price

    }
    public String getName() { // 5)  получение значения переменной privod (метод геттер)
        return name;
    }
    public Double getPrice() { //  6) получение значения переменной privod (метод геттер) переходим в WendingMachige (далее переход будет указан по шаблону: >>>WM)
        return price;
    }
    @Override // 13) переопределяем метод toString, для вывода с возможностью корректного прочтения пользователем
              // (т.к. любой класс наследуется в java от Object и поэтому по умолчанию имеет несколько функций в том числе toString) >>>WM   
    public String toString(){

        return String.format("name = %s ; price = %2.2f ; " , name, price); // 2.2f в строке ограничивает число цифр после точки(запятой) до 2-х символов    }
    }

}

import java.util.ArrayList;
import java.util.List;

public class WendingMachine { // 7) объявляем класс WendingMachine (по логике этого
                              // ООП - машина которая торгует созданным продуктом)
                              // данный класс содержит в первую очередь List (список продуктов)

    public void printList(){ // 26)создаем метод для итерации >>>M
        for (Product prod : this.getProducts()){
            System.out.println(prod);
        }
    }
    public Double getMoney() { // 25) создаем геттер на money
        return money;
    }

    private Double money = 0.0; // 31) Инициализируем  money (возвращаемся и повторно запускаем ) >>>M после запуска и проверки возвращаемся сюда и изменяем toString в нижних строках

    public List<Product> getProducts() { 
        return products;
    }

    private List<Product> products = new ArrayList<>(); // 8) переменной products присваиваем структуру ArrayList (т.е. создаем List в котором будем содержать список продуктов) >>>M 
    // 14) Здесь же делаем геттер переменной products контекстным меню (у меня что-то меню нужное не нашлось, может не там искал)>>>M


    public WendingMachine addProduct(Product product){ // 11) создаем функцию (для работы которой, так же раннеe создали   см. 8) и 10)) с индефикатором addProduct, для добавления продуктов >>>M 
        this.products.add(product);

        return this;
    }

    public Product findProduct(String name){ // 21) создаем метод поиска продукта, который проходит циклом по списку продуктов и возвращаем продукт равный переменной mame. >>>M
        for (Product prod : getProducts() ) {
            if (prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
     }

    public Product buy(String name, Double price){ // 24) Создаем метод поиска товара по цене и его удаления, который так же считает удаление этой суммы с выводом в терминал
        Product something = findProduct(name);
        if (something == null ) return null;
        if (price.equals(something.getPrice())) {
            products.remove(something);
            money += price;
            return something;
        }
        System.out.println("price is wrong");
        return null;
    }

    @Override // 32) переопределяем toString() >>>M
    public String toString(){
        StringBuilder wdProducts = new StringBuilder();

        for (Product prod : this.getProducts() ) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }


}


import java.util. *;
public class Main { // 9) созадем класс клиентского кода c именем Main
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine(); // 10) объявляем переменую store с типом данных WegdingVachine, для создания удобной функции инициализации и возврата конкретных данных продуктов >>>WM

        store.addProduct(new Product("Lays" , 123.45)) // 12) заполняем список продуктов (данная функция возвращаем один и тот же элемент что позволяет выстраивать подобные цепочки, что иногда удобно использовать)>>>P
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fn" , 41.29))
                .addProduct(new CursedProducts("milk", 56.65, 7)) // 20) вносим новый продук который имеет 2(nime, price) наследуемых значения и дополнительное новое значение (longevity) срок годности >>>WM
                .addProduct(new Beer("alcoholfree" , 67.89)) // 39) добавляем новый продук - пиво по конструктору без значения - градусы
                .addProduct(new Beer("notbeer" , 67.89, 9))
                .addProduct(new CursedProducts("milk" , 56.65, 7)); // 40) добавляем новый продук - пиво по конструктору с значением - градусы
        
        for (Product prod : store.getProducts()) { // 15) создаем цикл для вывода продуктов (примечание: в коде занятия на GitHabe строк под 15) нет !) >>>CP
         System.out.println("foreach: "+prod);   
        }
        
        store.printList(); // 27) вызываем метод store.printList();
        System.out.println(store.getMoney()); // 30) вывод в терминал (вылетело в ексепшен, вносим исправления) >>>WM
         
        System.out.println("searching for Lay's"); // 23) Вывод в терминале подписи перед строкой поиска >>>WM 
        System.out.println(store.findProduct("Lays")); // 22) Создаем строку инициализации поиска

        System.out.println("buying Lay's" ); // 29) строка подписи вывода (  см. 28) ) покупрки в терминале
        store.buy("Lays", 123.45); // 28) вывод покупки товара
        System.out.println(store); // 33) после переопределения toString в WendingMachine делам новый вывод в терминал >>>B
        
        System.out.println("buying fan's" );
        store.buy("fan", 43.21);
        System.out.println(store);

        System.out.println("buying a's" );
        store.buy("fan", 4.1);
        System.out.println(store);

        System.out.println("buying a's" );
        store.buy("milk", 56.65);
        System.out.println(store);
    }
}

public class CursedProducts extends Product { // 16) создаем класс для описания сущности скоропортищиеся продукты с более ограниченными сроками годности
                                              // указываем что класс будет наследоваться от класса Product (extends Product)/

    private Integer longevity; // 18) создаем переменную longevity (поле longevity используемое ниже в кострукторе см.: 17))

    public CursedProducts(String name, Double price, Integer longevity) { // 17) создаем конструктор, который принимает унаследованнные поля (вот так: super(name, price);) и дополнительно принимает поле текущего класса: Integer longevity (this.longevity = longevity;)
        super(name, price);
        this.longevity = longevity;
    }

    @Override // 19) перегружаем (ли? так или нет называется? ) toString() c использование наследования значений ( см. строка кода ниже: super.toString())>>>WM
    public String toString(){
        return String.format("%s longevity = %d  " , super.toString(), longevity);
    }

} 

public class Beer extends Product { // 34) создали новый класс продукта - пива

    private Integer alcohol = 0; // 35) объявляеь новое поле градусы

    public Beer(String name, Double price) { // 36) создаем конструктор № 1
        super(name, price);
    }
    public Beer(String name, Double price, Integer alcohol) { // 37 создаем конструктор № 2
        this(name, price);
        this.alcohol = alcohol;

    }
    @Override // 38) переопределяем toString
    public String toString(){
        return String.format("%s alcohol = %d  " , super.toString(), alcohol);
    }
}



```



</details>


-) Изначально были определены следующие принципы ООП:

<details>

<summary></summary>



```javascript

В 70-х годах прошлого столения были определены следующие принципы ООП:
(авторы: АланКей)
1)Инкапсюляция
2)Наследование
3)Полиморфизм
4)Абстракция (в настоящее время иногда этот принцип включают, иногда нет) указывает, что необходимо сначала сформулировать бизнес логику хотя бы минимальным набором действий с которым дальше будет вестись работа. В java Абстракция представлена классами и интерфейсами (представляет возможность множественного наслеования).
5)Посылка сообщений (выродилось в вызов метода из класса через точку)
6)Не дублировать код

```



</details>


-) Пример использования абстрактных классов и интерфейсов

<details>

<summary></summary>



```javascript

Логика: взери зоопарк. Состоит из 15 файлов. Файл Animal (Прородитель всех классов, использует интерфейс Sayable). Нerbivores (Наследник Animal, Прородитель всех травоядных). Predator (Наследник Animal, Прородитель всех хищников). Butterfly (класс бабочка, наследник Herbivores, использует итерфейс Flyable и наследуемый от прородителя Animal интерефейс Sayable). Cat (класс кошка, наследник Predator, использует итерфейс Runable и наследуемый от прородителя Animal интерефейс Sayable). Cow (класс корова, наследник Herbivores, использует итерфейс Runable и наследуемый от прородителя Animal интерефейс Sayable). Dog (класс собака, наследник Herbivores, использует итерфейс Runable и наследуемый от прородителя Animal интерефейс Sayable). Duck (Класс утка, наследник Herbivores, использует итерфейс Runable, Flyable и наследуемый от прородителя Animal интерефейс Sayable). Rabbit (класс кролик, наследник Herbivores, использует итерфейс Runable и наследуемый от прородителя Animal интерефейс Sayable). Radio (класс радио, использует итерфейс Sayable). Runable (интерфейс бега со свойсовом скорость). Sayable (интерфейс разговора). Flyable (интерфейс полета). Main (файл клиентсткого кода, содержащий точку входа) 

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

public abstract class Herbivores extends Animal{ // 8) создаем абстрактный класс травоядных животных наследник класса Animal
    public Herbivores(String nickname) { // 9) создаем конструктор имен
        super(nickname);
    }

    public String feed(){ // 10) переопределяем метод еды для травоядных >>> 11) Dog
        return "herb";
    }

public abstract class Predator extends Animal{ // 5) создаем aбстарктный класс хищников наследник класса Animal
    public Predator(String nickname) { // 6) создаем конструктор который принимает имя nickname
        super(nickname);
    }
    public String feed() { // 7) переопределяем метод feed для класса хищников (едят мясо)  >>> 8) herbivores
        return "meat";
    }
}

public class Butterfly extends Herbivores implements Flyable{ // Main>>>80) создаем класс бабочка наследник травоядных имплементиурующий интерфейс летунов
    public Butterfly(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() { // 81)..
        return 10;
    }
    public String toString(){ // 82) ..
        return "I'm butterfly. " + super.toString() + ". My speed is " + speedOfFly();
    }


    @Override
    public String say() { // 83).. >>>Main 84)
        return "hhhh";
    }
}

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

public class Dog extends Predator implements Runable{ //11) создаем класс собака наследник класса хищник // Rabbit 57) Имлементируем интерфейс Runable собаке
    public Dog(String nickname) { // 12) вставляем конструктор имен
        super(nickname);
    }

    public String toString(){ // 13) переопределяем метод вывода строк >>> 14 Animal
        return "I'm dog. " + super.toString() + ". My speed is " + speedOfRun(); // Animal >>>28) перегружаем метод (добавляем: + super.toString()) >>> Cat 29)// 62) добавляем в toString строку скорость бега (То же самое делаем для всех животных. А, по окончании этого создаем класс утка)
    }
    public String say(){ // Animal >>> 15) переопределяем метод общения >>> Cat 16)
        return "gav-gav";
    }

    @Override                          // 58 Добавляем недостающий метод >>> 59) Cat
    public int speedOfRun() {
        return 20;
    }
}

public class Duck extends Herbivores implements Flyable, Runable{ // 63) создаем класс утка наследник клааса травоядных в который имплеминтируем интерфейс Flyable (пока отсутствует), Runable >>> 64 Flyable
    public Duck(String nickname) {
        super(nickname);
    }
    @Override
    public int speedOfFly() { // Flyable>>>66) реализуем метод speedOfFly()
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly " + speedOfFly(); // 69) переопределяем toString >>> 70 Main)
    }
    @Override
    public int speedOfRun() { // 67) реализуем метод speedOfRun()
        return 10;
    }

    @Override
    public String say() { // 68) реализуем метод say()
        return "Krya-krya";
    }
}

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

public class Radio implements Sayable { // Main>>>39) создаем класс Radio 44) Animals >>>  тоже делаем имплемент сэйбл >>> 45) Zoo
    public String say(){ // 40) Создаем метод общения (вещания) >>>41) Sayble
        return "HiHiHi";
    }
}

public interface Runable { // Main>>>53) создаем интерфейс Runable животных которые могут бегать
    int speedOfRun(); // 54) создаем метод интерфейса устанавливающий возможность и скорость бега животного >>> Rabbit 55)
}

public interface Sayable { //Radio>>> 41) Создаем данный интерфейс Sayable, что бы включить радио
    String say(); // резервируем метод интерфейса для использования в объекте который его будет имплементировать >>> 42) Animals
}

public interface Flyable { // 64) cоздаем интерефейс летающих
    int speedOfFly(); // 65) создаем метод летающих >>>Duck 66)
}



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


}


```



</details>


-) Пример реализации абстрактного класса в экземплярах класса

<details>

<summary></summary>



```javascript

Создаем файл абстрактного класса Foo.java
с абстрактными членами имеющий следующий код:

package Ex000;

public abstract class Foo {
    public abstract void m1();
    public abstract void m2();

    
}

Создаем файл клиентского кода Program.java с кодом:

package Ex000;

public class Program {
    public static void main(String[] args) {
        Foo foo = new Foo();
    }
}

Итог: В последней строке имя нового экземпляра класса:  Foo(); - java выделяем красным, код не годен, т.к. невозможно создать на прямую экземпляр абстрактного класса имеющего в своем коде одни только абстрактные члены.
    Однако при наборе данного кода java обозначает предложение кода с анонимными значениями при выборе и редактировании котого по предлагаемому образцу получаем код:

package Ex000;

public class Program {
    public static void main(String[] args) {
       
       Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1");
            }
            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
         foo1.m1();
    }
    
} 

При запуске код выводит в терминал значение экземпляра класса foo1.m1();
Вывод: код работает. Таким образом в клиентском коде мы создали иерархию методов абстрактного класса (имеющего в коде тоолько абстратные члены) и через данную иерархию в клиентстком коде (файле),получили ссылку на сам абстрактный класс, после чего использовали эти методы передав им необходимую логику.

```



</details>


-) Примеры использования иттератора.

<details>

<summary></summary>



```javascript

I. Для коллеции например List:

1-6) создаем цифоровую коллекцию
7) На данном созданном экземпляре коллекции обращаемся к методу иттератор и приводим коллекцию к типу иттератор
8, 9) использую цикл и методы иттератора выводим в панель значения элементов коллекции.

package Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); // 1)
        nums.add(1); // 2) 
        nums.add(12); // 3)
        nums.add(123); // )4
        nums.add(1234); // )5
        nums.add(12345); // 6)

        Iterator<Integer> iter = nums.iterator(); // 7) На данном созданном экземпляре коллекции обращаемся к методу иттератор и приводим коллекцию к типу иттератор 
        while (iter.hasNext()) { // 8) используем цикл и методы иттератора 
            System.out.println(iter.next()); // 9) использую цикл и методы иттератора выводим в панель значения элементов коллекции.
        }
    Вывод: данная схема годна. Здесь используется: точка затем итератор (nums.iterator(); // 7) На данном созданном экземпляре коллекции обращаемся к методу иттератор и приводим коллекцию к типу иттератор), так как мы явно обращеаемся к методу. 

        II. Для экземпляра класса:

        1) создаем класс Worker ( с 2-14) полями и 15, 16) конструктором) в который 1.1) имплентируем интерфейс - итератор

        17) создаем индекс который имеет логику инкремента при каждом следуеющем действии

        18, 19) в услокие логики кроме того включено, что после 4 действия (перехада к последнему 4-му полю, т.к. всего имеется 4 поля) индекс значение более не возвращает, т.е.больше делать ничего будет не надо

        20-30) создаем метод некст который будет возвращать определенную в его кейсах логику в зависимости от текущего значения индекса (но не более 4).
       
       package Ex002;

import java.util.Iterator;

public class Worker implements Iterator<String> { // 1 и 1.1)
    public String firstName; // 2) создаем поля
    public String lastName; // 3)
    public int age; // 4
    public int salary; // 5)

    public Worker(String firstName, // 6) 
            String lastName, // 7)
            int age, // 8)
            int salary) { // 9)
        this.firstName = firstName; // 10)
        this.lastName = lastName; // 11)
        this.age = age; // 12)
        this.salary = salary; // 13)
        this.index = 0; // 14)
    }

    public String fullName() { // 15) создаем конструктор
        return String.format("%s %s", firstName, lastName); // 16)
    }

    int index; // 17) создаем индекс который имеет логику инкремента при каждом следуеющем действии

    @Override
    public boolean hasNext() { // 18) в услокие логики кроме того включено, что после 4 действия (перехада к последнему 4-му полю, т.к. всего имеется 4 поля) индекс значение более не возвращает, т.е.больше делать ничего будет не надо
        return index++ < 4; // 19)
    }

    @Override // 20)
    public String next() { // 21)
        switch (index) { // 22)
            case 1: // 23)
                //return firstName;
                return String.format("firstName: %s", firstName);  // 24)
            case 2:  // 25)
                //return lastName;
                return String.format("lastName: %s", lastName); // 26)
            case 3: // 27)
                //return age;
                return String.format("age: %d", age); // 28)
            default: // 29)
                //return salary;
                return String.format("salary: %d", salary); // 30)

        }

        31) Создем клиентский файл Program.java из которого запускаем клиентский код:

        package Ex002;



import java.util.Iterator;


public class Program {
    public static void main(String[] args) {

       
        Worker worker = new Worker("Имя", "Фамилия", 23, 4567);

        Iterator<String> components = worker;

        while (components.hasNext()) {
         System.out.println(worker.next());
    }
       
    }
}
    
Вывод: метод годен, в данном методе в том числе  экземпляр типа worker напрямую кастуем к итератору (вот так: Iterator<String> components = worker;)

    


```



</details>


-) Более сложный пример использования итератора (сценарий создание напитка и перебор его компонентов)

<details>

<summary></summary>



```javascript

I. Создаем файл Beverage (напиток) и реализуем в нем следующий код:

package Lesson_09.Ex002.ExBeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> { // 1) создаем абстрактный класс напиток (Beverage) имплентируя интерфейс итератор (Beverage implements Iterator<Ingredient>)
    List<Ingredient> components; // 2) создаем коллекцию
    int index;
    public Beverage() { // 3) создаем конструктор в котором будет производиться первоначальная настройка
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){ // 4) создаем метод добавления
        components.add(component);
    }

    @Override // 5) с помощью медов переопределяем итератор под логику его дальнейшего использования
    public boolean hasNext() {
        return index < components.size();
    }
    
    @Override // 6) с помощью методов переопределяем итератор под логику его дальнейшего использования
    public Ingredient next() {
        return components.get(index++);
    }
}

II. Создаем файл Coffee (коффе) в котором реализуем следующий код: 

package Lesson_09.Ex002.ExBeverage;

public class Coffee extends Beverage { // 7) создаем класс Coffee (коффе) являющийся наследником класса Beverage (напиток), который соотвественно наследует все методы этого класса (класса Beverage)
    
}

III. Созадем абстрактный класс Ingredien (ингредиент) в котором реализуем следующий код:

package Lesson_09.Ex002.ExBeverage;

public abstract class Ingredient {
    public String brand; // 8) содержит условное наименование - brand

    public Ingredient(String brand) { // 9) конструктор инициализирует - brand
        this.brand = brand;
    }

    @Override // 10) перегружаем метод toString
    public String toString() {
        return brand;
    }
}

VI. Создаем ингредиенты:

1 - файл(класс) Вeans (зерна) реализуя код: // 10)

package Lesson_09.Ex002.ExBeverage;

public class Вeans extends Ingredient {

    public Вeans(String brand) {
        super(brand);
    }    
}

2 -  файл(класс) Water (вода) реализуя код: // 11)
package Lesson_09.Ex002.ExBeverage;

public class Water extends Ingredient {

    public Water(String brand) {
        super(brand);
    }    
}
3  - файл(класс) Milk (молоко) реализуя код: // 12)
package Lesson_09.Ex002.ExBeverage;

public class Milk extends Ingredient {

    public Milk(String brand) {
        super(brand);
    }    
}

V. Создаем файл (класс) Program клиентского кода 

package Lesson_09.Ex002;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lesson_09.Ex002.ExBeverage.*;

public class Program {
    public static void main(String[] args) {

        
        Beverage latte = new Coffee(); // 13) создаем экземпляр класса с именем latte (латте) типа Coffee (коффе)
        latte.addComponent(new Water("Вода")); // 14) в экземпляр класса latte добавляем воду
        latte.addComponent(new Вeans("Зёрна")); // 15) в экземпляр класса latte добавляем зерна
        latte.addComponent(new Milk("Молоко")); // в экземпляр класса latte добавляем молоко
        
        Iterator<Ingredient> iterator = latte; // 16) c помощью итератора перебираем (выводим последовательно в панель) ингредиенты экземпляра класса 
        while (iterator.hasNext()) { // 17)
        System.out.println(iterator.next()); // 18)
        }

        
    }
}


```



</details>


-) Пример реализации интерфейса - Iterable позволяющего использовать для перебора цикл foreach

<details>

<summary></summary>



```javascript

I.

package Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

import Ex004.ExBeverage.Ingredient;

public abstract class Beverage 
            implements Iterable<Ingredient> { // 1) Создаем абстрактный класс Beverage (напиток), в который имплиментируем интерфейс - итерабл ( Iterable  <= !), закрытый  (или можно сказать - параметрированный) типом <Ingredient>
            
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }

}

	II.
	
	
	
package Ex004.ExBeverage;

import java.util.Iterator;

import Ex004.ExBeverage.*;

public class Coffee extends Beverage {

    @Override // 2) итератор переопределяем под логику использования (применяем анонимные классы)
    public Iterator<Ingredient> iterator() {

        Iterator<Ingredient> it = new Iterator<Ingredient>() {

            private int index = 0;

            @Override  // 3) итератор переопределяем под логику использования (применяем анонимные классы, здесь же внутри данного итератора (либо внутри кода добавления продукта) можно влючить код логика которого не позволит вносить (в нашем случае выводить в панель) например повторяющиеся ингредиенты)
            
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };
        return it;

    }

}

package Ex004.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}

package Ex004.ExBeverage;

import Ex004.ExBeverage.Ingredient;

public class Water extends Ingredient {

    public Water(String brand) {
        super(brand);
    }    
}


package Ex004.ExBeverage;

import Ex002.ExBeverage.Ingredient;

public class Вeans extends Ingredient {

    public Вeans(String brand) {
        super(brand);
    }    
}

package Ex004.ExBeverage;

import Ex004.ExBeverage.Ingredient;

public class Milk extends Ingredient {

    public Milk(String brand) {
        super(brand);
    }    
}


package Ex004;

import Ex004.ExBeverage.Coffee;
import Ex004.ExBeverage.Water;


public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {   // 4) в клиентском коде появляется возможность использовать оператор foreach, который мы и используем для перебора компонентов
        
        
            System.err.println(ingredient);
        }
    }
}



```


</details>


-) Добавляем проверку на наличие добаляемого элемента в коллекцию, для отмены дубликатов добавления

<details>

<summary></summary>

```javascript
package Ex007;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage
        implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {

        if (!(components.indexOf(component) != -1)) // ingredient => 4) логический оператор установливает, что если ингредиент уже в коллекции имеется, то действие по добавлению аналогичного ингредиента не выполняется
            components.add(component);
    }

}

package Ex007;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {

        Iterator<Ingredient> it = new Iterator<Ingredient>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }

        };
        return it;

    }

}


package Ex007;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) { // 1) определяем, что значит и для чего нужен equals
        Ingredient t = (Ingredient) obj; // 2)
        return t.brand == this.brand;   // 3) что означает равенство => Beverage
    }
}

package Ex007;

public class Вeans extends Ingredient {

    public Вeans(String brand) {
        super(brand);
    }    
}

package Ex007;

public class Milk extends Ingredient {

    public Milk(String brand) {
        super(brand);
    }    
}

package Ex007;

public class Water extends Ingredient {

    public Water(String brand) {
        super(brand);
    }    
}


public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("OrangeWater"));
        latte.addComponent(new Water("LemonWater"));
        latte.addComponent(new Water("LemonWater"));
        latte.addComponent(new Water("LimeWater"));
        latte.addComponent(new Water("CleanWater"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}


```

</details>




-) Пример сортировки чисел с использование интерфейса - Comparable  и метода коллекции Collections.

<details>

<summary></summary>



```javascript




package Ex005;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker>{

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
    
}


package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }
}


package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        numbers.add(r.nextInt(1,20));
        }

        System.out.println(numbers); // вывод листа в панель без сортировки
        Collections.sort(numbers); // сортировка элементов листа
        System.out.println(numbers); // вывод листа в панель после сортировки
        

    }
}

// Вывод: код годен для java.

```


</details>


-) Пример сортировки экземпляров класса с помощью интерфейса - Comparator  и метода  коллекции Collections, по критерию age (возраст)

<details>

<summary></summary>


```javascript

package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }
}


package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        
         List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
        System.out.println(db);

         Collections.sort(db); // сортировка с использованием коллекции Collections 

        System.out.println(db);
    
    }
}


// Вывод: Работает, сортировка произошла по возрасту (age). Сортировка работает так как в классе Worker имплементируем интерфейс  - Comparable<Worker> и в код файла Worker помещаем метод: compareTo, который содержит инфомацию о том по какому критерию будет проводится сравнение экземпляров класса (в данном случае по критери - age т.е. возраст) как будет проводится сравнение экземпляров класса. Кроме того согласно стандартного метода установленного документацией java: Если значение первого экземпляра класса больше второго, вовращается 1. Если меньше -1. Если значения ровны - 0.

```

</details>

-) Пример сортировки экземпляров класса с помощью интерфейса - Comparator  и метода  коллекции Collections (в классe Worker переписываем с 1 - 6) на 7) упрощая логику сортировки переписывая стандартную предусмотренную в документации java) и переписываем критерий сортировки на calary (по размеру зарплаты)

<details>

<summary></summary>

```javascript

package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        /* if (this.age > o.age)    // 1)
            return 1;               // 2)
        else if (this.age < o.age)  // 3)
            return -1;              // 4)
        else                        // 5)
            return 0; */            // 6)
        return Integer.compare(this.salary, o.salary);                    // 7)
    }
}

package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        
         List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
        System.out.println(db);

         Collections.sort(db); // сортировка с использованием коллекции Collections

        System.out.println(db);
    
    }
}


Вывод: такой упрощенный вариант кода для java годен

```

</details>

-) Пример сортировки экземпляров класса с помощью интерфейса - Comparator и метода  коллекции Collections (в классe Worker переписываем с 1 - 6) на 7) упрощая логику сортировки переписывая стандартную предусмотренную в документации java) и переписываем критерий сортировки на calary (по размеру зарплаты) и добавляем еще один вывод в панель с сортировкой использующей лямбт метод по критерюи age (возраст)

<details>

<summary></summary>

```javascript

package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        /* if (this.age > o.age)    // 1)
            return 1;               // 2)
        else if (this.age < o.age)  // 3)
            return -1;              // 4)
        else                        // 5)
            return 0; */            // 6)
        return Integer.compare(this.salary, o.salary);                    // 7)
    }
}

package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();
        
         List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
        System.out.println(db); // вывод в панель до сортировки

         Collections.sort(db); // сортировка с использованием коллекции Collections

        System.out.println(db); // вывод в панель после предыдущей сортировки

        db.sort((w1, w2)-> Integer.compare(w1.age, w2.age)); // сортировка по критерию age с использованием лямбдт метода

        System.out.println(db); // вывод в панель после предыдущей сортировки
    
    }
}

Вывод: Для java код годен.

```

</details>

-) Пример сортировки экземпляров класса с помощью интерфейса - Comparator и метода AgeComporator (файл AgeComporator) в переопределенной в сторону упрощения логики сортировки с перегрузкой сортировки по другому критерию (был критерий сортировки Worker по размеру зарплаты, перегружаем на сортировку по возрасту)

<details>

<summary></summary>

```javascript

package Ex005;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker>{

    @Override // коомментарий: данный переопределeнный код устанавливает критерии сравнения экземпляров класса
    public int compare(Worker o1, Worker o2) {
        // return Integer.compare(o1.salary, o2.salary);  // 3) было для сортировки по зарплате (salary) 
        return Integer.compare(o1.age, o2.age); // 4) так,  переписали для сортировки по возрасту (age)
    }
    
}

package Ex005;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
    // return Integer.compare(this.salary, o.salary); // 1) былы сортировка по зарплате (salary)
    return Integer.compare(this.age, o.age); // 2) так переписали для сортировки по возрасту (age) 
    }
}

package Ex005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        
         List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
         }
        System.out.println(db); // вывод в консоль без сортировки

         db.sort(new AgeComporator()); // сортировка с переопределеным корпоратором и использованием метода AgeComporator()

        System.out.println(db); // вывод в консоль после сортировки
    
    }
}

Вывод: переписали файл Worker (1-2)) и файл ageComparator (3-4)), в результате выполняется сортировка по возрасту, код годен для java.

```

</details>

-) Задание по ООП S3: 1. Реализовать класс User, с полями,  firstName, LastName, age, переопределить метод toString().

<details>

<summary></summary>

```javascript

-


```


</details>


-) Задание по ООП S3: 2. Создать класс Personal, реализовать интерфейс Iterable<User>

<details>

<summary></summary>



```javascript

-


```



</details>


-) Задание по ООП S3:3. В классу Main создать список пользователей, добавить его в класс Personal, при помощи foreach, задействую класс Personal, вывести каждого пользователя.

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

