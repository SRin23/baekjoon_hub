import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toUpperCase();
        if(text.equals("N")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}
