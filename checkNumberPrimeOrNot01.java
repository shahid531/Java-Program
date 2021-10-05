import java.util.*;
// check if the given number is prime or not:
public class Hello {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= input; i++){
            if(input%i == 0){
                count += 1;
            }
        }
        if(count == 2){
            System.out.println("Prime Number!");
        }
        else {
            System.out.println("Not Prime!");
        }
    }
}