package Java.Döngüler;
import java.util.Scanner;
public class fibonacciSerisiYazdıranProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.println("Fibonacci serisinin uzunluğunu seçin: ");
        int input = inp.nextInt();
        int temp = 0;
        int temp2 = 1;
        int sum = 0;


        for (int i = 0 ; i < input; i++){
            sum = temp2 + temp;
            temp = temp2;
            temp2 = sum;
            
            System.out.println(sum);
        }

    }
}
