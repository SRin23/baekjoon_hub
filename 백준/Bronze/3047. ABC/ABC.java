import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i<3; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        String str = sc.next();

        int[] result = new int[3];
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='A'){
                result[i] = num[0];
            }else if(str.charAt(i)=='B'){
                result[i] = num[1];
            }else{
                result[i] = num[2];
            }
        }

        for(int i = 0; i<3; i++){
            System.out.print(result[i] + " ");
        }
    }
}
