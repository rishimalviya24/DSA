import java.util.*;
public class q3 {
    public static int linearSearch(int key , int numbers[]){
        for(int i=0;i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
        }  
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        
        int index = linearSearch(key , numbers);

       if (index != -1) {
            System.out.println("Key is found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}