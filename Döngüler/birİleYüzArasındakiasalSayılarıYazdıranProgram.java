package Java.Döngüler;
public class birİleYüzArasındakiaslaSayılarıProgram {
    public static void main(String[] args) {
        int temp = 0;
        
        for (int i = 2 ; i <= 100; i++){
            boolean Asal = true;
            for (int h = 2; h < i; h++){
                if (i % h == 0){
                    Asal = false;
                     
            } 
        }
           if(Asal){
            System.out.println(i);
           }
    }
               
        
    }  
    
}

