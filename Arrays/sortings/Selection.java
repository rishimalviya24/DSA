import java.util.*;

public class Selection {
    public static int selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-2; i++){
            int min = i;
            for(int j=i+1; j<n-1; j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            // Swap 
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
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
        int arr[] = { 1, 45 ,4 , 64 ,3 , 645, 34, 35 ,64, 2 ,54 ,64 ,63, 3432};
        selectionSort(arr);
        printArr(arr);

    }
}