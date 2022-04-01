import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int small = sc.nextInt();
        int middle = sc.nextInt();
        int large = sc.nextInt();

        if(small + (2*middle) + (3*large)>=10){
            System.out.println("happy");
        }else{
            System.out.println("sad");
        }
    }
}
