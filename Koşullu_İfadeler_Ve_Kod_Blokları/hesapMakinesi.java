package Java.Koşullu_İfadeler_Ve_Kod_Blokları;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        
        double n1, n2;
        int islem; 

        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz = ");
        n1 = inp.nextDouble();
        
        System.out.println("İkinci sayıyı giriniz = ");
        n2 = inp.nextDouble();
        
        System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme\nYapmak istediğiniz işlemi seçiniz =");
        islem = inp.nextInt();

        switch(islem){
            case 1:
            System.out.println("İşlem sonucu = "+(n1+n2));
            break;

            case 2:
            System.out.println("İşlem sonucu = "+(n1-n2));
            break;
            
            case 3:
            System.out.println("İşlem sonucu = "+(n1*n2));
            break;
            
            case 4:
                if (n2 == 0){
                    System.out.println("Bölme işlemi için 0 geçersiz girdidir.");
                }
            System.out.println("İşlem sonucu = "+(n1/n2));
            break;
            
            default:
            System.out.println("Hatalı işlem yaptınız");
            break;
        }



    }
    
}
