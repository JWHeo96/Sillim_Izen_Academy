package Condition;

import java.util.Scanner;

public class ifSample5_sungjuk {

	public static void main(String[] args) {
		//데이터를 입력 받아서, 학점을 구하여 출력해 보세요.
		Scanner sc = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.");
		
//		while(sc.hasNextInt()) {
//			System.out.println("성적을 입력하세요.");
//			int kor = sc.nextInt();
//			
//			// SW = code의 재사용성 = 소프트웨어 공학 측면에서
//			if(kor >= 90) {
//				System.out.println("A 학점입니다.");
//			} else if(kor >= 80) {
//				System.out.println("B 학점입니다.");
//			} else if(kor >= 70) {
//				System.out.println("C 학점입니다.");
//			} else if(kor >= 60) {
//				System.out.println("D 학점입니다.");
//			} else {
//				System.out.println("F 학점입니다.");
//			}
//		}
		//-----------------------------------------
//		System.out.println("학점을 입력하세요.");
//		String kor = sc.next();
//		switch(kor) {
//		case "A":
//			System.out.println("90점 이상이고," + kor + "학점입니다."); break;
//		case "B":
//			System.out.println("80점 이상 90점 미만이고," + kor + "학점입니다."); break;
//		case "C":
//			System.out.println("70점 이상 80점 미만이고," + kor + "학점입니다."); break;
//		case "D":
//			System.out.println("60점 이상 70점 미만이고," + kor + "학점입니다."); break;
//		default: 
//			System.out.println("60점 미만이고, F학점입니다.");
//		} 
		
		System.out.println("성적을 입력하세요.");
		while(sc.hasNextInt()) {
			int kor = sc.nextInt();
			char grade;
			switch(kor/10) {
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
			}
			System.out.println("성적: " + kor + "\n등급: " + grade +"\n");
			System.out.println("성적을 입력하세요.");

		}
	}

}
