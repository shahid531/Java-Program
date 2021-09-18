import java.util.*;

public class Hello {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    public int mul(int x){
        if(x <= 10){
            System.out.println(y+"x"+x+"="+(x*y));
            return mul(x+1);
        }
        return 0;
    }
    public static void main(String[] args){ 
        Hello h = new Hello();
        h.mul(1);
    }
}