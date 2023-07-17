package Java.Diziler;

public class Dizideki_Sayıların_Harmonik_Ortalamasını_Bulan_Program {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += 1.0/arr[i];
       
        }
        System.out.println(arr.length / sum);
    }
}
