import java.util.*;
// Jagged Array:
public class Hello {
    public static void main(String args[]){
        int[][] arr1 = new int[4][];
        arr1[0] = new int[2];
        arr1[1] = new int[4];
        arr1[2] = new int[3];
        arr1[3] = new int[5];
        for(int x[]: arr1){
            for(int y:x){
                System.out.printf(y+" ");
            }
            System.out.println();
        }
    }
}