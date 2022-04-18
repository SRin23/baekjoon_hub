import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(s > a){
            System.out.println((int)(Math.ceil((s-a)/b)*100 + 250));
        }else{
            System.out.println(250);
        }

    }
}
