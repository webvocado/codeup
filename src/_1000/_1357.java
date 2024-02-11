package _1000;

import java.util.Scanner;

public class _1357 {

	public static void main(String[] args) {
		// n이 입력되면 다음 삼각형을 출력하시오.
		/*
		    *
		    **
		    ***
		    **
		    *
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			// 별표 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 공백 출력
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {

			// 별표 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 공백 출력
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
		
		sc.close();
	}
}