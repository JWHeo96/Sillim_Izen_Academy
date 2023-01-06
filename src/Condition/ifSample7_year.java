package Condition;

import java.util.Scanner;

public class ifSample7_year {

	public static void main(String[] args){
		
		// 올해 년도는 홀수해인지 짝수해인지를 판별하여 구하여 출력해 보세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		int year = sc.nextInt();
		if(year%2 == 0) {
			System.out.println(year + "년은 짝수의 해입니다.");
		} else if(year<0 || year>5000){
			System.out.println("잘못된 입력입니다.");
		} else {
			System.out.println(year + "년은 홀수의 해입니다.");	
		}
	}
	
}
