package Java.Koşullu_İfadeler_Ve_Kod_Blokları;
import  java.util.Scanner;
    public class artıkYılHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;

        System.out.println("Yıl Giriniz: ");
        yil = inp.nextInt();

        if ( yil % 100 == 0 && yil % 400 != 0 )
            System.out.println(yil + " Artık Yıl Değildir.");
        else if (yil % 4 == 0)
            System.out.println(yil + " Artık Yıldır.");
        else 
            System.out.println(yil + " Artık Yıl Değildir.");


    }
}
     
 //System.out.println(yil+" Yılı Artık Yıldır");
 //System.out.println(yil+" Yılı Artık Yıl değildir");}