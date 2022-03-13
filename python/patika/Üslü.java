import java.util.Scanner;

public class Üslü{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;        
        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();
        int result=1;
        System.out.println("Üssünü giriniz:");
        int üst = input.nextInt();

        for ( int i = 0; i< üst; i++){
            result *= sayi;
        }
        System.out.println(sayi + "^" + üst + ".kuvveti: " + result);
    
    }
}
