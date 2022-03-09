import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int client = sc.nextInt();
        int[] seat = new int[100];
        int refuse = 0;

        for(int i = 0; i<client; i++){
            int check = sc.nextInt();
            if(seat[check-1]==0){
                seat[check-1]++;
            }else{
                refuse++;
            }
        }
        System.out.println(refuse);
    }
}
