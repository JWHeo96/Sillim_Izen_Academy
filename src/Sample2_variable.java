

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 변수 : variable : 데이터 저장 공간
 * 
 *
 */
class Calculator {
	
	void dataInput(int x, int y) {
		int sum = x + y;
		int sum2 = x - y;
		int sum3 = x * y;
		int sum4 = x / y;

		System.out.println("덧셈 합계 : " + sum );
		System.out.println("뺄셈 합계 : " + sum2 );
		System.out.println("곱셈 합계 : " + sum3 );
		System.out.println("나눗셈(몫) 합계 : " + sum4 );
		
	}
}
	
public class Sample2_variable {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		/* 
		 * 예외 처리란?
		 * - 비상사태, 돌발상황 경우를 대비하여 미리 개발자가 준비해야 합니다.
		 * - 하드웨어적 오류, 소프트웨어적 오류, 환경적 오류 등이 발생 가능성
		 */
		while(run) {
			try { // 아래 내용이 실행되면서 문제(오류)가 발생할 여지가 있는 코드를 기입합니다. 
			System.out.println("1.정수형 데이터를 입력하세요.");
			/* int : 정수형으로, 자료형이라 불립니다. 
			 * x : x라는 변수에 저장
			 * int => Integer의 약어.
			 */
			int x = sc.nextInt();	// 객체명.메소드명 공식
			System.out.println("2.정수형 데이터를 입력하세요.");
			int y = sc.nextInt();	
			
			Calculator sv = new Calculator();
			sv.dataInput(x,y);
			
	

			System.out.println("데이터를 다시 입력하시겠습니까?");
			String str = sc.next();
			
			if(str.equals("yes")) {
				continue;
			} else {
				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;
			}
			} catch (InputMismatchException ime) {
				// 오류가 발생하면 스택에 있는 오류 메시지를 찾아서 출력하세요.
//				ime.printStackTrace();
				System.out.println("정수형 데이터를 입력하세요. 확인 바랍니다.");
				sc.nextLine();
			} finally {
//				// 정상동작이든 오류가 발생하든 무조건 실행합니다.
//				if(sc != null) {
//				sc.close();
//				}
			}
		}
	}
}

