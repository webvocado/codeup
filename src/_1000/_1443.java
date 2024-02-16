package _1000;

import java.util.Scanner;

public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열의 크기
		int[] arr = new int[n + 1];

		// 배열 값 입력
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 2; i <= n; i++) {

			int key = arr[i];

			for (int j = i - 1; j >= 1; j--) {

				if (key < arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = key;
				}
			}

		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}
