import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_2_1 {
   

    public static void main(String[] args) {
        Integer array[] = new Integer [16];
        for(int i=0; i < array.length; i++){
        array[i] = i;
        }
        check(array);
    }
private static <Integerg> void check(Integer[]arr){
List<Integer> list = (ArrayList<Integer>) Arrays.asList(arr); // преобразование массива в список (минус метода фиксированный размер , нельзя удалять добавлять элементы)
/* ArrayList<Integer> AL2= new ArrayList<>();
AL2 = (ArrayList)AL1.clone() */
ArrayList<Integer> list2 = new ArrayList<>();
list2 =(ArrayList)list.clone();
System.out.println("Original ArrayList : " + list);
	System.out.println("Copied Arraylist : " + list2);

/* ArrayList ArrList2 = (ArrayList)ArrList1.clone(); */


/* ArrayList<Integerg> list2 = new ArrayList<>();
list2 = (ArrayList<Integerg>) ((ArrayList) list).clone();

System.out.println("Copied Arraylist : " + list2); */
}
}


//System.out.println(ArrayList(0));

/* java.util.Iterator<Integer> it = list.iterator();
while(it.hasNext()){

 }

} */
/*  Integer nextList = it.next(); // код работает кроме - remove
 if(nextList.equals(1)){
    it.remove();
     */


  /* it.next();
  it.remove();
  it.next(); */


/* Integer vall =  it.next();
  System.out.println(vall);
  list.remove(vall); */

   
//Iterator <List> listIterator = (Iterator<List>) list.iterator();
//while(listIterator.hashNext()){

 /* List nexList = listIterator.next();
    System.out.println(nexList); */
//List nextList = listIterator.next();
/* while(((Object) listIterator).hashNext())
List nextList = listIterator.next();
if (nextCat.name.equals(1)){
    listIterator.remove(); */




/* Iterator <task_2> task2Iterator = task_2.iterator();

}
private static Iterator<task_2> iterator() {
    return null;
}
} */
/* 

double divider = 2.0;
for (int i = 0; i < list.size(); i++ ){
    
    
    double el_val = (double) list.get(i);
    System.out.println("if (el_val("+ el_val +") != divider("+ divider +") && (el_val("+el_val+") / divider("+divider+"))%2("+(el_val / divider)%2+") == 0){");
    if (el_val != divider && (el_val / divider)%2 == 0){
        System.out.println("ind = " + i + " val = " + el_val);
        list.remove(list[i]);
    if (i == list.size()){
        i = 2;
        divider++;
    } */
    


 
