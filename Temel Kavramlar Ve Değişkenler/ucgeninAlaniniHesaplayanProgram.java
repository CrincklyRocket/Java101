package Java;
import java.util.Scanner;
import java.lang.Math;

public class üçgeninAlaniniHesaplayanProgram {


    public static void main(String[] args) {

        double a, b, c,kenarToplamYarisi,alan;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Üçgenin ilk kenarının uzunluğu =");
        a = inp.nextDouble();

        System.out.println("Üçgenin ikinci kenarının uzunluğu =");
        b = inp.nextDouble();

        System.out.println("Üçgenin ilk kenarının uzunluğu =");
        c = inp.nextDouble();

        kenarToplamYarisi = (a + b + c)/2;
        alan = kenarToplamYarisi * (kenarToplamYarisi - a)* (kenarToplamYarisi - b) * (kenarToplamYarisi - c);
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin alani =" + alan );



}    
}