import java.util.Scanner;

//인공지능 시계
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		
		int d = sc.nextInt();
		sc.close();

		second += d;
		minute += second/60;
		second %= 60;
		hour += minute/60;
		minute%=60;
		hour%=24;

		System.out.println(hour + " " + minute + " " + second);
	}

}
