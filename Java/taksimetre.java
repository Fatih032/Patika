import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        
        double tutar, km, kmUcret, acilis;
        Scanner input = new Scanner(System.in);
        kmUcret = 2.20;
        acilis = 10.0;
        System.out.println("Km giriniz: ");
        km = input.nextDouble();
        tutar = acilis + km * kmUcret;
        
        if (tutar < 20 ){
            tutar = 20;
        }
        
        System.out.println("Tutar : " + tutar);
    }     
    
}
