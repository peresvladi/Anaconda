/**
 * k2_sem1_tasr33
 */
public class k2_sem1_tasr33 {

    public static void main(String[] args) {
        int countt = ArrLen();
        int[] arr = new int[countt];
        for (int i = 0; i < countt; i++)
        arr[i] = (int) ( Math.random() * 2 ); 
        check(arr);
         }
                      private static void check(int[] ar) {
                  int ix = 0;
                  int iy = 0;
                  for (int i = 0; i < ar.length; i++){
                  System.out.println("- "+ar[i]);
                        if (ar[i]==1 && i < ar.length-1){
                            ix += 1;
                  }else{
                            int max = ix > iy ? iy = ix : iy;
                            ix = 0;
                            if (i == ar.length-1){
                                if (ar[ar.length-1] == 1){
                                    System.out.println(max + 1);
                                }else{
                                    System.out.println(max + 1);   
                                }
                                      
                        }
                            
     }
                                     
    }                        
    }
                 
                       static int ArrLen(){
                        /* Scanner iScanner = new Scanner (System.in);
                        System.out.println("Введите колличество элементов массива: ");
                        int countt = iScanner.nextInt(); */
                        int countt = 5;
                        return countt;
    }
                        
} 