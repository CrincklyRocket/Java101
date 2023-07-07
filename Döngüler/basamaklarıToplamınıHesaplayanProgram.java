package Java.Döngüler;
import java.util.Scanner;
public class basamaklarıToplamınıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int input = inp.nextInt();
        int temp = 0;
        do {
            temp += input % 10;
            input /=  10;
        }
        while(!(input < 1));
        System.out.println("Girilen sayının rakamları toplamı= " + temp);
    }
}
