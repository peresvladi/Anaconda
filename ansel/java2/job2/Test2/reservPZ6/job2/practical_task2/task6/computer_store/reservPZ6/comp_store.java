package job2.practical_task2.task6.computer_store.reservPZ6;

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

/* public <comp_store> print_colour(){ 
    return " Модель ноутбука:" +Mod_name+ ", Цвет ноутбука: "+color+", id: "+ id;
} */
/* public String print_colour(){ 
    return " Модель ноутбука:" +Mod_name+ ", Цвет ноутбука: "+color+", purring: "+purring+", id: "+ id;
} */
/* @Override
public String toString(int x) {
        switch(x){
        case 1 : return res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
        case 2 : return res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
        case 3 : return res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
        //case 4 : return calculation_end_objprint_colour();// calculation_end_value2;
        default:
        return null;
    
    return res;
} */

@Override
public String toString(){
//public String toString(itn x){ 
    //String res = String.format("Id: %d Manuf_r: %s Mod_name: %s RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name);
    //int y = 0;
    //y = x;
    String res = String.format("Id: %d Manuf_r: %s Mod_name: %s  RAM_vol: %d HD_type: %s HD_vol: %d \ncolour: %s OS_manuf_r: %s OS_name:%s Price: %f", Id, Manuf_r, Mod_name, RAM_vol, HD_type, HD_vol, colour, OS_manuf_r, OS_name, Price);
    return res;
}




/* 
@Override
public boolean equals(Object obj) {
var t = (comp_store) 0;
return ;
}

@Override
public int hashCode() {
return super.hashCode();
} */
}
