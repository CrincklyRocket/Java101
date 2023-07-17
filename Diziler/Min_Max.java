package Java.Diziler;
import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
    try (Scanner inp = new Scanner(System.in)) {
        int input = inp.nextInt();
        int[] arr = {56, 34, 1, 8, 6, 101, -2, -33};
        int diffUpper = Math.abs(arr[0] - input);
        int diffLower = Math.abs(arr[0] - input);
        for (int i : arr){
            if (diffUpper > Math.abs(input - i) && i > input){
                diffUpper = i;
            }
            if (diffLower > Math.abs(input - i) && i < input){
                diffLower = i;
            }
            
        }
            System.out.println("Girilen Sayısına Dizide En Yakın Üst Değer = " + diffUpper);
            System.out.println("Girilen Sayısına Dizide En Yakın Alt Değer = " + diffLower);
    }

  
    }
}
