import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Integer yas, km, tip;
        double toplamFiyat, kmUcret = 0.10;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kilometreyi giriniz: ");
            km = input.nextInt();

            System.out.println("Yaşınızı giriniz: ");
            yas = input.nextInt();

            System.out.println("Yolculuk tipini seçiniz.\n1 => Tek yön\n2 => Gidiş-Dönüş ");
            tip = input.nextInt();
        }

        if (km <= 0 ){
            System.out.println("Kilometreyi hatalı girdiniz.");
        } else {
            if (tip <= 0 || tip >=3){
                System.out.println("Hatalı giriş yaptınız.");
            } else {
                if (yas <=0){
                    System.out.println("Yaşı hatalı girdiniz.");
                } else {
                    toplamFiyat = km * kmUcret;
                    if ( tip == 1){
                        if (yas <12 ) {
                            toplamFiyat /= 2;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        } else if (yas >= 12 && yas < 24 ){
                            toplamFiyat *= 0.9;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        }  else if (yas > 65 ){
                            toplamFiyat *= 0.7;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        } else {
                            System.out.println("Bilet tutarı : " + toplamFiyat);
                        }
                    } else {
                        if (yas <12 ) {
                            toplamFiyat *= 1 ;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        } else if (yas >= 12 && yas < 24 ){
                            toplamFiyat *= 1.8;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        }  else if (yas > 65 ){
                            toplamFiyat *= 1.4;
                            System.out.println("Bilet tutarı: " + toplamFiyat);
                        } else {
                            toplamFiyat *= 2;
                            System.out.println("Bilet tutarı : " + toplamFiyat);
                        }
    
                    }
                }
    
    
            }
        }

        
    }
}
