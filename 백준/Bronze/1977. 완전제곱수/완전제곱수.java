import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int first = 0;
        for(int i = m; i<=n; i++){
            if((Math.sqrt(i)*10)%10==0){
                sum+=i;
                if(first==0){
                    first = i;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(first);
        }

    }
}
