package Java.Döngüler;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;
public class tekSayılarınToplamı {
    public static void main(String[] args) {
        int sayi,tempSum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Tek bir sayı girilen kadar çift ve dördün katları olan sayıları toplayan program");
        do {
            
            System.out.println("Bir sayı giriniz: ");
            sayi = inp.nextInt();
            
            if ( sayi % 2 == 0){
                tempSum += sayi;
            }
        }
        while(sayi % 2 == 0);

    System.out.println("çift ve dördün katları olan sayıların toplamı: " + tempSum);
    }
}
