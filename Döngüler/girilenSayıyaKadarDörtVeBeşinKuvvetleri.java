package Java.Döngüler;
import java.util.Scanner;
public class girilenSayıyaKadarDörtVeBeşinKuvvetleri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int temp=-1, i = inp.nextInt();

        for (int j=1 ; j<=i ; j *= 4){
            temp++;
            System.out.println(i+" sayısına kadar 4'ün "+ (temp) + ". kuvveti: " + j);
        }
        temp=-1;
        System.out.println("================================================");
         for (int k=1 ; k<=i ; k *= 5){
            temp++;
            System.out.println(i+" sayısına kadar 5'in "+ (temp) + ". kuvveti: " + k);
        }
    }
}
