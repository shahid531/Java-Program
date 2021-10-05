import java.util.*;
// addition of first and last digit:
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = String.valueOf(x);
        int num1 = Integer.parseInt(Character.toString(str.charAt(0)));
        int num2 = Integer.parseInt(Character.toString(str.charAt(str.length()-1)));
        System.out.println(num1+num2);
    }  
}