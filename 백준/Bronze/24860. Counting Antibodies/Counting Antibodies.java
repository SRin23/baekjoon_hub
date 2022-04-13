import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lightChainK = sc.nextInt()*sc.nextInt();
        int lightChainR = sc.nextInt()* sc.nextInt();
        long heavyChain = sc.nextInt()*sc.nextInt()*sc.nextInt();
        System.out.println(lightChainK*heavyChain + lightChainR*heavyChain);
    }
}
