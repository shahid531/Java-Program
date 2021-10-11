
public class Hello {
    public static void main(String args[]){
        for(int i = 0; i < 8; i++){
            for(int j = i; j < 8; j++){
                System.out.printf(" "+" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.printf("*"+" ");
            }
            System.out.println();
        }
        for(int i = 7-1; i >= 0; i--){
            for(int j = 7; j >= i; j--){
                System.out.printf(" "+" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.printf("*"+" ");
            }
            System.out.println();
        }
    }
}

           	*
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
      * * * * * * * * * * *
    * * * * * * * * * * * * *
  * * * * * * * * * * * * * * *
    * * * * * * * * * * * * *
      * * * * * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *