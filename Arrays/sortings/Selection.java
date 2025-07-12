// import java.util.*;

// public class Selection {
//     public static void sorting(int numbers[]) {
//         for (int i = 0; i < numbers.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[j] < numbers[min]) {
//                     min = j;
//                 }
//             }
//             // Swapping
//             int temp = numbers[min];
//             numbers[min] = numbers[i];
//             numbers[i] = temp;
//         }
//     }

//     public static void print(int numbers[]) {
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }

//     public static void main(String args[]) {
//         int numbers[] = {1, 3, 5, 6, 78, 9, 65, 56, 121, 34, 98};
//         sorting(numbers);
//         print(numbers);  // Output: sorted array in ascending order
//     }
// }


import java.util.*;
public class Selection{
    public static int sorting(int numbers[] ){
        
        for(int i=0; i<numbers.length-1; i++){  // i = 0 , 1 , 2 , 3, 4 ,5 , 6, 7 , 8 , 9, 10
            int min = i;                        // min = 0, 1, 2 , 3 , 78 , 78 , 78,78,121, 121
            for(int j=i+1; j<numbers.length; j++){ //j =1 , 2 , 3, 4, 9, 65 , 56, 121, 34,98
                if(numbers[j] < numbers[min]){               //
                    min = j;                           // min = 1 , 3 ,5 , 6 , 9,34 ,56 , 65, 78, 98, 121
                }
            }
            //Swapping code--------
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        return 0;
    }

    public static void print(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String args[]){
        int numbers[] = { 1, 3 ,5 ,6 ,78, 9, 65 , 56, 121, 34, 98};
        sorting(numbers);
        print(numbers);
    }
}