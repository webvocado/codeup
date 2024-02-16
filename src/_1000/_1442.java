package _1000;

import java.util.Scanner;

public class _1442 { // 선택정렬
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int temp = 0;
		int arr[] = new int[n];
		
		// 스캐너 배열값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if ( arr[i] > arr[j] ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");			
		}
		
		
		sc.close();
	}
}
