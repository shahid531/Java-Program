// fibonacci number using recursion:
public class Hello {
    public static int fab(int x){
        if(x <= 1){
            return x;
        }
        else {
            return fab(x-1)+fab(x-2);
        }
    }
    public static void main(String args[]){
        System.out.println(fab(10));
    }
}