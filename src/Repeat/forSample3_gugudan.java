package Repeat;

public class forSample3_gugudan {

	public static void main(String[] args) {
		// 문제> 구구단을 출력하세요.
		int i, j;
		System.out.println("===========================================================for문===========================================================");
		for(i=2; i<10; i++) {
			System.out.printf("====%d단====\t", i);
		} System.out.println();
		for(i=1;i<10;i++) {
			for(j=2;j<10;j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				if(j==9) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\n==========================================================while문==========================================================");
		// while문 출력
		i=1;
		while(i<10) {
			j = 2;
			while(j<10) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				if(j==9) {
					System.out.println();
				}
				j++;
			}
			i++;
		}
	}
}
