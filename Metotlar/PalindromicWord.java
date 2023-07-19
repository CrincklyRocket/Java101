package Java.Diziler;
import java.util.*;
public class PalindromicWord {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
        }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String input = inp.next();
        if (isPalindrome(input)){
            System.out.println("Kelime Palindromik.");
        } else
            System.out.println("Kelime Palindromik değil.");
    }
}
