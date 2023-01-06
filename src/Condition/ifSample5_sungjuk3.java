package Condition;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ifSample5_sungjuk3 {

	public static void main(String[] args) {
		//데이터를 입력 받아서, 학점을 구하여 출력해 보세요.
		//조건> 삼항 연산자를 이용하여 처리
		Scanner sc = new Scanner(System.in);

		int cnt=0;
		while(cnt < 5) {	
			cnt++;
			System.out.println("성적을 입력하세요.");
			double kor = sc.nextDouble();
			String grade = 
				(kor<=100.0 && kor>=90.0) ? "A":
				(kor<90.0 && kor>=80.0) ? "B": 
				(kor<80.0 && kor>=70.0) ? "C": 
				(kor<70.0 && kor>=60.0) ? "D": 
				(kor<60.0 && kor>=0.0) ? "F": "잘못된 데이터 입력입니다.";
			System.out.println(grade + "\n");
		}
		
		String grade[] = new String[5];
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 학생의 성적을 입력하세요.");
			int kor = sc.nextInt();
			grade[i] = 
				(kor<=100 && kor>=90) ? "A":
				(kor<90 && kor>=80) ? "B": 
				(kor<80 && kor>=70) ? "C": 
				(kor<70 && kor>=60) ? "D": 
				(kor<60 && kor>=0) ? "F": "잘못된 데이터 입력입니다.";
		}
		for(int i=0; i<grade.length;i++) {
			System.out.println(i+1 + "번 째 학생의 학점 : " + grade[i] + "");
		}
	
//		while(sc.hasNextInt()) {
//			int kor = sc.nextInt();
//			if(kor<=100 && kor>=90) {
//				System.out.println("A 학점입니다.\n");
//			} else if(kor<90 && kor>=80) {
//				System.out.println("B 학점입니다.\n");
//			} else if(kor<80 && kor>=70) {
//				System.out.println("C 학점입니다.\n");
//			} else if(kor<70 && kor>=60) {
//				System.out.println("D 학점입니다.\n");
//			} else if(kor<60 && kor>=0){
//				System.out.println("F 학점입니다.\n");
//			} else {
//				System.out.println("잘못된 데이터가 입력 되었습니다...\n");
//			}
//			System.out.println("성적을 입력하세요.");
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
		
//		System.out.println("성적을 입력하세요.");
//		while(sc.hasNextInt()) {
//			int kor = sc.nextInt();
//			char grade;
//			switch(kor/10) {
//			case 9: grade = 'A'; break;
//			case 8: grade = 'B'; break;
//			case 7: grade = 'C'; break;
//			case 6: grade = 'D'; break;
//			default: grade = 'F';
//			}
//			System.out.println("성적: " + kor + "\n등급: " + grade +"\n");
//			System.out.println("성적을 입력하세요.");
//
//		}
	}

}
