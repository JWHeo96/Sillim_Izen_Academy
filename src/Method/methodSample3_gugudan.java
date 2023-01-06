package Method;

import java.util.Scanner;

public class methodSample3_gugudan {
	
	public static int start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 단을 입력해주세요.");
		int x = sc.nextInt();
		return x;
	}
	public static int end() {
		Scanner sc = new Scanner(System.in);
		System.out.println("종료 단을 입력해주세요.");
		int y = sc.nextInt();
		return y;
	}
	
	private static void gugudan(int start, int end) {
		
		for(int i=start; i<=end; i++) {
			System.out.printf("====%d단====\t", i);
		} System.out.println();
		for(int i=1;i<=end;i++) {
			for(int j=start;j<=end;j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				if(j==end) {
					System.out.println();
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// 문제> 시작단과 끝단을 입력받아서, 구구단을 출력하세요.
		/* start: 2
		 * end: 18
		 * 
		 * static
		 * - main area와 field area의 데이터 공유를 위하여 사용
		 * - 타 클래스와 데이터 공유를 위하여 사용
		 */
		
		int x = start();
		int y = end();
		
		gugudan(x, y);
		
	}

}
