import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //((x+1)*(y+1)-xy-x-y)^n
        int n = sc.nextInt();
        System.out.println((int)Math.pow(1, n));
    }
}
