import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kullanıcı adını giriniz: ");
        username = input.nextLine();
        
        System.out.print("Parolayı giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123") ){
            System.out.println("Giriş yaptınız.");
        } else{
            System.out.println("Bilgileriniz yanlış.");
        }
    }
    
}
