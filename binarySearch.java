import java.util.*;
// binary search:
public class Hello {
    public static int binarySearch(int[] arr1, int target){
        int low = 0;
        int high = arr1.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(target == arr1[mid]){
                return mid;
            }
            else if (target < arr1[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,8};
        int target = 2;// value to be searched!
        try{
            System.out.println(binarySearch(arr1,target));
        }
        catch(Exception e){
            System.out.println("enter value in range!");
        }
    }  
}