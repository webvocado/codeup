package _1000;

import java.util.Scanner;

// 정수 n이 주어지면 1 ~ n 까지의 수 중에 
// 맨 마지막 자리에 1이 들어있는 경우가 몇 번인지 알아내는 프로그램을 작성하시오.

// 1-> 1
// 10 -> 1
// 1~10 : 1번
// 11~20 : 2번
// 21~30 : 3번

public class _1270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i%10 == 1) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
