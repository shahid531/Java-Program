import java.util.*;
// program to seperate alphabet,number and symbol from the given string:
public class Hello {
    public static void main(String[] args){ 
        String str = "underta33ker1996@#$%";
        String x = "";
        String y = "";
        String z = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                x += str.charAt(i);
            }
            else if(Character.isDigit(str.charAt(i))){
                y += str.charAt(i);
            }
            else {
                z += str.charAt(i);
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}