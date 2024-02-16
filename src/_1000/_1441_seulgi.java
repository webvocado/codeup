package _1000;

import java.util.Scanner;

public class _1441_seulgi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		// 0번째 인덱스 무시 , 1번째 요소부터 본다.
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		
		// 크기 = 5 ( 0 제외하고 )
		// 4번 검사한뒤 ( 1-2 2-3 3-4 4-5 )
		// 다음 순서에는 5번째 요소 제외하고 검사
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 1; i < arr.length; i++) {			
			System.out.println(arr[i]);
		}
		
		// 1 2 3 4 5
		
		
		// 0번째 1번째 비교 
		// 1번째 2번째 비교
		// ...
		// n번째 n+1번째 비교
		
		
		sc.close();
	}
}
