package _1000;

import java.util.Scanner;

public class _1019 {          // 코드업 C언어 1019 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine();  // 스트링형으로 년도.월.일을 입력받음 
		String[] strE = str.split("\\.") ; // split메소드로 .으로 배열에 저장함
		String stra = strE[0] ;
		int a = Integer.parseInt(stra); // 년도
		String strb = strE[1] ;
		int b = Integer.parseInt(strb); // 월
		String strc = strE[2] ;
		int c = Integer.parseInt(strc); // 일
		System.out.printf("%04d.%02d.%02d",a,b,c) ;
		
		
		sc.close();
	}
}
