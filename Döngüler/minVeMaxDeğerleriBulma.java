package Java.Döngüler;
import java.util.Scanner;
public class minVeMaxDeğerleriBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz: ");
        int input = inp.nextInt();
        int max = 0, min = 0;
        for (int i = 1; i <= input; i++) {
            System.out.println("Lütfen " + i + ". sayıyı giriniz: ");
            int inputTemp = inp.nextInt();
            if (inputTemp < max){
                max = inputTemp;
            if (inputTemp > min){
                min = inputTemp;
            }
            }else{
                min = inputTemp;
            }
        }
        System.out.println(max + " " + min);

        
        inp.close();
    }
}
