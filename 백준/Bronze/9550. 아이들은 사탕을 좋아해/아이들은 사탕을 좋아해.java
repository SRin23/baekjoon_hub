import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int children = 0;
            for(int j = 0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp>=k) children+=(tmp/k);
            }
            System.out.println(children);
        }
    }
}
