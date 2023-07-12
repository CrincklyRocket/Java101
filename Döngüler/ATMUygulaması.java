package Java.Döngüler;
import java.util.Scanner;
public class ATMUygulaması {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int remain = 3;
    int balance = 2000;
    int miktar = 0;
    boolean isTrue = true;
    System.out.println("Hoşgeldiniz");

    while (remain > 0 && isTrue == true ){
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        String userName = inp.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        String userPassword = inp.nextLine();
    
        if (userName.equals("P") && userPassword.equals("d")){
           
            while (isTrue == true){
                System.out.print("1- Para Yatırma.\n2- Para Çekme.\n3- Bakiye Sorgula.\n4- Çıkış yap\nLütfen Yapmak İstedğiniz İşlemi Seçin: ");
                int islem = inp.nextInt();
                    switch (islem){
                        
                        case 1:
                        System.out.println("Yatırlacak Miktarı Belirleyin: ");
                        miktar = inp.nextInt();
                        balance += miktar;
                        System.out.println("Yeni Bakiye: " + balance + "\nBaşka İşlem Yapmak İster misiniz? Y-N");
                        String exit = inp.next();
                        if(exit.equals("N") || exit.equals("n") ){
                            isTrue = false;
                            System.out.println("İyi Günler Dileriz.");
                        }
                        break;

                        case 2:
                        System.out.println("Çekilecek Miktarı Belirleyin.");
                        miktar = inp.nextInt();
                        if (miktar < balance){
                            balance -= miktar;
                            System.out.println("Yeni Bakiye: " + balance);
                        } 
                        else{
                            System.out.println("Bakiye Yetersiz.");
                            isTrue = false;
                        }
                        System.out.println("Başka İşlem Yapmak İster misiniz? Y-N");
                        String exit1 = inp.next();
                        if(exit1.equals("N") || exit1.equals("n") ){
                            isTrue = false;
                            System.out.println("İyi Günler Dileriz.");
                        }
                        break;

                        case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        System.out.println("Başka İşlem Yapmak İster misiniz? Y-N");
                        String exit2 = inp.next();
                        if(exit2.equals("N") || exit2.equals("n") ){
                            isTrue = false;
                            System.out.println("İyi Günler Dileriz.");
                        }
                        break;
                        
                        case 4:
                        isTrue = false;
                        System.out.println("İyi Günler Dileriz.");
                        break;

                        default:
                        System.out.println("Hatalı işlem Yaptınız.");
                        break;
                    }
            }

        } 
        else {
            remain--;
            System.out.print("Kullanıcı Adınız Veya Şifreniz Yanlış Tekrar Deneyiniz.\nKalan hak: " + remain + "\n" );

            if (remain == 0)
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre Nedeniyle Hesabınız Bloke Olmuştur Lütfen Müşteri Temsilcimiz İle İletişime Geçiniz");
    }

       
    }
         
   
    }  
}

