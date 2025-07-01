import java.util.*;

public class q8 {
    public static int pair( int numbers[]) {
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; // 1,2,3,4,5,6
            for(int j=i+1; j<numbers.length; j++ ){ //(1,2) (1,3) (1,4) (1,5) (1,6) 
                System.out.print("( "+ curr +","+ numbers[j]+" )");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        pair(numbers);

    }
}