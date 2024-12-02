import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual que B");
        }else {
            System.out.println("A es menor que B");
        }
    }
}