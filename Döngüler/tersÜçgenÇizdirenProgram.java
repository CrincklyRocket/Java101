package Java.Döngüler;
import java.util.Scanner;
public class tersÜçgenÇizdirenProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Ters üçgen kaç satır olsun?: ");
        int input = inp.nextInt();
 
        for (int i = input; i >= 1; i--){
            for (int k = input-1 ; k >= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-3; j++){
                System.out.print("*");
                }
            System.out.println();         
        }

    }
}