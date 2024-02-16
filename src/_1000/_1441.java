package _1000;

import java.util.Scanner;

public class _1441 { // 버블정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;
				
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		

		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j+1] < arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {			
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
