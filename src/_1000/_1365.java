package _1000;

import java.util.Scanner;

/*
 	*********
 	**	   **
 	* *   * *
 	*  * *  *
 	*   *   *
 	*  * *  *
 	* *   * *
 	*********
 */

public class _1365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == 1 || i == N) {
					System.out.print("*");
				} 
				else if (j == 1 || j == N) {
					System.out.print("*");
				} 
				else if (i == j || i + j == N + 1) {	
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
