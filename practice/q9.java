import java.util.*;
public class q9 {
    public static int subArrays(int numbers[]) {
        int tp =0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i+1; j<numbers.length; j++){
                int sum =0;
                int end = j;
                for(int k=start; k<end; k++){
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
            tp++;
            System.out.print("="+ sum );
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArrays :" +tp);
        return 0;

    }
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        subArrays(numbers);

    }
}