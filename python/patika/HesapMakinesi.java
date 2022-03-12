import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2, sonuc;
        Integer islem;
        Scanner inp = new Scanner(System.in);
        System.out.println("İşlemi giriniz:\nToplama için 1\nÇıkarma için 2\nBölme için 3\nÇarpma için 4");
        islem = inp.nextInt();
        System.out.println("sayı 1'i giriniz: ");
        n1 = inp.nextDouble();
        System.out.println("sayı 2'i giriniz: ");
        n2 = inp.nextDouble();
        if (islem == 1) {
            sonuc = n1 + n2;
            System.out.println("Toplama işleminin sonucu: " + sonuc);
        }else if ( islem == 2){
            sonuc = n1 -n2;
            System.out.println("Çıkarma işleminin sonucu: " + sonuc);
        }else if ( islem == 3){
            sonuc = n1 / n2;
            System.out.println("Bölme işleminin sonucu: " + sonuc);
        }else if (islem == 4){
            sonuc = n1 * n2;
            System.out.println("Çarpma işleminin sonucu: " + sonuc);
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
        
    }
}
