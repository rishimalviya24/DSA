import java.util.*;

public class largest{
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+smallest);
        return largest;   
    }
    public static void main(String args[]){
        int numbers[] = { 1,2,3,4,5,6,645,232,232,5,23,23543,2131,23 };

        System.out.println("largest value is : "+ getLargest(numbers));    
    }
}