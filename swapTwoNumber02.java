import java.util.*;
// swap two number without using third variable:
public class Hello {
    public static void main(String[] args){ 
        int num1 = 100;
        int num2 = 200;
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}