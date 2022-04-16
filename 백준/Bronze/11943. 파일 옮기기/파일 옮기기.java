import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        second += sc.nextInt();
        first+=sc.nextInt();

        System.out.println(Math.min(first, second));
    }
}
