package Java.Koşullu_İfadeler_Ve_Kod_Blokları;

import java.util.Scanner;

public class havaSıcaklığınaGöreEtkinlikÖnerme {
    public static void main(String[] args) {
        /*
             * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
             * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
             * Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
             * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. 
             */
        int sicaklik;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklığı girin =");
        sicaklik = inp.nextInt();
        
        if (sicaklik<5){
            System.out.println("Kayağa gidebilirsin.");    
            System.exit(sicaklik);
        }else if (sicaklik >= 5 && sicaklik <= 10){
            System.out.println("Sinemaya gidebilirsin.");    
            System.exit(sicaklik);

        }else if (sicaklik < 15 && sicaklik > 10){
            System.out.println("Yüzmeye gidebilirsin.");    
            System.out.println("Sinemaya gidebilirsin.");    
            System.exit(sicaklik);
        }else {
            System.out.println("Yüzmeye gidebilirsin.");    
            System.exit(sicaklik);
        }
    





    }
  
    
}