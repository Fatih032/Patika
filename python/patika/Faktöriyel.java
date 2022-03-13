import java.util.Scanner;
public class Faktöriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı giriniz:");
        sayi = input.nextInt();

        System.out.println("r değerini giriniz: ");
        int r = input.nextInt();

        int total = 1;
        int rtotal = 1;
        int farktotal = 1;
        for (int i = 2; i < sayi + 1 ; i++){
            total *= i;
        }
        for (int j = r; j > 1; j--){
            rtotal *= j;
        }
        for (int j = sayi - r; j > 1; j--){
            farktotal *= j;
        }
        System.out.println(sayi + "'nın faktöriyeli: " + total);
        System.out.println((sayi + "'nın " + r + "'li kombinasyonu: " + (total/(rtotal*farktotal))));
    }
}
