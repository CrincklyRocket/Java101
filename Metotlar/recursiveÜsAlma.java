package Java.Metotlar;
import java.util.Scanner;
public class recursiveÜsAlma {
    
    static int recPow(int alt, int ust){
        if (ust != 1)
            return recPow(alt, ust-1) * alt;
        else
            return alt;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int alt = inp.nextInt();
        System.out.print("Üst Değerini Giriniz: ");
        int ust = inp.nextInt();
        System.out.println("İşlem Sonucu = " + recPow(alt, ust));
    }
}
