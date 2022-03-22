import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class mükemmel {
    public static void main(String[] args) {
        int num, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        num = input.nextInt();
        for (int i = 1; i < num; i++){
            if (num%i==0){
                toplam += i;
            }
        }
        if( num == toplam){
            System.out.println(num + " sayısı mükemmel sayıdır.");
        } else {
            System.out.println(num + " sayısı mükemmel sayı değildir.");

        }
    }
}
