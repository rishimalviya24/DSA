import java.util.*;

public class q5 {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]){
            largest = numbers[i];
        }   
            if(smallest > numbers[i]){
            smallest = numbers[i];
        }   
      }
      System.out.println("smallest value is :" + smallest);
      return largest;
    }   
    public static void main (String args[]){
        int numbers[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("largest value is :" + largest(numbers));

    }
   
}