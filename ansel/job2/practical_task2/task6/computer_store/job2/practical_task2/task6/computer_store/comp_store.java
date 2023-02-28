package job2.practical_task2.task6.computer_store;

public class comp_store {
int Id;
String Manuf_r;
String Mod_name;
int RAM_vol;
String HD_type;
int HD_vol;
String colour;
String OS_manuf_r;
String OS_name;
Double Price;


@Override
public String toString() {
    //String res = String.format("Id: %d Manuf_r: %s Mod_name: %s RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name);
    String res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
    return res;
}


}