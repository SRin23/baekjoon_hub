import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        for(int a = 0; a<k; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            for(int b = i-1; b<x; b++){
                for(int c = j-1; c<y; c++){
                    sum+=arr[b][c];
                }
            }
            System.out.println(sum);
        }
    }
}
