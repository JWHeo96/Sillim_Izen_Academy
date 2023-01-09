package methodOverloading;

import java.util.Scanner;

public class overloadSample2_Operation3 {
	
	public static boolean sw = true;
	
	private static void calculator(int x, int y) {
		int sum = x + y;
		System.out.println("두 수의 합: " + sum);
	}
	private static void calculator(int x, double y) {
		int dif = (int)(x - y);
		System.out.println("두 수의 차: " + dif);
	}
	private static void calculator(double x, int y) {
		int mok = (int)(x % y);
		System.out.println("두 수의 나눗셈(나머지): " + mok);
	}
	
	public static void main(String[] args) {
		/* 메뉴를 선택하여
		 * 1. 덧셈
		 * 2. 뺄셈
		 * 3. 나눗셈(나머지)
		 * 4. 종료
		 */
		Scanner sc = new Scanner(System.in);
		while(sw) {
			System.out.println("수행하고자 하는 연산을 선택해주세요.\n1. 덧셈\t2. 뺄셈\t3. 나눗셈(나머지)\t4. 종료");
			int z = sc.nextInt();
			if(z==4) System.exit(0);
			
			System.out.println("첫번째 값을 입력해주세요");
			int x = sc.nextInt();
			
			System.out.println("두번째 값을 입력해주세요");
			int y = sc.nextInt();

			switch(z) {
				case 1: calculator(x, y); break;
				case 2: calculator(x, (double)y); break;
				case 3: calculator((double)x, y); break;
			}
			System.out.println();
			
		}
	}


}
