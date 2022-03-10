import java.util.Scanner;

public class notOrtamalasi {
    public static void main(String[] args) {
    int mat, fizik, kimya, tarih, müzik, türkçe;
    
    Scanner inp = new Scanner(System.in);

    System.out.println("Matematik Notunuz: ");
    mat = inp.nextInt();

    System.out.println("Kimya Notunuz: ");
    kimya = inp.nextInt();

    System.out.println("Fizik Notunuz: ");
    fizik = inp.nextInt();

    System.out.println("Tarih Notunuz: ");
    tarih = inp.nextInt();

    System.out.println("Müzik Notunuz: ");
    müzik = inp.nextInt();

    System.out.println("Türkçe Notunuz: ");
    türkçe = inp.nextInt();

    float toplam  = türkçe + mat + kimya + fizik + müzik + tarih;
    float sonuc = toplam / 6.0f;
    if (sonuc <60){
        System.out.println( sonuc + " Kaldınız.");
    }
    else if(sonuc>=60){
        System.out.println(sonuc + " Geçtiniz.");
    }
}
}
