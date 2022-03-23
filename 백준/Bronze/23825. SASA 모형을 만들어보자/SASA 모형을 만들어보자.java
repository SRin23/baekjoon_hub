import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt()/2;
        int a = sc.nextInt()/2;

        if(s>a){
            System.out.println(a);
        }else{
            System.out.println(s);
        }
    }
}
