package Java.Döngüler;
import java.util.Scanner;
public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("lütfen İlk Sayıyı Giriniz: ");
        int var1 = inp.nextInt();
        System.out.println("lütfen İkinci Sayıyı Giriniz: ");
        int var2 = inp.nextInt();
        
        if (var1 < var2){
            int temp = var2 / 2 ;
            while (!(var1 % temp == 0 && var2 % temp == 0)){
                temp--;
            }
           System.out.println("Ebob = " + temp);
           System.out.println("Ekok = " + (var1 * var2) / temp);
        }else {
            int temp = var1 / 2 ;
            while (!(var1 % temp == 0 && var2 % temp == 0)){
                temp--;
            }
           System.out.println("Ebob = " + temp);
           System.out.println("Ekok = " + (var1 * var2) / temp);
        }
    }
}
