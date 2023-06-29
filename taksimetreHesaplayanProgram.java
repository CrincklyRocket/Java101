import java.util.Scanner;

public class taksimetreHesaplayanProgram {
     public static void main(String[] args) {
        double katEdilenYol, ucret;
        
        Scanner inp = new Scanner(System.in); 
        System.out.println("Kat edilen mesafeyi girin =");
        katEdilenYol = inp.nextDouble();
        
        boolean minimum = (10 + (katEdilenYol*2.20)) < 20;
        ucret = minimum ? 20 : (10 + (katEdilenYol*2.20));
        
        System.out.println("Ücret = " + ucret );

    }
}
