package methodOverloading;

import java.util.Scanner;

public class overloadSample2_Operation2 {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int sequre() {
		int x = sc.nextInt();
		int xx = x * x;
		return xx;
	}
	
	private static double sequre(double x) {
		double xx = x * x;
		return xx;
	}
	
	public static void main(String[] args) {
		/* 메뉴를 선택하여
		 * 1. 덧셈
		 * 2. 뺄셈
		 * 3. 나눗셈(나머지)
		 * 4. 종료
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("수행하고자 하는 연산을 선택해주세요.\n1. 정수형의 자승\t2. 실수형의 자승\t3. 종료");
			String su = sc.next();
			switch(su) {
			case "1": int result = sequre();
				System.out.println(result);
				break;
			case "2": System.out.println("실수형 데이터를 입력하세요.");
				double x = sc.nextDouble();
				double result2 = sequre(x);
				System.out.println(result2);
				break;
			default: System.exit(0);
			}
			
		}
	}


}
