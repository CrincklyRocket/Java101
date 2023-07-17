package Java.Diziler;

public class B_Harfi {
    public static void main(String[] args) {
        String[][] B = new String[6][8];

        for (int i = 0; i < B.length; i++){
            for ( int j = 0; j <B[i].length; j++){
                if (i == 1 || i == 4){
                    if (j < 2 || j > 5)
                        B[i][j] = "*";
                    else 
                        B[i][j] = " ";
                }if (i == 0 || i == 2 || i == 3 || i == 5 ){
                    if(j < 7)
                        B[i][j] = "*";
                    else if (i == 0 || i == 2 || i == 3 || i == 5 )
                        B[i][j] = " ";
                    }
            }
        }
        for (String[] i: B){
            for (String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
