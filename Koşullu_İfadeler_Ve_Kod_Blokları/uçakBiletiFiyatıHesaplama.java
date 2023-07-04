package Java.Koşullu_İfadeler_Ve_Kod_Blokları;

import java.util.Scanner;

public class uçakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        double  biletFiyati;
        int yas, yolculukTipi,katEdilenMesafe;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kat edilecek mesafeyi KM cinsinden giriniz :");
        katEdilenMesafe = inp.nextInt();
        if (katEdilenMesafe < 0){System.out.println("Hatalı Veri Girdiniz !");
        System.exit(katEdilenMesafe);}

        System.out.println("Yolcunun yaşını girin :");
        yas = inp.nextInt();
        if (yas < 0 ){System.out.println("Hatalı Veri Girdiniz !");
        System.exit(yas);}

        System.out.println("Gidiş-Dönüş için: 1\nTek yön için: 2\nYolculuk tipini seçin ");
        yolculukTipi = inp.nextInt();
        if (!(yolculukTipi == 1 || yolculukTipi == 2)){System.out.println("Hatalı Veri Girdiniz !");
        System.exit(yolculukTipi);}

        biletFiyati = katEdilenMesafe * (0.10);
        System.out.println(biletFiyati);

        if (yas < 12 ){
            biletFiyati = biletFiyati/2;
            if (yolculukTipi == 1){
                biletFiyati = biletFiyati * (0.8)*2;
            }
        }
        if (yas >= 12 && yas <= 24){
            biletFiyati = biletFiyati * (0.9);
            if (yolculukTipi == 1){
                biletFiyati = biletFiyati * (0.8)*2;
            }
        }
        if (yas > 65 ){
            biletFiyati = biletFiyati * (0.7);
            if (yolculukTipi == 1){
                biletFiyati = biletFiyati * (0.8)*2;

            }
        }

        System.out.println("Toplam Tutar :" + biletFiyati);


    }
    
}
