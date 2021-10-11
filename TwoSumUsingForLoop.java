public class Hello { 
    // Two Sums: 
    public static void main(String args[]){
        int[] arr1 = {6,3,4,6};
        int tar = 12;
        for(int i = 0; i < arr1.length - 1; i++){
            for(int j = i+1; j < arr1.length; j++){
                if(arr1[i]+arr1[j] == tar){
                    System.out.printf(i+" "+j);
                }
            }
        }
    }
}