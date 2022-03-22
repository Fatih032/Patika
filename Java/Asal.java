import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        int num ; 
        System.out.print("2 ");
        for (int i = 3; i < 100; i++){
            boolean asalmı = true;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    asalmı = false;
                    break;
                }
            }
            if(asalmı == true){
                System.out.print(i + " ");
            }
        }
    }
}
