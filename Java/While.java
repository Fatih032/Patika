import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // While döngüsü ile kullanıcı girişi 
        int password;
        boolean ispasswordaccess = false;

        try (Scanner input = new Scanner(System.in)) {
            while ( !ispasswordaccess){
                System.out.println("Şifrenizi giriniz:");
                password  = input.nextInt();
   
                if (password == 123){
                    System.out.println("Şifre doğru\nGiriş yapıldı.");
                    ispasswordaccess = true;
                } else {
                    System.out.println("Şifre yanlış\nYeniden deneyin."); 
                }
            }
        }



        // while döngüsü
        // int i = 0;
        // System.out.println("Program başladı.");
        // while (i < 3){
        //     i++;
        //     int k = 1;
        //     System.out.println(i + " ");
        //     while ( k < 5){
        //         k++;
        //         System.out.print(k + " ");
        //     }
            
        // }
        // System.out.println("Program bitti.");

        // while ile orta sayıyı bulma 
        // int left = 50; 
        // int right = 200;

        // while (left++ < right-- );
        // System.out.println("İki sayının ortası " + (left - 1));
        // System.out.println("İki sayının ortası " + (right + 1));
        
    }
}
