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
        
    
