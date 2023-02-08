package Seminar1;

public class sem1_task3_1 {
    public static void main(String[] args){
        int [] arr = new int [9];
        int i = 0;
        int maxx = 0;
        int countt = 0;
        for (i = 0; i < 9; i++){
        arr[i] = (int) (Math.random() * 2);
        System.out.println("arr["+i+"]" + arr[i]);
        if(arr[i] == 1){
        countt++;
        }else{
          if(countt > maxx){
            maxx = countt;
          }  
          countt = 0;
        } 
      }
      if(countt > maxx){
        maxx = countt;
      }  
        System.out.println(maxx);
    }
}
