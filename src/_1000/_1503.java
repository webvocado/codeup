package _1000;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int k = 1; // 1부터 증가하는 값

		// 값 입력
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = N - 1; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
		}

		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
