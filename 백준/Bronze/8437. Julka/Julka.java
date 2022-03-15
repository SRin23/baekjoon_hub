import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = sc.nextBigInteger();
        BigInteger sub = sc.nextBigInteger();

        BigInteger b = (sum.add(sub)).divide(BigInteger.valueOf(2));
        BigInteger a = sum.subtract(b);

        System.out.println(b);
        System.out.println(a);
    }
}
