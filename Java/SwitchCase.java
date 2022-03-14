public class SwitchCase {
    public static void main(String[] args) {
        Integer day = 3;
        switch (day) {
            case 1:
                System.out.println("Bugün pazartesi");
                break;
            case 2:
                System.out.println("Bugün salı");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            case 4:
                System.out.println("Bugün perşembe");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
