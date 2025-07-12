import java.util.*;

public class insertion{
    public static int sort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){                  
        int curr = arr[i], prev = i-1;          
            while(prev >=0 && arr[prev] > curr){  
                arr[prev +1] = arr[prev];        
                prev--;                          
            }
            //insertion
            arr[prev + 1] = curr;                

        }
        return 0;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static void main (String args[]){
        int arr[] = { 21, 23, 34, 65, 6, 27 ,7 ,38 ,91, 10 };
        sort(arr);
        print(arr);
    }
}