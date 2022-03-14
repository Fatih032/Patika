import java.util.Scanner;

public class TekSayılarınToplamı {
    public static void main(String[] args) {
        int sum = 0, sayi;

        Scanner input = new Scanner(System.in);
        boolean isneg = false;

        while(!isneg){
            System.out.println("Sayı giriniz:");
            sayi = input.nextInt();
            
            if( sayi % 2 == 1){
                isneg = true;
                System.out.println("son toplam:" + sum);
            }
            if ( sayi % 4 == 0){
                sum += sayi;
                System.out.println("Toplam:" + sum);
            }
        }
        // while(!isneg){

        //     System.out.print("Sayı giriniz:");
        //     sayi = input.nextInt();

        //     if (sayi < 0) {
        //         isneg = true;
        //     }

        //     if(sayi % 2 == 1){
        //         sum += sayi;
        //         System.out.println(sum);
        //     }
        // }

    }
}
