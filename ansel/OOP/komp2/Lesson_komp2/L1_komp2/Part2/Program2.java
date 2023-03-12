public class Program2 {
    public static void main(String[] args) {
        // #region Robot2 demo
        Robot2 robot2 = new Robot2("name_2", 1);
        
        System.out.printf("%s %d\n", 
        robot2.getNane(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOf();

        robot2.work();
        robot2.work();
        robot2.work();

        robot2.sayBye();
        robot2.stopOS();
        robot2.stopBIOS();
        //#rogion

        robot2.level = 100500;
        System.out.printf("%s %d\n", robot2.name, robot2.level);

    }
}
