import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for(int i = 0; i<5; i++){
            int tmp = sc.nextInt();
            if(t==tmp){
                result++;
            }
        }
        System.out.println(result);
    }
}
