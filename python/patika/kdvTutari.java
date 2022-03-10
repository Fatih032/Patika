import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        float ürünFiyati, kdvOrani, toplamFiyat;
        System.out.println("Ürün fiyatını giriniz: ");
        Scanner inp = new Scanner(System.in);
        kdvOrani = 0.18f;
        ürünFiyati =  inp.nextFloat();
        toplamFiyat = ürünFiyati * (1+kdvOrani);
        System.out.println("Kdv'li fiyat: " + toplamFiyat);


        
    }
    
}
