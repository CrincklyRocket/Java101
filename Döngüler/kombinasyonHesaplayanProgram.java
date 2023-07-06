package Java.Döngüler;
import java.util.Scanner;
public class kombinasyonHesaplayanProgram {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Girilen değerlerin kombinasyonunu bulan program.\nN değerini giriniz: ");
        int N = inp.nextInt();
        System.out.println("R değerini giriniz: ");
        int R = inp.nextInt();
        int temp1= 1, temp2= 1, temp3 = 1 ;

        for(int i = 1; i <= N ; i++){
            temp1 *= i;
        }
        for(int i = 1; i <= R ; i++){
            temp2 *= i;;
        }
        for(int i = 1; i <= (N-R) ; i++){
            temp3 *= i;;
        }
        System.out.println(N+" Sayısının "+R+"'sayısına kombinasyonu= "+temp1/(temp2*temp3));

    }
}