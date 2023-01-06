package Repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1. for
 * 2. while
 * 3. do ~ while
 */
public class forSample1_String {

	public static void main(String[] args) {
		// for statement
		// for(초기값; 조건식; 증감식) { ... }
		
		int i = 0;
		// 문제> "이젠 컴퓨터 아카데미 학원" 이라는 문자열을 5번 반복 출력하세요.
		String name ="이젠 컴퓨터 아카데미 학원";
		System.out.println("=====for문의 결과=====");
		for(i=0; i<5; i++) {
			System.out.println(i+1 + "." + name);
		}
		
		i=0;
		System.out.println("=====while문의 결과=====");
		// while문으로 변경하여 출력해 봅니다.
		while(i < 5) {
			System.out.println(i+1 + "." + name);
			i++;
		}
		
		i=0;
		System.out.println("=====do~while문의 결과=====");
		// do while문으로 변경하여 출력해 봅니다.
		// 일단은 먼저 실행한 다음 조건을 체크하여 거짓이면 종료합니다.
		do {
			System.out.println(i+1 + "." + name);
			i++;
		} while(i < 5);
		
	}
}
