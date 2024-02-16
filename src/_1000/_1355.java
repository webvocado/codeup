package _1000;

import java.util.Scanner;

public class _1355 {

	public static void main(String[] args) {
		// 길이 n이 입력되면 역삼각형을 출력한다.
		/*
 			*****
			 ****
			  ***
			   **
			    *
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}