package Java.Metotlar;
import java.text.BreakIterator;
import java.util.Scanner;
public class recursiveAsalSayıBulma {
    
    static boolean isprime(int input, int i){
        if ((i * i) > input){
            return true;
        }
        if (input == i){
            return true;
        }
        else if (input % i == 0){
            return false;
        }
        else 
            return isprime(input, i+1);

         
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int input = inp.nextInt();
        if(input < 0){
            System.out.println("Negatif Sayılar Asal Değildir.");
            System.exit(input);
        }
        else if(input == 1 || input == 0){
            System.out.println("Sayı Asal Değildir.");
            System.exit(input);
            System.exit(input);
        }
        
        if (isprime(input, 2))
            System.out.println("Sayı Asaldır.");
        else
            System.out.println("Sayı Asal Değildir.");
        
    }
}
