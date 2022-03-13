import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz:");
        sayi = input.nextInt();
        for (int i = 0; Math.pow(i, 2) < sayi; i++){
            System.out.println("2'nin " + i + ". kuvveti: " + Math.pow(2, i));
        }
    }
}
