package job2.practical_task2.task6.computer_store;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class comp_store {
public static final String comp_stories = null;
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
String res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
return res;
}

public comp_store(   
){
    this.Id=Id;
    this.Manuf_r=Manuf_r;
    this.Mod_name=Mod_name;
    this.RAM_vol=RAM_vol;
    this.HD_type=HD_type;
    this.HD_vol=HD_vol;
    this.colour=colour;
    this.OS_manuf_r=OS_manuf_r;
    this.OS_name=OS_name;
    this.Price=Price;
}


public String output_RAM() {
return String.format("Id: %d Manuf_r: %s Mod_name: %s RAM_vol: %d", Id, Manuf_r, Mod_name, RAM_vol);
 }

 public String output_HD_vol() {
 return String.format("Id: %d Manuf_r: %s Mod_name: %s HD_vol: %d", Id, Manuf_r, Mod_name, HD_vol);  
}

public String output_OS() {
return  String.format("Id: %d Manuf_r: %s Mod_name: %s OS_manuf_r: %s OS_name:%s", Id, Manuf_r, Mod_name, OS_manuf_r, OS_name);  
}

public String output_colour() {
return String.format("Id: %d Manuf_r: %s Mod_name: %s  colour: %s ", Id, Manuf_r, Mod_name, colour);  
}


/* 
@Override
public String toString() {
    //String res = String.format("Id: %d Manuf_r: %s Mod_name: %s RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name);
    //String res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
    String res = String.format("Id: %d Manuf_r: %s Mod_name: %s OS_manuf_r: %s OS_name:%s", Id, Manuf_r, Mod_name, OS_manuf_r, OS_name);
    //String res = String.format("Id: %d Manuf_r: %s Mod_name: %s  colour: %s ", Id, Manuf_r, Mod_name, colour);
    return res;
}
 */

}
 160 
