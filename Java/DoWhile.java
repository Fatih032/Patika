public class DoWhile {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while(i < 3){
            do {
                System.out.print(j + ",");
                j++;
            } while(j < 4);
            i++;
        }

        // String isim = "Fatih";
        // int i = 0;

        // do {
        //     System.out.println("Merhaba " + isim);
        //     i++;
        // } while(i < 3);
    }
    
}
