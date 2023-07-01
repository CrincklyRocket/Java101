package Java.Temel_Kavramlar_Ve_Değişkenler;
import java.util.Scanner;



public class manavKasaProgramı {
    public static void main(String[] args) {
        
        double armutB = 2.14 , elmaB = 3.67, domatesB = 1.11, muzB = 0.95, patlicanB = 5.00;
        double armutK, elmaK, domatesK, muzK, patlicanK, toplam;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Alınan Armut miktarı(kg) = ");
        armutK = inp.nextDouble();

        System.out.println("Alınan Elma miktarı(kg) = ");
        elmaK = inp.nextDouble();
        
        System.out.println("Alınan Domates miktarı(kg) = ");
        domatesK = inp.nextDouble();

        System.out.println("Alınan Muz miktarı(kg) = ");
        muzK = inp.nextDouble();

        System.out.println("Alınan Patlıcan miktarı(kg) = ");
        patlicanK = inp.nextDouble();

        toplam = (armutB*armutK)+(elmaB*elmaK)+(domatesB*domatesK)+(muzB*muzK)+(patlicanK*patlicanB);
        System.out.println("Toplam Tutar = " + toplam +" TL");


        
    }
    
}
