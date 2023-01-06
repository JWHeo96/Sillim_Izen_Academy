import java.util.Scanner;

public class Sample4_operator4 {
	
	public static void main(String[] args) {
		// bitwise Operation
		/* bit and: &
		 * bit or : |
		 * ~ : 부호변환 연산
		 * ^ : XOR
		 * <<: *2
		 * >>: /2
		 * >>>: 연산이 끝날때까지 반복 처리
		 */
		
		int x = 20;
		int y = 15;
		int sum = x & y;
		System.out.println("x & y = " + sum);	
		/* 이진수로 변환
		 *   1 0 1 0 0 (20) 
		 * & 0 1 1 1 1 (15)
		 * -----------
		 *   0 0 1 0 0 (4)
		 */

		int sum2 = x | y;
		System.out.println("x | y = " + sum2);
		/* 이진수로 변환
		 *   1 0 1 0 0 (20) 
		 * | 0 1 1 1 1 (15)
		 * -----------
		 *   1 1 1 1 1 (31)
		 */
		
		int xx = -125;
		int xxx =~(xx);
		System.out.println("~(-125) = " + xxx);
		
		int xxxx =  ~(124);
		System.out.println("~(124) = " + xxxx);
		
		int yy = 20;
		int zz = 12;
		int sum3 = yy^zz;
		System.out.println("yy^zz = " + sum3);
		/* 이진수로 변환 xor = 둘 다 같지 않을 때 1
		 *  1 0 1 0 0 (20)
		 *^ 0 1 1 0 0 (12)
		 *----------------
		 *  1 1 0 0 0 (24) 
		 */
		int a = 250; // 250x2=500x2=1000x2
		int sum4 = a << 3;
		System.out.println(sum4); // 2000
		
		int b = 250; // 250/2=125x2=62x2=31/2=15/2=7
		int sum5 = b >> 5;
		System.out.println(sum5); // 7
		

		int c = 250; // 250/2=125x2=62x2=31/2=15/2=7/2=3/2=1/2=0
		int sum6 = c >>> 7;
		System.out.println(sum6); // 7
		
		
	// 문제> k가 -1 이하이거나 20 이상이고 , 3과 15 사이에 존재하며, 8이 아닙니다.
		// 이 결과는 무엇일까요?
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 값을 입력해주세요.");
		int start = sc.nextInt();
		System.out.println("종료 값을 입력해주세요.");
		int end = sc.nextInt();
		for(int k = start; k<=end; k++) {
			boolean result = ((k<=-1 || k>=20) && (3<=k && k<=15) && (k!=8));
			System.out.println("숫자: " + k);
			System.out.println(result);
		}
	}
}
