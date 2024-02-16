package _1000;

import java.util.Scanner;

public class _1260 {

	public static void main(String[] args) {
		// 어떤 수 a, b가 주어진다.
		// a와 b의 관계는 a <= b 이다.
		// a에서 b까지의 수 중 3의 배수만 더하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

		
		sc.close();
		
	}

}
