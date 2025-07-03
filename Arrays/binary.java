// import java.util.*;
// //Binary search

// public class binary {
//     public static int binarySearch(int numbers[], int key){
//         int start = 0, end = numbers.length - 1;

//         while(start <= end) {
//             int mid = (start + end)/2;

//             //Comparisions
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){ // right
//                 start = mid + 1;
//             }
//             else{  // left
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = { 2, 4 ,6 , 8 , 10 , 12, 14, 16 };
//         int key = 16 ; 
//         System.out.println("Index for key is :" + binarySearch(numbers, key));

//     }
// }

// import java.util.*;

// public class binary{
//     public static int binarySearch(int numbers[], int key){
//         int start =0 , end = numbers.length-1 ;
//        while( start <= end ){
//         int mid = (start + end)/2;

//         if(numbers[mid] == key ){
//             return mid;
//         }
//         if(numbers[mid] < key){ //right
//            start = mid + 1; 
//         }
//         else { //left
//            end = mid -1;
//         }
//        }
//        return -1; 
//     }
//     public static void main(String args[]){
//         int numbers[] = { 2, 3, 4,5, 5, 6 ,  6,7, 87};
//         int key = 55;

//         System.out.println("key is found at index:" + binarySearch(numbers,key));
//     }
// }


