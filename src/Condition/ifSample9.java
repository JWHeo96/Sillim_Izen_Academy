package Condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifSample9 {

	public static void main(String[] args) {
		// 임의의 수를 입력 받아서, 그 수가 hint에 주어진 수보다 큰지, 작은지 ,같은지를 판별하여 출력해 보세요.
		// hint> 555
		final int hint = 555;
		int cnt = 1;
		
		System.out.println("임의의 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		//try area에는 철되면서 잘못될 부분이 있는 경우에 반드시 예외 처리를 합니다.
		try {
			while(cnt < 6) {
				cnt++;
				int num = sc.nextInt();
				if(num > hint) {
					System.out.printf("num: %d는\nhint: %d보다\n큰 숫자입니다.\n", num, hint);
				} else if(num < hint ) {
					System.out.printf("num: %d는\nhint: %d보다\n작은 숫자입니다.\n", num, hint);
				} else {
					System.out.printf("num: %d와\nhint: %d는\n같은 숫자입니다.\n", num, hint);
				}
				System.out.println("\n임의의 수를 입력해주세요.");
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("입력값이 잘못되었습니다.");
		}
	}
}





