package Java.Metotlar;
import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.Source;
public class gelişmişHesapMakinesi {
    
    static void plus(){
        int temp = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin: ");
        int a = inp.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        int b = inp.nextInt();

        System.out.println(a + " + " + b + "  = "+ (a+b));
    }

    static void minus(){
        int temp = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin: ");
        int a = inp.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        int b = inp.nextInt();

        System.out.println(a + " - " + b + " = "+ (a-b));
    }

    static void times(){
        int temp = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin: ");
        int a = inp.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        int b = inp.nextInt();

        System.out.println(a + " * " + b + " = "+ (a*b));
    }

    static void diveded(){
        int temp = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin: ");
        int a = inp.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        int b = inp.nextInt();
        if (b == 0)
            System.out.println("Hatalı İşlem Yaptınız");
        else
            System.out.println(a + " / " + b + " = "+ (a/b));
    }

    static void power(){
        int temp = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Tabanı Girin: ");
        int a = inp.nextInt();
        System.out.println("Üssü Girin: ");
        int b = inp.nextInt();
        for ( int i = 1; i <= b; i++){
            temp *= a;
        }

        System.out.println("Sonuç = " + temp);
    }
    
    static void factorial(){
        int temp = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Girin: ");
        int a = inp.nextInt();    
        for (int i = 1; i <= a; i++){
            temp = temp * i;
        }
        
        System.out.println(a +"! "+"= "+temp);
    }

    static void mod(){
        int temp = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin: ");
        int a = inp.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        int b = inp.nextInt();
        
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    static void area_peri(){
        int temp = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kısa Kenarı Girin: ");
        int a = inp.nextInt();
        System.out.println("Uzun Kenarı Girin: ");
        int b = inp.nextInt();

        System.out.println( "Diktörtgenin Alanı= " + (a*b) + " Birim. Diktörtgenin Çevresi= " + ((a + b)*2)+" Birim." );
    }


    public static void main(String[] args) {
        boolean exit = true;
        Scanner inp = new Scanner(System.in);
        String menu = ("1. Toplama\n"
                        + "2. Çıkarma\n"
                        + "3. Çarpma\n"
                        + "4. Bölme\n"
                        + "5. Üs Alma\n"
                        + "6. Faktötiyel Hesaplama\n"
                        + "7. Mod Alma\n"
                        + "8. Diktörtgende Alan Ve Çevre Hesaplama");

        do{
            System.out.print(menu + "\nProgramı Sonlandırmak İçin 9'a basın.\nLütfen Bir İşlem Seçiniz: ");
            int select = inp.nextInt();
            

            switch(select){
                case 1:
                plus();
                break;

                case 2:
                minus();
                break;

                case 3:
                times();
                break;

                case 4:
                diveded();
                break;

                case 5:
                power();
                break;

                case 6:
                factorial();
                break;

                case 7:
                mod();
                break;

                case 8:
                area_peri();
                break;

                case 9:
                exit = false;
                break;

                default:
                System.out.println("Hatalı İşlem Yaptınız! Tekrar Deneyin.");

            }
        }
        while(exit);



    }
}
