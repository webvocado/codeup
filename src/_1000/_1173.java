package _1000;

import java.util.Scanner;

public class _1173 {
	public static void main(String[] args) {
		// 시와 분이 입력된다.
		// (시의 범위 : 0~23)
		// (분의 범위 : 0~59)
		// 입력된 시간의 30분 전의 시간을 출력하시오.

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hour, min;


		if (b > 30) {
			hour = a;
			min = b - 30;
		} else if (b == 0) {
			hour = ((a - 1) + 24) % 24;
			min = b + 30;
		} else {
			hour = a - 1;
			min = b + 30;
		}
		
		
		if (b > 30) {
			hour = a;
			min = b - 30;
		} else if (b == 30) { // 60분은 1시간으로 넘어가야 되기 때문
			hour = a;
			min = b - 30;
		} else {
			hour = ((a - 1) + 24) % 24;
			min = b + 30;
		}

		System.out.println(hour + " " + min);

		sc.close();

	}
}
