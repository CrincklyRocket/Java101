package Java;

import java.util.Scanner;
import java.lang.Math;
/**
 * daireninAlanınıHesaplayanProgram
 */
public class daireninAlanınıHesaplayanProgram {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double yariCap, merkezAcisi, alan;
        System.out.println("Dairenin yarıçapını girin = ");
        yariCap = inp.nextDouble();

        System.out.println("Merkez Açısını girin = ");
        merkezAcisi = inp.nextDouble();

        alan = (Math.PI * (yariCap*yariCap) * merkezAcisi) / 360;
        System.out.println("Dairenin alanı " + alan + " birim.");



    }  
}