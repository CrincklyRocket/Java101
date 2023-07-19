package Java.Diziler;
import java.util.*;
public class MatrixTranspoze {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 20, 10},
                {10, 20, 53, 20}
        };

        int[][] arrNew = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arrNew[j][i] = arr[i][j];
            }
        }
        System.out.println("===============================");
        System.out.println("Matrix: ");
        for (int[] array: arr) {
            System.out.print("[");
            for (int n : array) {
                System.out.print(n + " "); // printing each item
            }System.out.print("]");
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println("Transpose: ");
        for (int[] array: arrNew) {
            System.out.print("[");
            for (int n : array) {
                System.out.print(n + " "); // printing each item
            }System.out.print("]");
            System.out.println();
        }
        System.out.println("===============================");
    }
}
