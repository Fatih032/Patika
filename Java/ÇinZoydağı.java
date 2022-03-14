import java.util.Scanner;

public class ÇinZoydağı {
    public static void main(String[] args) {
        Integer yıl, kalan;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Doğum yılınızı giriniz:");
            yıl = input.nextInt();
        }
        kalan = yıl % 12;
        switch(kalan){
            case 0:
                System.out.println("Çin Zoydağı burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zoydağı burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zoydağı burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zoydağı burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zoydağı burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zoydağı burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zoydağı burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zoydağı burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zoydağı burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zoydağı burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zoydağı burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zoydağı burcunuz : Koyun");
                break;      
        }
    }
}
