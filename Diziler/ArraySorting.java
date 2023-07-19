package Java.Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin eleman boyutunu giriniz: ");
        int length = inp.nextInt();
        int [] arr = new int[length];

        for (int i = 0; i < length ; i++){
            System.out.println((i+1) + ". elemanı Giriniz");
            int temp = inp.nextInt();
            arr[i] = temp;
        }
        Arrays.sort(arr);
        System.out.println("Sıralama :" + Arrays.toString(arr));
    }

}
