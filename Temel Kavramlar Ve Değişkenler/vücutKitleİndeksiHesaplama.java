package Java.Temel_Kavramlar_Ve_Değişkenler;

import java.util.Scanner;

public class vücutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        
        double kilo, boy, Index;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu (metre cinsinde) giriniz = ");
        boy = inp.nextDouble();

        System.out.println("Kilonuzu giriniz = ");
        kilo = inp.nextDouble();

        Index = (kilo) / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz =" + Index);


    }
    
}
