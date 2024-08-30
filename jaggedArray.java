import java.util.*;

public class jaggedArray {
    public static void main(String args[]){
        //Jagged Array

        // 1 2 3
        // 9 2
        // 4 3 5 2 4

        int A[][];
        A = new int[3][];

        A[0] = new int[3];
        A[1] = new int[2];
        A[2] = new int[5];

        for(int x[]:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();

//        0 0 0
//        0 0
//        0 0 0 0 0

        A[0][0] = 1; A[0][1] = 2; A[0][2] = 3;
        A[1][0] = 9; A[1][1] = 2;
        A[2][0] = 4; A[2][1] = 3; A[2][2] = 5; A[2][3] = 2; A[2][4] = 4;

        for(int x[]:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

//        1 2 3
//        9 2
//        4 3 5 2 4
    }
}
