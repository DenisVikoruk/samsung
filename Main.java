import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float x=scanner.nextFloat();
        if(x>=3 && x<=8)
            System.out.print("true");
        else System.out.print("false");
    }
}