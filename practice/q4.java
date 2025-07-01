import java.util.*;

public class q4 {
    public static int linearSearch( String numbers[] , String key){
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main (String args[]){
        String numbers[] = { "apple", "grapes", "papaya", "banana", "mango" };
        String key = "mango";

        int index = linearSearch(numbers, key);
        if(index != -1){
            System.out.println("key is found at index: "+ index);
        }
        else{
            System.out.println("not found");
        }
    }
}