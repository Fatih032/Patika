import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {

        Integer num1, num2, ebob = 1, ekok;

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        num1 = input.nextInt();

        System.out.println("2. sayıyı giriniz:");
        num2 = input.nextInt();

        for( int i = Math.min(num1, num2); i >=2; i--){
            if (num1%i==0 && num2%i==0){
                ebob = i;
                break;
            }
        }
        ekok = num1 * num2;
        for (int j = Math.min(num1, num2); j <= num1*num2 ; j++){
            if (j%num1==0 && j%num2==0){
                ekok = j;
                break;
            }
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }

}
