package Condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifSample10_subaesu {

	public static void main(String[] args) {
		// 임의의 수를 입력 받아서, 1~100 사이의 숫자인지 판별하고, 그 수가 7의 배수인지를 확인하여 출력해 보세요.
		System.out.println("임의의 숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		try {
			while(cnt < 6) {
				int num = sc.nextInt();
				if((num>=1 && num<=100) && (num%7 == 0)) {
					System.out.println(num + "은(는) 1~100 사이의 숫자이면서, 7의 배수입니다.");
				} else if (!(num>=1 && num<=100) && (num%7 == 0)) {
					System.out.println(num + "은(는) 7의 배수이지만, 1~100 사이의 숫자가 아닙니다.");
				} else if ((num>=1 && num<=100) && !(num%7 == 0)) {
					System.out.println(num + "은(는) 1~100 사이의 숫자이지만 7의 배수가 아닙니다.");
				} else {
					System.out.println(num + "은(는) 1~100 사이의 숫자가 아니고, 7의 배수 또한 아닙니다.");
				}
				cnt++;
			}
		} catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("잘못 된 입력값입니다.");
		}
	}		
}
