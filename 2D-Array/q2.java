import java.util.*;

public class q2 {
    public static void main(String args[]){
        int[][] matrix = new int[3][3];
        int n = matrix.length; int m = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //OUPUT
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Largest value is :" + largest(matrix));

        //Print specific row of column----------
        System.out.print("print row 1 :");

        int rowToPrint = 1;
        for(int j=0; j<m; j++){
            System.out.print(matrix[rowToPrint][j] + " ");
        }

    System.out.println("\nPrint column 2:");
     
        int columnToPrint = 2;
        for(int i=0; i<n; i++){
            System.out.println(matrix[i][columnToPrint] + " ");
        }

    }
    public static int largest(int[][] matrix){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n= matrix.length ; int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;

    }
}