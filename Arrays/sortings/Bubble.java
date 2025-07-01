import java.util.*;

public class Bubble {
    public static int bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return 0;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = { 1, 45 ,4 , 64 ,3 , 645, 34, 35 ,64, 2 ,54 ,64 ,63, 343243};
        bubbleSort(arr);
        printArr(arr);

    }
}