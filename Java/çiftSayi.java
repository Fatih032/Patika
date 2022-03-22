import java.util.Scanner;

public class çiftSayi {
    public static void main(String[] args) {
        // 3 ve 4'e tam bölünen sayıların toplamının ortalaması
        int sayi;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("bir sayı giriniz:");
            sayi = input.nextInt();
        }

        int a = 0;
        int sum = 0;
        for (int i = 1; i<sayi;i++){
            if (i % 3 == 0 & i % 4 == 0){
                System.out.println(i);
                sum += i;
                a += 1;
            }
        }
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + (sum/a));
        // int sayi ;
        // Scanner input = new Scanner(System.in);

        // System.out.println("Bir sayı giriniz:");
        // sayi = input.nextInt();

        // for (int i = 0; i < sayi; i++){
        //     if ( i%2 == 0){
        //         System.out.println(i);
        //     }
        // }
    }
}
