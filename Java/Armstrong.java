import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        //Armstrong sayısı bulma  
        // Örnek sayı 1523 = 1^4 + 5^4 + 2^4 +3^4 = 1+625+16+81 = 723 =! 1523 armstrong sayısı değildir
        // 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634 armstrong sayısıdır.

        int sayi, toplam = 0, üs = 0, basamak, gecici;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bir sayı giriniz: ");
            sayi = input.nextInt();
        }

        gecici = sayi;

        while(sayi != 0){
            sayi = sayi / 10;
            üs += 1;
        }
        sayi = gecici;
        while(gecici!=0){
            basamak = gecici % 10;
            gecici = gecici / 10;
            toplam += Math.pow(basamak, üs);
        }
        if(sayi == toplam){
            System.out.println(sayi + " Armstrong sayısıdır.");

        } else {
            System.out.println(sayi + " Armstrong sayısı değildir.");
        }
    }
}
