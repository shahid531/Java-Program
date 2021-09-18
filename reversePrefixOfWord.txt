import java.util.*;

public class Hello {
    public String reversePrefix(String word, char ch) {
        String x = "";
        int index = word.indexOf(ch);
        for(int i = index; i >= 0; i--){
            x += word.charAt(i);
        }
        for(int i = index + 1; i < word.length(); i++){
            x += word.charAt(i);
        }
        return x;
    }
    public static void main(String[] args){ 
        Hello h = new Hello();
        String word = "abcd";
        char ch = 'z';
        System.out.println(h.reversePrefix(word,ch));
    }
}