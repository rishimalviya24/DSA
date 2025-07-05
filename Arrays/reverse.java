import java.util.*; //REVERSE ARRAY
public class reverse{
    public static int reverse (int numbers[] ){
        int start = 0;
        int end = numbers.length -1;

        while(start < end) 
        { // swap 
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        return 0;
    }
    public static void main(String args[]){
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

// for reversing we have two techniques -----------
1. we have make a new array 
2. we are using swapping techniques to swap the numbers - in this we make only two variables which does not take too much of space - -best or optimised way ye haii .
space complexity = O(1) == space complexity is one 
time complexity = O(n/2) == O(n)


// import java.util.*;

// public class reverse{
//     public static int reverseArray(int numbers[]){
//         int start =0, end = numbers.length-1; 
//         while(start < end){
//             int temp = numbers[end];
//             numbers[end] = numbers[start];
//             numbers[start] = temp; 

//             start ++;
//             end--;
//         }
//         return 0;
//     }
//     public static void main(String args[]){
//         int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

//         reverseArray(numbers);
//         for(int i=0 ; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
        
//     }
// }