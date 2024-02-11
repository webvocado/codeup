package _1000;

import java.util.Scanner;

public class _1361 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = n; j > 0; j--) {
					System.out.print(j + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
