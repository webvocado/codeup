package _1000;

import java.util.Scanner;

public class _1352 {

	public static void main(String[] args) {
		// 길이 n이 입력되면 길이가 n인 사각형을 출력하시오. 
		// 단, 사각형은 * 모양으로 채운다.
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}

