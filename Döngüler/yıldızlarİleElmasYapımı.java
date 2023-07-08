package Java.Döngüler;
import java.util.Scanner;
public class yıldızlarİleElmasYapımı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Elmas kaç satır olsun?\n: ");
        int input = inp.nextInt();
 
        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= (input - i); j ++){
                System.out.print(" ");
                }
            for(int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = input; i >= 0; i--){
            for (int k = input ; k >= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-3; j++){
                System.out.print("*");
                }
            System.out.println();         
        }
            }
           
        }
             
            
        
        
        
       
