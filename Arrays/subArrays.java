// import java.util.*;
// //SubArrays------

// public class subArrays{
//     public static int subArrays(int numbers[]){
//       int ts = 0;
        
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//             for(int k = start; k <= end; k++ ){
//                 System.out.print(numbers[k] + " "); //SubArrays
//             } 
//             ts++;
//             System.out.println();
//             } 
//         System.out.println();
//         }
//         System.out.println("total subArrays: "+ ts);
//         return 0;
//     }
//     public static void main(String args[]){
//         int numbers[] = { 2, 4 , 6 , 8 , 10 };
//         subArrays(numbers);

//     }
// }

// import java.util.*;
// //SUM OF SUBARRAYS ----------------
// public class subArrays {
//     public static int subArrays(int numbers[]) {
//         int largest = Integer.MIN_VALUE; // - infinity
//         int smallest = Integer.MAX_VALUE;
//         int ts = 0;

//         for(int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for(int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 int sum = 0;

//                 for(int k = start; k <= end; k++) {
//                     System.out.print(numbers[k] + " ");
//                     sum += numbers[k]; // ✅ yahan value add karni hai
//                 }

//                 ts++;
//                 System.out.print(" => Sum: " + sum);
//                 System.out.println();
//             }
//         }

//         System.out.println("Total subarrays: " + ts);
//         return 0;
//     }

//     public static void main(String args[]) {
//         int numbers[] = { 2, 4 , 6 , 8 , 10 };
//         subArrays(numbers);
//     }
// }


import java.util.*;
public class subArrays {
    public static int maxSubarraySum(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=0; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=0; k<=end; k++){
                    //SubArray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;   
                }
            }
        }
        System.out.println("max sum = "+ maxSum);
        return 0;
    }
    public static void main(String args[]){
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);

    }
}

time complexity due to three nexted loops O(n3) its is  ye sabse basic problem haii toh solve this question.


// isse optimise way to solve this problem is prefix sum 

// prefix sum ---- 
ek new array banake usko name dedo prefix array 
isme ith element tak ka saara sum for first index 0 th place 
second index = 0th + 1th index ka element ka sum 
third index = 0 se 2nd index tak ke elements ka sum 
loop hatega or ek single statement lag jayega bcoz of loop takes more time our code is optimised.
prefix[end] - prefix[start - 1];
prefix[i-1] - arr[i]
phle ke saare elements ka sum - current element ka sum.
time complexity = O(n2);

//kadane's law  iski time complexity hai O(n);  

// import java.util.*;

// public class subArrays{
//     public static int subArrays(int numbers[]){
//         int ts =0;
//         for(int i=0;i<numbers.length; i++){
//            int start = i;
//             for(int j=i; j<numbers.length; j++){
//                int end = j;
//                 for(int k= start; k<= end; k++){
//                     System.out.print(numbers[k]+" ");
//                     ts++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.print("Total subArrays :" + ts);
//         return 1;
//     }

//     public static void main(String args[]){
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         subArrays(numbers);

//     }
// }

// //Prefix sum -----------------------
import java.util.*;
public class subArrays{
    public static void maxSubarraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k =i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum =" + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(numbers);
    }
}

//Kadane's algorithm ----------------------
// import java.util.*;

// public class subArrays {
//     public static int maxSubarraySum(int numbers[]){
        

//     }
//     public static void main(String args[]){
//         int numbers = { 1, 3, 4, 5, 6, 7 };
        
//     }
// }