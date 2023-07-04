package Java.Koşullu_İfadeler_Ve_Kod_Blokları;
import java.util.Scanner;
public class sayılarıBuyuktenKucugeSıralama {
    
    public static void main(String[] args) {
        int first,second,third;

        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayıyı girin = ");
        first = inp.nextInt();
        
        System.out.println("İlk sayıyı girin = ");
        second = inp.nextInt();
        
        System.out.println("İlk sayıyı girin = ");
        third = inp.nextInt();
        
        if (first == second && first == third){
            System.out.println("Bütün sayılar eşit!");  

        } else if ( first > second && first > third){
            if (second > third ){System.out.println("Girilen sayılar küçükten büyüğe = "+third+"<"+second+"<"+first);}
                else {System.out.println("Girilen sayılar küçükten büyüğe = "+second+"<"+third+"<"+first);}
                      
        } else if (second > first && second > third){
            if (first > third){System.out.println("Girilen sayılar küçükten büyüğe = "+third+"<"+first+"<"+second);}
                else {System.out.println("Girilen sayılar küçükten büyüğe = "+first+"<"+third+"<"+second);}
                
        } else if (third > first && third > third){
            if (first > second){System.out.println("Girilen sayılar küçükten büyüğe = "+third+"<"+first+"<"+third);}
                else {System.out.println("Girilen sayılar küçükten büyüğe = "+first+"<"+third+"<"+third);}
        }
    }
}
