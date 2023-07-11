package Java.Metotlar;
import java.util.Scanner;
public class palindromSayilar {
    
    static boolean isPalindrom (int input ){
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        input = inp.nextInt();

        int temp , newNumber = 0, lastDigit;
        temp = input;
        while(temp != 0){
            lastDigit = temp % 10;
            newNumber = (newNumber * 10) + lastDigit;
            temp /= 10; 
        }
        if ( newNumber == input)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        if (isPalindrom(0) == true)
            System.out.println("Sayı Palindrom");
        else
            System.out.println("Sayı Palindrom Değil!");



    }
}
