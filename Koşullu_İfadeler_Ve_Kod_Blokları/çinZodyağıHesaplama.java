package Java.Koşullu_İfadeler_Ve_Kod_Blokları;
import java.util.Scanner;
public class çinZodyağıHesaplama {
    public static void main(String[] args) {
        int yil;
        String var = "";
        Scanner inp = new Scanner(System.in);

        System.out.println("Doğum yılınızı girin :");
        yil = inp.nextInt();
        yil %= 12;

        switch(yil){
            case 0:
            var ="Maymun";
            break;
        
            case 1:
            var ="Horoz";
            break;
        
            case 2:
            var ="Köpek";
            break;
        
            case 3:
            var ="Domuz";
            break;
        
            case 4:
            var ="Fare";
            break;
        
            case 5:
            var ="Öküz";
            break;
        
            case 6:
            var ="Kaplan";
            break;
        
            case 7:
            var ="Tavşan";
            break;

            case 8:
            var ="Ejderha";
            break;
        
            case 9:
            var ="Yılan";
            break;

            case 10:
            var ="At";
            break;

            case 11:
            var ="Koyun";
            break;
        }
    System.out.println("Çin Zodyağı Burcunuz: "+ var );

    }
}
