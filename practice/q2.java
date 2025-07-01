import java.util.*;
public class q2 {
    public static int update(int marks[]){
        for(int i=0;i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
        return 0;
    }
    public static void main(String arg[]) {
        int marks[] = { 2, 4, 6, 8, 10 };
        update(marks);

        //print our marks
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}