package _1000;

import java.util.Scanner;

public class _1222 {
	public static void main(String[] args) {
		// 축구 시간 90분 (추가시간은 없다)
		// 성익이는 5분마다 골을 넣는다.
		// 80분에 투입되면 80분이 바로 골을 넣게되고, 85분에 골을 넣는다.
		// 경기타임과 우리팀 득점, 상대방 득점
		// 성익이를 투입하면 우리팀이 이길 수 있는지 출력
		// "win" "same" "lose"

		// (출력예시)
		// 80 5 7
		// same
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int MyScore = sc.nextInt();
		int TheirScore = sc.nextInt();
		
		for (int i = start; i < 90 ; i+=5) {
			MyScore += 1;
		}

		if (MyScore > TheirScore) {
			System.out.println("win");
		} else if (MyScore == TheirScore) {
			System.out.println("lose");
		} else {
			System.out.println("same");
		}
				
		sc.close();

	}
}
