package Java.Döngüler;
import java.util.Scanner;    
public class üslüSayıHesaplayanProgram {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Tabanı giriniz: ");
        int alt = inp.nextInt();
        System.out.println("Kuvveti giriniz");
        int ust = inp.nextInt();

        int temp = 1;
        for (int i = 1; i <= ust; i++){
            temp = alt*temp ;
           System.out.println(temp);
        }
        
    }
}
