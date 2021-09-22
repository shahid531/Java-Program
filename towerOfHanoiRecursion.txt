import java.util.*;
// tower of hanoi using recursion:
public class Hello {
    public static void toh(int n, char x, char y, char z){
        if( n > 0){
            toh(n-1,x,z,y);
            System.out.printf("%c %c",x,z);
            System.out.println();
            toh(n-1,y,x,z);
        }
    }
    public static void main(String[] args) {
        toh(3,'A','B','C');
    }  
}