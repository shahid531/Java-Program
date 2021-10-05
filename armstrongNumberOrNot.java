import java.util.*;
// check if the given number is armstrong or not:
public class Hello {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String str = String.valueOf(input);
        int len = str.length();
        int temp = input;
        int sum = 0;
        while(temp > 0){
            int a = temp%10;
            sum += Math.pow(a,len);
            temp = Math.floorDiv(temp,10);
        }
        if(input == sum){
            System.out.println("Armstrong!");
        }
        else {
            System.out.println("Not Armstrong!");
        }
    }
}