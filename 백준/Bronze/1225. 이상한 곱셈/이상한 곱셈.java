import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] n1 = sc.next().split("");
        String[] n2 = sc.next().split("");

        long sum = 0;
        for(int i = 0; i<n1.length; i++){
            for(int j = 0; j<n2.length; j++){
                sum+=Long.parseLong(n1[i])*Long.parseLong(n2[j]);
            }
        }
        System.out.println(sum);
    }
}