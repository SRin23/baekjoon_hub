import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i<n; i++){
            num.add(sc.nextInt());
        }
        Collections.sort(num);

        for(int i = 0; i<n; i++){
            System.out.println(num.get(i));
        }
    }
}
