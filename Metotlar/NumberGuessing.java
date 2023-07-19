package Java.Diziler;
import java.util.*;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean isOutOfGuesses = false;
        boolean isFound = false;
        int randomNumber = (int)(Math.random() * 100);
        System.out.println(randomNumber);
        System.out.println("Bir ile Yüz arasında Rastgele bir numara oluşturuldu ");
        int GuessCount = 1;
        do{
            System.out.println( GuessCount + ". tahmininizi giriniz:  ");
            int input = inp.nextInt();

            if (input > randomNumber){
                if (GuessCount == 4){
                    System.out.println("Bilemediniz. Tahmin hakkınız tükendi.");
                }else {
                    System.out.println("Yukarı.");
                    System.out.println("Bilemediniz. Tekrar deneyin");
                }
                GuessCount++;

            }else if (input < randomNumber){
                if (GuessCount == 4){
                    System.out.println("Bilemediniz. Tahmin hakkınız tükendi.");
                }else {
                    System.out.println("Yukarı.");
                    System.out.println("Bilemediniz. Tekrar deneyin");
                    GuessCount++;
                }
            }else if (input == randomNumber){
                System.out.println("Tahminin doğru tebrikler!!!");
                isFound = true;
            }
            if (GuessCount == 4){
                isOutOfGuesses = true;
            }
        }
        while (!isOutOfGuesses && !isFound);

    }
}
