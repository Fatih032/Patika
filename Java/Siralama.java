import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        double sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        sayi1 = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();

        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextDouble();

        if (sayi1 >  sayi2 && sayi1 > sayi3){
            System.out.println("En büyük sayı " + sayi1);

            if (sayi2 > sayi3){
                System.out.println("Ortanca sayı " + sayi2);
                System.out.println("En küçük sayı" + sayi3);
            } else {
                System.out.println("Ortanca sayı " + sayi3);
                System.out.println("En küçük sayı" + sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3){
            System.out.println("En büyük sayı " + sayi2);
            if ( sayi1 > sayi3) {
                System.out.println("Ortanca sayı " + sayi1);
                System.out.println("En küçük sayı" + sayi3);
            } else {
                System.out.println("Ortanca sayı " + sayi3 );
                System.out.println("En küçük sayı " + sayi1);
            }
        } else {
            System.out.println("En büyük sayı " + sayi3);
            if ( sayi1 > sayi2) { 
                System.out.println("Ortanca sayı " + sayi1);
                System.out.println("En küçük sayı " + sayi2);
            } else {
                System.out.println("Ortanca sayı " + sayi2);
                System.out.println("En küçük sayı " + sayi1);
            }
        }
    }    
}
