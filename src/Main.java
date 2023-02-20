import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getString("hvad hedder du?"));
        System.out.println(getInt("Angiv venligst din skostørrelse"));

    }
    public static String getString(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s+" : ");
        return scanner.nextLine();
    }
    public static int getInt(String s) {
        int res=0;

        while (true) {
            try {
            res = Integer.parseInt(getString(s));
            return res;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Husk ikke talord");
            }
        }
    }
}
