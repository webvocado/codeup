package _1000;

import java.util.Scanner;

public class _1502 {
	public static void main(String[] args) {
		// 2차원 배열 선언하기
		// n을 입력받아서 n x n 크기의 2차원 배열 출력하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n 입력값 받아오기	
		int[][] arr = new int[n][n]; // n 크기의 배열 만들기
		
		// 1~9 돌리는 변수 값
		int k = 1;
		
		// 배열안에 값 넣어주기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = k;
				k++;
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
