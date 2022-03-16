import java.util.Scanner;

//Cupcake Party
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bigBox = sc.nextInt();
        int smallBox = sc.nextInt();

        int total = (bigBox*8)+(smallBox*3);
        System.out.println(total - 28);

    }
}
