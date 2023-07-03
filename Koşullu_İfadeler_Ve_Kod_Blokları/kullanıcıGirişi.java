package Java.Koşullu_İfadeler_Ve_Kod_Blokları;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class kullanıcıGirişi {
    public static void main(String[] args) {
        String userName,userPassword1,userPassword2,y;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı girin = ");
        userName = inp.nextLine();

        System.out.println("Lütfen kullanıcı şifrenizi girin = ");
        userPassword1 = inp.nextLine();

        if (userName.equals("salih") && userPassword1.equals("Java101")){
            System.out.println("Giriş işlemi başarılı.");

        }else if (!(userName.equals("salih"))) {
            System.out.println("Girilen kullanıcı adı yanlış!");

        }else  {
            System.out.println("Girilen şifre yanlış!\nYeni şifre oluşturmak ister misiniz?\ny = evet, n = Hayır");
            y = inp.nextLine();

            switch(y){
                case "Y":
                System.out.println("Yeni şifreyi girin (Girdiğiniz şifre eski şifreniz ve hatalı girdiğiniz şifre ile aynı olamaz!)");
                userPassword2 = inp.nextLine();
                    if (userPassword2.equals("Java101") || userPassword2.equals(userPassword1)){
                        System.out.println("Hatalı işlem yaptınız.");
                    }else {
                        System.out.println("işlem başarılı");
                    }

                break;
                    
                
                case "y":
                System.out.println("Yeni şifreyi girin (Girdiğiniz şifre eski şifreniz ve hatalı girdiğiniz şifre ile aynı olamaz!)");
                userPassword2 = inp.nextLine();
                     if (userPassword2.equals("Java101") || userPassword2.equals(userPassword1)){
                        System.out.println("Hatalı işlem yaptınız.");
                    }else {
                        System.out.println("işlem başarılı");
                    }
                break;

                default:
                System.out.println("Program sonlandırılıyor!");
                break;
}
            
            
            }
        }
        }



    


