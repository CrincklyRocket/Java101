package Java.Döngüler;
import java.util.Scanner;
public class harmonikSayılarıBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int input = inp.nextInt();
        double temp = 0;

        for (int i = 1; i <= input; i++ ){
            temp += (1.0/i);
        System.out.println(temp);
        }

    }
}
