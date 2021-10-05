import java.util.*;
// fibonacci series:
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a = 0;
        System.out.printf(a+" ");
        int b = 1;
        System.out.printf(b+" ");
        int c = 0;
        while(c < input){
            c = a+b;
            System.out.printf(c+" ");
            a = b;
            b = c;
        }
    }  
}