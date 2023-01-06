package Method;

import java.util.Scanner;

public class methodSample4_sungjuk {
	// class variable, 자동 초기화, 숫자 정수형=0, 숫자 실수형=0.0, 문자열=null
	public static double total;
	public static double avg;
	public static int kor;
	private static int eng;
	private static int mat;
	static String grade; // null
	
	public static void sungjukInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적을 입력해 주세요.");
		kor = sc.nextInt();
		System.out.println("영어 성적을 입력해 주세요.");
		eng = sc.nextInt();
		System.out.println("수학 성적을 입력해 주세요.");
		mat = sc.nextInt();
		System.out.println("학점을 입력 하세요.");
		grade = sc.next(); 
	}
	
	public static void sungjukProcess() {
		sungjukInput(); // 성적 입력 루틴
		total = kor + eng + mat;
		avg = total / 3;
	}
	
	public static void sungjukOutput() {
		sungjukProcess(); // 성적 처리 루틴
		System.out.println("합계: " + total + "점\n평균: " + avg + "\n학점: " + grade );
	}
	public static void main(String[] args) {
		//문제> 3과목의 성적을 입력 받아서 총점, 평균을 구하여 출력하세요.
		/* 모든 처리 및 실행은 메소드를 이용합니다.
		 * - sungjukInput();
		 * - sungjukProcess();
		 * - sungjukOutput(); 
		 */
		sungjukOutput(); // 성적 출력 루틴 
	}
}
