package job2.practical_task2.task6.computer_store;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class control_details {
    public static void main(String[] args) {
       comp_store c1 = new comp_store();
       c1.Id = 1;
       c1.Manuf_r = "Lenovo";
       c1.Mod_name = "GA-MA790X-UD3P";
       c1.RAM_vol = 16;
       c1.HD_type = "SSD";
       c1.HD_vol = 512;
       c1.colour = "Silver";
       c1.OS_manuf_r = "Microsoft";
       c1.OS_name = "Windows 10 Home";
       c1.Price = 53710.0;

       comp_store c2 = new comp_store();
       c2.Id = 2;
       c2.Manuf_r = "Asus";
       c2.Mod_name = "D1500CEPE-DQ0756";
       c2.RAM_vol = 16;
       c2.HD_type = "SSD";
       c2.HD_vol = 512;
       c2.colour = "Black";
       c2.OS_manuf_r = "without an";
       c2.OS_name = "without an";
       c2.Price = 59510.0;

       comp_store c3 = new comp_store();
       c3.Id = 3;
       c3.Manuf_r = "Asus";
       c3.Mod_name = "VT500QC-HN058";
       c3.RAM_vol = 16;
       c3.HD_type = "SSD";
       c3.HD_vol = 512;
       c3.colour = "Black";
       c3.OS_manuf_r = "Microsoft";
       c3.OS_name = "Windows 10 Home";
       c3.Price = 57000.0;

       comp_store c4 = new comp_store();
       c4.Id = 4;
       c4.Manuf_r = "Acer Aspire";
       c4.Mod_name = "7A715-42G-R6VJ";
       c4.RAM_vol = 8;
       c4.HD_type = "SSD";
       c4.HD_vol = 256;
       c4.colour = "Black";
       c4.OS_manuf_r = "Microsoft";
       c4.OS_name = "Windows 10 Home";
       c4.Price = 59900.0;

       comp_store c5 = new comp_store();
       c5.Id = 5;
       c5.Manuf_r = "MSI";
       c5.Mod_name = "GF 66 KATANA 11SC-1251XPU";
       c5.RAM_vol = 8;
       c5.HD_type = "SSD";
       c5.HD_vol = 256;
       c5.colour = "Black";
       c5.OS_manuf_r = "Microsoft";
       c5.OS_name = "Windows 10 Home";
       c5.Price = 55.28;

       
       
       var comp_stories = new HashSet<comp_store>(Arrays.asList(c1, c2, c3, c4, c5)); 
       ///System.out.println(c1.toString());
       ///System.out.println(c2.toString());
       System.out.println(comp_stories);
       //Set <Integer> Set = new HashSet<>();     
       //System.out.println(comp_stories.contains(c1));
       //System.out.println(comp_stories.contains(c2));
       ////c1.equals(c4);
       //////System.out.println(comp_store.class); 

        /* for (comp_store compstore : comp_stories) {
            //System.out.println(compstore.colour=="Black");
            //System.out.println(compstore.RAM_vol==8);
            //System.out.println(compstore.HD_vol==256);
            //System.out.println(compstore.OS_name == "Windows 10 Home");
        
        } */

        


      

   


/* int find_i = 0;
    System.out.println(find_comp(comp_stories, find_i));
    }
    private static HashSet<comp_store> find_comp(HashSet<comp_store> comp_stors, int fnd_i) {
    for (comp_store comp_store_i : comp_stors) {
    for()   
    }
        return comp_store_i ; */


/* 

        starting();
    }

    private static void starting() {
        System.out.println("Результат: " + calculation());
    }

    static int calculation() {
        int i = 0;
        int source_to_result = 1;
        int choosing_an_action = action();
        int calculation_end_value1 = end_value1();
        int calculation_end_value2 = end_value2();
            if (calculation_end_value2 > 0 && calculation_end_value1 > 0 && (choosing_an_action == 1 || choosing_an_action == 2 || choosing_an_action == 3 || choosing_an_action == 4)) {
            int x = choosing_an_action;
        switch(x){
            case 1 : return calculation_end_value1 + calculation_end_value2;
            case 2 : return calculation_end_value1 * calculation_end_value2;
            case 3 : return calculation_end_value1 - calculation_end_value2;
            case 4 : return calculation_end_value1 / calculation_end_value2;
            default:
            return 0;
            }
            }
            return 0;
    }
    static int action() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Вас приветствует простой калькулятор. Для сложения введите +, для умножения *, для вычитания -, для деления '\'");
        String y = iScan.nextLine();
        switch(y){
            case "+": return 1;
            case "*": return 2;
            case "-": return 3;
            case "/": return 4;
            default:
            return 0;
            }
        }
    static int end_value1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число 1 :");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            //iScanner.close();
            return x;
        }
            return 0;
    }
    static int end_value2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число 2 :");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            //iScanner.close();
            return x;
        }
            return 0; */
    }
      
   
}
