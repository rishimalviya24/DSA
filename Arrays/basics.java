// import java.util.*;
 
//  public class Array {
//     public static void main(String args[]){
//         int marks[] = new int[50];

//         int numbers[] = { 1,2,3};

//         String fruits[] = { 'apple', 'mango', 'banana'};
//     }
//  }



// import java.util.*;
// public class basics {
//     public static void main(String args[] ){
//         int marks [] = new int [10];
//         Scanner sc = new Scanner(System.in);

//         System.out.println("length of array = "+ marks.length);

//         // marks[0] = sc.nextInt();
//         // marks[1] = sc.nextInt();
//         // marks[2] = sc.nextInt();

//         // System.out.println("phy : " + marks[0]);
//         // System.out.println("chem : " + marks[1]);
//         // System.out.println("math : " + marks[2]);

//         // int per = ((marks[0] + marks[1] + marks[2])/3);
//         // System.out.println("percentage = " + per + "%");

//     }
// }

import java.util.*;
public class basics {
    public static void update(int marks[] , int nonChangable) {
      nonChangable = 10;
        for( int i=0;i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }  
    }
    public static void main(String args[]) {
        int marks[] ={ 97, 96, 98 };
        int nonChangable = 5;

        update(marks, nonChangable);
        System.out.println(nonChangable);

        // print out marks
        for(int i=0;i<marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}

//In the previous ques output the value of nonChangable is not change bcoz there is a concept called pass by value or pass by reference -
// Jab bhi hum kii variable ke through data pass karte haii Jo ki primitive value hai toh bo kabhi bhi change nii hoti uski ek copy pass hoti haii 
// but if you are passing an the value of array is changed bcoz array is non primitive value.