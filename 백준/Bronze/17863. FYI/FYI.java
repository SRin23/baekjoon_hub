import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tel = sc.next();

        if(tel.substring(0, 3).equals("555")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
