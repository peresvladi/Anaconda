public class task_2 {
    public static void main(String[] args) {
    //request_dlock();
    int [] arr = new int [1000];
    for(int i = 0; i < 1000; i++){
    arr[i] = i+1;   
    }
    check(arr);
    }
        private static void check(int[] ar) {
        //for (int i = 1; i < ar.length; i++){
        int ar_end_value = ar.length;
        int cycle_result = 0;
        int prime_number = 0;
        int i = 1;
        int cucle_start = 0;
        int cucle_end = 0;
        double value1_elent = 0;
        while(ar_end_value >= cycle_result){
            
            value1_elent = ar[i];
            if(checking_the_element(value1_elent)== 0){
            ar[i-1] = ar[i];
            }else{
                ar[i] = 0;
                            }
            i++;

        }
    }
    
    
        
    static double checking_the_element(double value1_elent){
        double cycle2_result1 = 1;
        double cycle2_result2 = 1;
        int i = 1;
        while(cycle2_result1 !=0 && cycle2_result2 >1){
            i++;
            cycle2_result1 = (value1_elent/i)%1;
            cycle2_result2 = cycle2_result1%10;
        }
        return cycle2_result1;
    }

}