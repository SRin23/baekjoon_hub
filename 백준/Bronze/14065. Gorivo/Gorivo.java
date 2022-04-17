import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double result = 100.0/(x*(1.609344/3.785411784));
        System.out.println(result);
    }
}
