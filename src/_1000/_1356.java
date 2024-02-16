package _1000;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		// 길이 n이 입력되면 다음과 같은 사각형을 출력한다.
		/*
		 *****
		 *   * 
		 *   * 
		 *   *
		 *****
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i==1 || i==n) {
				for(int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n-1) { System.out.print("*"); }
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

		sc.close();
	}

}