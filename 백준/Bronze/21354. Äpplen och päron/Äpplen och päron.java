import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt()*7;
        int pear = sc.nextInt()*13;
        if(apple>pear) System.out.println("Axel");
        else if(apple<pear) System.out.println("Petra");
        else System.out.println("lika");
    }
}
