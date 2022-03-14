import java.util.Scanner;

public class Hipotenüs {
    public Hipotenüs() {
    }

    public static void main(String[] args) {
        double kenar1, kenar2, hipotenüs;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.Kenarı giriniz: ");
        kenar1 = inp.nextDouble();
        System.out.println("2.Kenarı giriniz: ");
        kenar2 = inp.nextDouble();
        hipotenüs = Math.pow(Math.pow(kenar1, 2) + Math.pow(kenar2, 2), 0.5);
        System.out.println("Hipotenüs: " + hipotenüs);

        double cevreyarisi = (kenar1 + kenar2 + hipotenüs) / 2;
        double alan = Math.pow(cevreyarisi*(cevreyarisi-kenar1)*(cevreyarisi-kenar2)*(cevreyarisi-hipotenüs), 0.5);

        System.out.println("Alan : " + alan);


        
    }
    
}
