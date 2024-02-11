package _1000;

import java.util.Scanner;

public class _1358 {

	public static void main(String[] args) {
		// 어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
		// 여기서 입력되는 n은 반드시 홀수이다.
		/*
		 * n = 7일 때,
 		      *
 		     ***
		    *****
		   *******
		  *********
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= (n/2)+1; i++) {		
			for (int j = 0; j < (n/2)+1-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}

		sc.close();
	}

}
