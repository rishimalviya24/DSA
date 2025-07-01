// import java.util.*;
// //PAIRS----

// public class pairs{
//     public static int pairs(int numbers[]){
//         int tp = 0;
        
//         for(int i=0; i<numbers.length; i++){
//             int current = numbers[i]; /// 2 4 6 8 19
//             for(int j = i+1; j < numbers.length; j++){
//                 System.out.print("(" + current + "," + numbers[j] + ")" );
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " + tp );
//         return 0;

//     }
//     public static void main(String args[]) {
//         int numbers[] = { 2, 4 ,6 ,8 ,10 };
//         pairs(numbers);
        
//     }
// }

//important for interviews ---------- 

// if any array has n elements then how to find the total no. of pairs in that array ----
//  n(n-1)/2
//  logic - if 5 elements haii toh 4 pairs banenge phir 3 pair banenge phir 2 pair banenge phir 1 = 4+3+2+1 = 10 

// time complexity = O(n2) -- nested loop 

import java.util.*;

public class pairs {
    public static int pairs( int numbers[]){
        int tp =0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+ curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" + tp);
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = { 1,2, 3, 4, 5, 6, 7, 8 };
        pairs(numbers);

    }
}