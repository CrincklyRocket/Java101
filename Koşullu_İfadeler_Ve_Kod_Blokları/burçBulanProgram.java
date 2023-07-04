package Java.Koşullu_İfadeler_Ve_Kod_Blokları;
import java.util.Scanner;

import javax.script.ScriptEngine;
public class burçBulanProgram {
    public static void main(String[] args) {
        
        int ay, gün;
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
            System.out.println("Oğlak burcusunuz!");
            System.exit(gün);
            } else if (gün > 21 )  {
                System.out.println("Kova burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 2) {
            if (gün<=19 && gün >= 1){
            System.out.println("Kova burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Balık burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 3) {
            if (gün<=20 && gün >= 1){
            System.out.println("Balık burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Koç burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 4) {
            if (gün<=20 && gün >= 1){
            System.out.println("Koç burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Boğa burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 5) {
            if (gün<=21 && gün >= 1){
            System.out.println("Boğa burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("İkizler burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 6) {
            if (gün<=22 && gün >= 1){
            System.out.println("İkizler burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Yengeç burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 7) {
            if (gün<=22 && gün >= 1){
            System.out.println("Yengeç burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Aslan burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 8) {
            if (gün<=22 && gün >= 1){
            System.out.println("Aslan burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Başak burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 9) {
            if (gün<=22 && gün >= 1){
            System.out.println("Başak burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Terazi burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 10) {
            if (gün<=22 && gün >= 1){
            System.out.println("Terazi burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Akrep burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 11) {
            if (gün<=21 && gün >= 1){
            System.out.println("Akrep burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Yay burcusunuz!");}
                System.exit(gün);
        }
        if (ay == 12) {
            if (gün<=21 && gün >= 1){
            System.out.println("Yay burcusunuz!");
            System.exit(gün);
            } else {
                System.out.println("Oğlak burcusunuz!");}
                System.exit(gün);
        } 
        }
         
}   

