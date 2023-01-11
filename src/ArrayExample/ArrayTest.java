package ArrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTest {
	static int num=1, std=0, sub=0, sum=0;
	static double avg = 0;
	static Scanner sc = new Scanner(System.in);
	static boolean sw = true;
	static String subject[] = {"국어", "영어", "수학", "사회", "과학", "도덕"};
	
	public static void main(String[] args) {
		/* 
		 * 학생수는 최저 5명,
		 * 과목수는 최저 3과목, 
		 * 번호, 이름, 과목1, 과목2,....과목n, 총점, 평균, 학점, 석차 출력
		 * 내름차순 출력
		 */		
		while(sw) {
			try {
				System.out.println("학생 수를 입력해주세요.");
				std = sc.nextInt();
				System.out.println("과목 수를 입력해주세요.");
				sub = sc.nextInt();
				sw = false;
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요.");
				sc.nextLine();
			}
		}

	}

}
