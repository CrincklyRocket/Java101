package Java.Döngüler;
import java.util.Scanner;
public class üçVeDörteTamBölünenSayılarınOrtalaması {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\nBir sayı giriniz: ");
        int k = 0, sayiToplam = 0, i = inp.nextInt();

        for (int j = 1; j <= i ; j++){
            if (j % 3 == 0 && j % 4 == 0){         
                //J = 3'e ve 4'e tam bölünebilen sayılar, k = 3'e ve 4'e tam bölünebilen sayıların adetleri.         
                k ++;
                sayiToplam += j;     
            }
        }
        System.out.println("Girilen sayıdaki 3 ve 4'e tam bölünen sayıların ortalamaları: "+sayiToplam/k);
    }
}