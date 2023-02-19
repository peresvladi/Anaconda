import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class task_2{
    public static void main(String[] args) {
        Integer array[] = new Integer [16];
        for(int i=0; i < array.length; i++){
        array[i] = i;
        }
        check(array);
    }
private static void check(Integer[]arr){
List<Integer> list = Arrays.asList(arr); // преобразование массива в список (минус метора фиксированный размер, нельзя удалять добавлять элементы)
new ArrayList<Integer>(list);

Iterator <ArrayList> listIterator = (Iterator<ArrayList>) list.iterator();
while(((java.util.Iterator<Integer>) list).hasNext()){
    ArrayList nextLst = (ArrayList) ((Iterator<ArrayList>) list).next();
    if(list.equals(list)){
        list.remove(7);
        ((Iterator<ArrayList>) list).next();
}
}
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
    


 
