package Method;

import java.util.Scanner;

public class methodSample3_gugudan {
	private static void gugudan(int start, int end) {
		
		System.out.println("===========================================================for문===========================================================");
		for(int i=start; i<=end; i++) {
			System.out.printf("====%d단====\t", i);
		} System.out.println();
		for(int i=1;i<=end;i++) {
			for(int j=2;j<=end;j++) {
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
		 * end: 400
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 값을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("종료 값을 입력해주세요.");
		int y = sc.nextInt();
		
		gugudan(x, y);
		
	}


}
