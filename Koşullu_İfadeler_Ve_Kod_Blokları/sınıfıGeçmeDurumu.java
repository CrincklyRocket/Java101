package Java.Koşullu_İfadeler_Ve_Kod_Blokları;

import java.util.Scanner;

public class sınıfıGeçmeDurumu {
    public static void main(String[] args) {
        
        float mat, fizik, turkce, kimya, muzik, toplam=0;
        boolean sart ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunu girin = ");
        mat = inp.nextFloat();
        sart = (mat>=0 && mat <=100);
        toplam = (sart) ? toplam +=mat : 0;
        if(toplam == 0){
            System.out.println("Girilen not yanlış!");
            System.exit(0);}

        System.out.println("Fizik notunu girin = ");
        fizik = inp.nextFloat();
        sart = (fizik>=0 && fizik <=100);
        toplam = (sart) ? toplam +=fizik : 0;
        if(toplam == 0){
            System.out.println("Girilen not yanlış!");
            System.exit(0);}
            

        System.out.println("Türkçe notunu girin = ");
        turkce = inp.nextFloat();
        sart = (turkce>=0 && turkce <=100);
        toplam = (sart) ? toplam +=turkce : 0;
        if(toplam == 0){
            System.out.println("Girilen not yanlış!");
            System.exit(0);}
        

        System.out.println("Kimya notunu girin = ");
        kimya = inp.nextFloat();
        sart = (kimya>=0 && kimya <=100);
        toplam = (sart) ? toplam +=kimya : 0;
        if(toplam == 0){
            System.out.println("Girilen not yanlış!");
            System.exit(0);}
            

        System.out.println("Müzik notunu girin = ");
        muzik = inp.nextFloat();
        sart = (muzik>=0 && muzik <=100);
        toplam = (sart) ? toplam +=muzik : 0;
        if(toplam == 0){
            System.out.println("Girilen not yanlış!");
            System.exit(0);}
            
        
        if (toplam/5 >=55){
            System.out.println("Ortalamanız: " + toplam/5 + " geçtiniz!");
        } else{
            System.out.println("Ortalamanız: " + toplam/5 + " geçemdiniz!");} 
        
    }
}

