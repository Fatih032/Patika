import java.util.Scanner;

public class notHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, müzik, türkçe;

        Scanner input = new Scanner(System.in);

        System.out.println("Matemetik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Müzik notunuz: ");
        müzik = input.nextInt();

        System.out.println("Türkçe notunuz: ");
        türkçe = input.nextInt();

        double ortalama = (kimya + fizik + mat + türkçe + müzik) / 5;

        if ( ortalama >= 55){
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız. ");
        }

        System.out.println("Ortalama: " + ortalama);
    }

}
