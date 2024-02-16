package _1000;

import java.util.Scanner;

public class _1351 {

	public static void main(String[] args) {
		// 시작단과 마지막 단을 입력하면, 그 구간의 구구단을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		sc.close();
	}

}
