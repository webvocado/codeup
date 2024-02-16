package _1000;

import java.util.Scanner;

public class _1165 {

	public static void main(String[] args) {
		// 1반과 2반이 축구를 한다.
		// 축구 시간 90분 (추가시간은 없다)
		// 1반이 0점, 2반이 2점인 상황에서 1반은 성익이를 투입한다.
		// 성익이는 5분마다 골을 넣는다.
		// 80분에 투입되면 80분이 바로 골을 넣게되고, 85분에 골을 넣는다.
		// 경기타임과 우리팀의 득점이 입력으로 주어질 때
		// 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.

		// (출력예시)
		// 74 2
		// 6
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int score = sc.nextInt();
		
		for (int i = start; i < 90 ; i+=5) {
			score++;
		}

		System.out.println(score);
		
		sc.close();

	}

}
