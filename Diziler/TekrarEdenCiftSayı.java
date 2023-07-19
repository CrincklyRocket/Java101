package Java.Diziler;

public class TekrarEdenCiftSayı {

    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }       return false;
    }
    public static void main(String[] args) {
        int [] arr = {15,12,55,60,55,1,60,12,32};
        int [] arrNew = new int[arr.length];
        int startIndex = 0;

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j] && (arr[i] % 2 == 0))){
                    if (!isFind(arrNew, arr[i])){
                        arrNew[startIndex++] = arr[i];
                    }
                        break;

                }
            }
        }
            for(int i : arrNew){
                System.out.println(i);
            }
    }
}
