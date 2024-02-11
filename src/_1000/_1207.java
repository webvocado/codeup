package _1000;

import java.util.Scanner;

public class _1207 {

	// 윷의 4가지 상태가 공백으로 구분되어 입력 된다.
	// 0 이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태
	// 윷 상태를 보고 도, 개, 걸, 윷, 모를 판단하여 출력한다.
	// 입력: 0 0 1 0
	// 출력: 도

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int sum = 0;
		sum = a + b + c + d;

		switch (sum) {
		case 1:
			System.out.print("도");
			break;
		case 2:
			System.out.print("개");
			break;
		case 3:
			System.out.print("걸");
			break;
		case 4:
			System.out.print("윷");
			break;
		case 0:
			System.out.print("모");
			break;
		default:
			break;
		}
		sc.close();
	}

}
