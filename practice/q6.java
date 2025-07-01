import java.util.*;

public class q6 {
    public static int binarySearch(int numbers[] , int key ){
        int start = 0, end = numbers.length - 1;

        while(start <= end) {
            int mid = (start +end )/2;

            if(numbers[mid] == key ){
                return mid;
            }
            if(numbers[mid] < key){ //right
                start = mid + 1;
            }
            else{ //left 
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 34, 534, 3423 };
        int key = 1;

        int index = binarySearch(numbers, key);
        if(index != -1 ){
            System.out.println("key is found at index :" + index);
        }
        else{
            System.out.println("not found");
        }
        }
    }
