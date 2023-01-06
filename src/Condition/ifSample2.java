package Condition;

import java.util.Scanner;

public class ifSample2 {

	public static void main(String[] args) {
		
		// 데이터를 입력 받아서 남성인지, 여성인지를  판별하는데,
		// 1900년대 사람과 2000년대 사람을 구분하여 출력해 보세요.

		boolean stop = true;
//		while(stop) {				// 1번 방법
//			Scanner sc = new Scanner(System.in);
//			System.out.println("숫자를 입력하세요.");
//			System.out.println("(1,3): 남성, (2,4): 여성");
//
//			int x = sc.nextInt();
//			// 1900년대 사람 구분: 1(남성), 2(어성) 2000: 3(남성), 4(여성)
//			switch(x) {
//			case 1:
//				System.out.println("1900년대생 남성");
//				break;
//			case 2:
//				System.out.println("1900년대생 여성");
//				break;
//			case 3: 
//				System.out.println("2000년대생 남성");
//				break;
//			case 4:
//				System.out.println("2000년대생 여성");
//				break;
//			case 100: 
//				stop = false;
//				System.out.println("종료 되었습니다.");
//				break;
//			default:
//				System.out.println("잘못된 데이터 입력입니다.");
//			}
//			System.out.println("===========================");
//		}
		
		// EOF: 데이터가 없으면 끝이면... STOP해라
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()) {				// 2번 방법
//			System.out.println("숫자를 입력하세요.");
//			System.out.println("(1,3): 남성, (2,4): 여성");
//
//			int x = sc.nextInt();
//			// 1900년대 사람 구분: 1(남성), 2(어성) 2000: 3(남성), 4(여성)
//			if(x == 1 || x == 3) {
//				System.out.println("남성");
//			} else if (x == 2 || x == 4) {
//				System.out.println("여성");
//			} else {
//				System.out.println("잘못 된 데이터 입력입니다.");
//			} System.out.println("=========================");
//		}
		
		while(stop) {				// 3번 방법
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			System.out.println("(1,3): 남성, (2,4): 여성");

			int x = sc.nextInt();
			// 1900년대 사람 구분: 1(남성), 2(어성) 2000: 3(남성), 4(여성)
			switch(x) {
			case 1: case 3: 
				System.out.println("남성"); break;
			case 2: case 4: 
				System.out.println("여성"); break;
			default:
				System.out.println("잘못된 데이터 입력입니다.");
				if(x > 100 ) {
					stop = false;
					System.out.println("종료 되었습니다.");
				}
			} System.out.println("===========================");
		}
	}
}
