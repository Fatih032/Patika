import java.util.Scanner;

public class Manav{
    public static void main(String[] args) {
        double elma, armut, domates, muz, patlican;
        double elmakg, armutkg, domateskg, muzkg, patlicankg;
        elmakg = 3.67;
        armutkg = 2.14;
        domateskg = 1.11;
        muzkg = 0.95;
        patlicankg = 5.00;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç kilo elma alacaksınız? ");
        elma = inp.nextDouble();
        System.out.println("Kaç kilo armut alacaksınız? ");
        armut = inp.nextDouble();
        System.out.println("Kaç kilo domates alacaksısız? ");
        domates = inp.nextDouble();
        System.out.println("Kaç kilo muz alacaksınız? ");
        muz = inp.nextDouble();
        System.out.println("Kaç kilo patlıcan alacaksınız? ");
        patlican = inp.nextDouble();
        double toplam;
        toplam = domates * domateskg + armut * armutkg + elma * elmakg + patlican * patlicankg + muz * muzkg;
        
        System.out.println("Toplam fiyat: " + toplam);    

    }
}