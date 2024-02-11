package _1000;

import java.util.Scanner;

public class _1227_seulgi {
	public static void main(String[] args) {
		// 첫째줄에 로또 당첨번호 6개 + 보너스 번호 1개 입력
		// 둘째줄에 임의 로또번호 6개 입력
		// 출력 : 1등 1, 2등 2, 3등 3, 4등 4, 5등 5, 꽝 0

		Scanner sc = new Scanner(System.in);
		int count = 0; // 맞춘 개수

		// 당첨 번호 6개 입력
		int[] winNo = new int[7];
		for (int i = 0; i < winNo.length; i++) {
			winNo[i] = sc.nextInt();
		}
		
		int bonus = 0;

		// 내 번호 6개 입력
		int[] myNo = new int[6];
		for (int i = 0; i < myNo.length; i++) {
			myNo[i] = sc.nextInt();
		}

		// 맞춘 개수 count 에 입력
		for (int num : myNo) {
			for (int num2 : winNo) {
				if (num2 == winNo[6]) continue;
				if (num == num2) {
					count++;
				}
			}
			if (num == winNo[6]) bonus =1;
		}
		
		switch (count) {
			
		case 3:
			System.out.println(5);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			
			if (bonus == 1) {
				System.out.println(2);
			}
			else {
				System.out.println(3);
			}
			
			break;
			
		case 6:
			System.out.println(1);
			break;
		

		default:
			System.out.println(0);
			break;
		}
		
		


		sc.close();
	}
}
