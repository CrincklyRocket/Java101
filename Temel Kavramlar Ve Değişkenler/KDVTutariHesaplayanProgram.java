package Java;


import java.util.Scanner;


public class KDVTutariHesaplayanProgram {
    
   
    public static void main(String[] args) {

        int tutar;
        double ilkOran = 0.18, ikinciOran = 0.08;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Miktar giriniz =");
        tutar = inp.nextInt();

        boolean deger = tutar < 1000;
        String metin = (deger) ? ("KDV tutarı ="+ (tutar * ilkOran)) : ("KDV tutarı =" + (tutar * ikinciOran));
       
        System.out.println(metin);
    }
}