package Java.Koşullu_İfadeler_Ve_Kod_Blokları;
import java.util.Scanner;

import javax.script.ScriptEngine;
public class burçBulanProgram {
    public static void main(String[] args) {
        
        int ay, gün;
        String burc = " "; 

        Scanner inp = new Scanner(System.in);

        System.out.println("1: Ocak\n2: Şubat\n3: Mart\n4: Nisan\n5: Mayıs\n6: Haziran\n7: Temmuz\n8: Ağustos\n9: Eylül\n10: Ekim\n11: Kasım\n12: Aralık\nDoğduğunuz ayı giriniz ");
        ay = inp.nextInt();
         if (ay < 1 || ay > 12 ){
            System.out.println("Hatalı işlem yaptınız");
            System.exit(ay);
         }

        System.out.println("Doğduğunuz gününüzü giriniz ");
        gün = inp.nextInt();
         if (gün < 1 || gün > 31 ){
            System.out.println("Hatalı işlem yaptınız");
            System.exit(ay);
         }




        if (ay == 1) {
            if (gün >= 1 && gün<=21 ){
            burc = "Oğlak";
            } else if (gün > 21 )  {
                burc = "Kova";
                }
        }        
        if (ay == 2) {
            if (gün<=19 && gün >= 1){
            burc = "Kova";
            } else {
                burc = "Balık";
                }
        }        
        if (ay == 3) {
            if (gün<=20 && gün >= 1){
            burc = "Balık";
            } else {
                burc = "Koç";
                }
        }
        if (ay == 4) {
            if (gün<=20 && gün >= 1){
            burc = "Koç";
            } else {
                burc = "Boğa";
                }
        }
        if (ay == 5) {
            if (gün<=21 && gün >= 1){
            burc = "Boğa";
            } else {
                burc = "İkizler";
                }
        }
        if (ay == 6) {
            if (gün<=22 && gün >= 1){
            burc = "İkizler";
            } else {
                burc = "Yengeç";
                }
        }
        if (ay == 7) {
            if (gün<=22 && gün >= 1){
            burc = "Yengeç";
            } else {
                burc = "Aslan";
                }
        }
        if (ay == 8) {
            if (gün<=22 && gün >= 1){
            burc = "Aslan";
            } else {
                burc = "Başak";
                }
        }
        if (ay == 9) {
            if (gün<=22 && gün >= 1){
            burc = "Başak";
            } else {
                burc = "Terazi";
            }
        }
        if (ay == 10) {
            if (gün<=22 && gün >= 1){
            burc = "Terazi";
            } else {
                burc = "Akrep";
                }
        }
        if (ay == 11) {
            if (gün<=21 && gün >= 1){
            burc = "Akrep";
            } else {
                burc = "Yay";
                }
        }
        if (ay == 12) {
            if (gün<=21 && gün >= 1){
            burc = "Yay";
            } else {
                burc = "Oğlak";
                } 
        }
         System.out.println("Burcunuz: " + burc);
}   
}

