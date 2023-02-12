public class task_2 {
    public static void main(String[] args) {
    //request_dlock();
    int [] arr = new int [1000];
    for(int i = 0; i < 100.0; i++){
    arr[i]= i;  
    }
    check(arr);
    }
        private static void check(int[] ar) {
        int i = 1;
        int j = 2;
        int cucle_start = 0;
        int cucle_end = 0;
        int anti_length = 0;
        double divider = 2.0;
        double pr = 0.0;
        int temp = 0;
        for (i = 1; i < ar.length; i++){
            double value1_elent = ar[(ar.length - anti_length)-i]/ divider;
            double value20_elent = ar[(ar.length - anti_length)-i];
            pr = value1_elent%1;
            int properties1_value1 = ar.length - anti_length;
            System.out.println("print 1 : value20_elent(эл.: n/val) " +value20_elent + " " + "value1_elent (эл.: val/d :" +divider+") "+value1_elent+ " " + "% "+pr);
            
            if(0 < value1_elent%1 && value1_elent%1 < 1 && value20_elent != 1){
                temp  =   ar[(ar.length - anti_length)-i];
                ar[(ar.length - anti_length)-i] = -1;
                i++;
                value1_elent = ar[(ar.length - anti_length)-i]/ divider;
                value20_elent = ar[(ar.length - anti_length)-i];
                pr = value1_elent%1;
                System.out.println("print 2: value20_elent(эл.: n/val) " +value20_elent + " " + "value1_elent (эл.: val/d :" +divider+") "+value1_elent+ " " + "% "+pr);
            if (0 == value1_elent%1 || value20_elent == -1){
            if(divider !=ar[(ar.length - anti_length)-i]){
            ar[(ar.length - anti_length)-i] = temp;
            }else{
             int temp2 = 0;
             temp2 = temp;  
            }   
            
            if(ar[(ar.length - anti_length)-i] < 3){
            i = ar.length-(ar.length-1);
                divider++;
            }

        }
        

    }else{
    int temp2;
    ar[(ar.length - anti_length)-i] = -1;

      }
    }
    }
   }

