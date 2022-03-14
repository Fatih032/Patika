import java.util.Scanner;



public class VücutKitleİndeksi {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / Math.pow(boy, 2);

        System.out.println("Vücut kitle indeksi: " + vki);
    }
}
