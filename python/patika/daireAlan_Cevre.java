import java.util.Scanner;

public class daireAlan_Cevre {
    public static void main(String[] args) {
    double daireAlan, daireCevre, yaricap, daireDilimAlan, dilimAci;
    double pi = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.println("Daire yarıçap: ");
    yaricap = input.nextDouble();
    
    System.out.println("Daire açısını giriniz: ");
    dilimAci = input.nextDouble();

    daireAlan = pi * Math.pow(yaricap, 2);
    daireCevre = 2 * pi * yaricap;
    daireDilimAlan = ( pi * Math.pow(yaricap, 2)  * dilimAci ) / 360;
    System.out.println("Daire alanı: " + daireAlan);
    System.out.println("Daire çevresi: " + daireCevre);
    System.out.println("Daire dilimi alanı: " + daireDilimAlan);
    }
}
