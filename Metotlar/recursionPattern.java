import java.util.Scanner;
public class recursionPattern {

    static int recPat(int input, int iTemp, boolean byPass){
        
        
        if ( iTemp > 0 && byPass){
            System.out.println(iTemp-5);
            return recPat(input, iTemp - 5,true);
        }
        if (iTemp != input-5){
            System.out.println(iTemp + 5);
            return recPat(input, iTemp + 5, false);
            
        }
        else 
            return input;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int input = inp.nextInt();
        int temp = input;
        System.out.println( recPat(input, temp, true));
    }
}