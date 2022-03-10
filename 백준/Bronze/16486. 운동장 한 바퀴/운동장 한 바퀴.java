import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int circle = sc.nextInt();

        System.out.println((2*length) + (2*circle*3.141592));
    }
}