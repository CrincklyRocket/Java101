package Java.Döngüler;
import java.util.Scanner;
public class mükemmelSayıyıBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int temp = 0, input = inp.nextInt();

        for (int i = 1; i <= input; i++){
            if (input % i == 0){
                temp += i;
            }
        }
        if (temp/2 == input){
            System.out.println(temp/2+" Mükemmel sayıdır.");
        }
        else {
            System.out.println("Girilen sayı mükemmel bir sayı değildir.");
        }
    
    
    }
}
