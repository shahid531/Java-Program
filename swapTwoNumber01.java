import java.util.*;
// swap two number using third variable:
public class Hello {
    public static void main(String[] args){ 
        int num1 = 12;
        int num2 = 14;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}