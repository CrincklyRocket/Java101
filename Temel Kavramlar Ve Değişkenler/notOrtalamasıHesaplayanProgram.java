package Java;

import java.util.Scanner;
public class notOrtalamasıHesaplayanProgram{
    public static void main(String[] args) {
        //Değişkenler Tanımlandı
        double Matematik, Fizik, Kimya, Tarih,Türkçe, Müzik;
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notu =");
        Matematik = inp.nextDouble();
    
        System.out.print("Fizik notu =");
        Fizik = inp.nextDouble();
        
        System.out.print("Kimya notu =");
        Kimya = inp.nextDouble();

        System.out.print("Tarih notu=");
        Tarih = inp.nextDouble();

        System.out.print("Müzik notu =");
        Müzik = inp.nextDouble();

        System.out.print("Türkçe notu =");
        Türkçe = inp.nextDouble();


         
        double ortalama = (Türkçe+Matematik+Fizik+Kimya+Tarih+Müzik)/6;  
        boolean deger = ortalama < 60;
        String Sonuc = (deger) ? "Sınıfta Kaldı" :"Sınıfı Geçti" ;

        System.out.print((ortalama) +" "+ Sonuc);

} 
    

    
}

