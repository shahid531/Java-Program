import java.util.*;
// pair of element using while loop O(n):
public class Hello {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7,9};
        int ans = 10;
        int i = 0;
        int j = arr1.length - 1;
        while(i < j){
            if(arr1[i] + arr1[j] == ans){
                System.out.printf(i+" "+j);
                System.out.println();
                i++;
                j--;
            }
            else if((arr1[i] + arr1[j]) > ans){
                j--;
            }
            else {
                i++;
            }
        }
    }  
}