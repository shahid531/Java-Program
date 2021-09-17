import java.util.*;
// find prime number in a given range!
public class Hello {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 2; i <= input; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    count += 1;
                }
            }
            if(count == 2){
                System.out.printf(i+" ");
            }
        }
    }
}