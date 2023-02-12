public class task_2copy {
    public static void main(String[] args) {
    //request_dlock();
    int [] arr = new int [1000];
    for(int i = 0; i < 1000.0; i++){
    arr[i]= i;  
    }
    check(arr);
    }
        private static void check(int[] ar) {
        //for (int i = 1; i < ar.length; i++){
        int ar_end_value = ar.length;
        //doudle cycle_result = 0;
        int prime_number = 0;
        int i = 1;
        int j = 2;
        int cucle_start = 0;
        int cucle_end = 0;
        double value1_elent = 0.0;
        double value2_elent = 0.0;
        for (i = 1; i < ar.length; i++){
            value1_elent = ar[i]/j;
            value2_elent = value1_elent%1;
            if(value2_elent == 0){
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

