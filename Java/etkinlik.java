import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Integer sicaklik ;

        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Hava sıcıklığı kaç derece? ");
            sicaklik = var.nextInt();
        }
        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >=5 && sicaklik < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik >=15 && sicaklik <= 25){
            System.out.println("Pikniğe yapabilirsiniz.");
        } else {
        System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}