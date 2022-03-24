import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = 0; i<k; i++){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j<n; j++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr, Collections.reverseOrder());
            int gap = Integer.MIN_VALUE;
            for(int r = 0; r<n-1; r++){
                gap = Math.max(arr.get(r) - arr.get(r+1), gap);
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + arr.get(0) + ", " + "Min " + arr.get(n-1) + ", " + "Largest gap " + gap);
        }
        System.out.println();
    }
}
