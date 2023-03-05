package Java1.job1.practical_task.PZ6.computer_store;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

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
              
       HashSet<comp_store> comp_stories = new HashSet<comp_store>(Arrays.asList(c1, c2, c3, c4, c5));  
        int a = 1;
        while (a >= 1 && a <= 6){
            a = calculation(comp_stories);
        switch(a){
            case 1:HashSet<comp_store> queryComp = new HashSet<>();
            queryComp = c1.findComp(comp_stories, action("\nВведите ID необходимого товара:\n"));
            System.out.println(">>>" +queryComp.toString()); 
            break;
            case 2:for (comp_store el_t : comp_stories) 
                System.out.println(">>>" +el_t.output_RAM());
                break;    
            case 3:for (comp_store el_t : comp_stories) 
                System.out.println(">>>" +el_t.output_HD_vol());
                break;
            case 4:for (comp_store el_t : comp_stories) 
                System.out.println(">>>" +el_t.output_OS());
                break;
            case 5:for (comp_store el_t : comp_stories) 
                System.out.println(">>>" +el_t.output_colour());
                break;
            case 6:System.out.println(comp_stories);
            break;    
                }
           }        
}
public static int calculation(HashSet<comp_store> comp_stories) {
    int i = 0;
    int source_to_result = 1;
    int calculation_end_value1 = end_value1();
            if (calculation_end_value1 == 0){
            System.exit(calculation_end_value1);
        } else{
        if (calculation_end_value1 == 1){
            return 6;}
        if (calculation_end_value1 > 0 && calculation_end_value1 <=6){
        int choosing_an_action = action("\nВведите цифру соотвествующую критерию поиска:\n1 - Поиск по ID;\n2 - RAM\n3 - Объем HD\n4 - Операционная система\n5 - Цвет ноутбука\n6 - Печать всех товаров\n ");
        if (calculation_end_value1 > 0 && (choosing_an_action == 1 || choosing_an_action == 2 || choosing_an_action == 3 || choosing_an_action == 4|| choosing_an_action == 5||choosing_an_action == 6)) {
        return choosing_an_action;
            }
          }
        }
        return 0;
    }
        static int action(String m) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(m);
        String y = iScan.nextLine();
        switch(y){
            case "1": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            default:
            return 0;
            }
        }
    static int end_value1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в каталог ноутбуков. Выберите действие: 1 - Печать всех товаров; 2 - Поиск по каталогу; 0 - Выход\n");
    if (iScanner.hasNextInt()) {
            int x = iScanner.nextInt();
            return x;
        }
            return 0;
    }
}

 

 






    

