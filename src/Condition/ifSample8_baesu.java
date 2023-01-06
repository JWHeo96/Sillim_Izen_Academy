package Condition;

import java.util.Scanner;

public class ifSample8_baesu {

	public static void main(String[] args) {
		//임의의 수를 입력 받아서, 그 수가 어떤 배수인지를 판별하여 출력해 보세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		int num = 0;
		num = sc.nextInt();
		
		// 2 ~ 9까지의 모든 배수 구하기
//		for(int i=2;i<=9;i++) {
//			if(num%i == 0) {
//				System.out.printf("숫자 %d은(는) %d의 배수입니다.\n", num, i);
//			}
//		}
		
		// 3, 5, 7, 9의 배수 구하기
		for(int j=3; j<10; j+=2) {
			if(num%j == 0) {
				System.out.printf("숫자 %d은(는) %d의 배수입니다.\n", num, j);
			} else {
				System.out.println("배수가 아닙니다.");
				break;
			}
		}
	}
}
