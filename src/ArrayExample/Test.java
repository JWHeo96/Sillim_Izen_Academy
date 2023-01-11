package ArrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	 static int num = 1, n = 0, java = 0, jsp = 0, spring = 0, sum = 0;
	 static double aver = 0;
	 static Scanner sc = new Scanner(System.in);
	 static boolean run = true;	
	
	public static void main(String[] args) {
	/* 
	 * 학생수는 최저 5명,
	 * 과목수는 최저 3과목, 
	 * 번호, 이름, 과목1, 과목2,....과목n, 총점, 평균, 학점, 석차 출력
	 * 내름차순 출력
	 * 
	 */		
		
		// 학생 수 입력
		// 학점, 점수, 학생 수 배열 생성 및 할당
		while (run) {
		    try {
				System.out.println("입력하실 학생 수를 입력해주세요");
				n = sc.nextInt();
				run = false;
		    } catch (InputMismatchException e) {
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
		    }
		}
		String grade [] = new String[n]; 
		double total[][] = new double[n][7];
		String student[] = new String[n];
		run = true;
		System.out.println();

		// 학생 이름 입력
		// 점수 입력
		while (run) {
		    try {
				for (int i = 0; i < student.length; i++) {
				    System.out.println(num + "번 학생의 정보를 입력해 주세요");
				    System.out.println("성함을 입력해 주세요");
				    student[i] = sc.next();
				    
				    for (int j = 0; j < 5; j++) {
					switch (j) {
					case 0:
					    total[i][j] = num;
					    break;
					case 1:
					    System.out.println("자바점수를 입력해 주세요");
					    total[i][j] = sc.nextInt();
					    break;
					case 2:
					    System.out.println("jsp점수를 입력해 주세요");
					    total[i][j] = sc.nextInt();
					    break;
					case 3:
					    System.out.println("spring점수를 입력해 주세요");
					    total[i][j] = sc.nextInt();
					    break;
					}
				    }
				    System.out.println();
				    num++;
				}
				run = false;
		    } catch (InputMismatchException e) {
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
		    }
		}

		// 합계, 평균 입력
		for (int i = 0; i < total.length; i++) {
		    sum = (int) (total[i][1] + total[i][2] + total[i][3]);
		    total[i][4] = sum;
		    aver = total[i][4] / 3.0;
		    total[i][5] = aver;
		}

		// 등급 입력
		for(int i = 0 ; i < n ; i++) {
			if(total[i][4] >= 90) {
				grade[i] = "A";
			} else if(total[i][4] >= 80) {
				grade[i] = "B";
			} else if(total[i][4] >= 70) {
				grade[i] = "C";
			} else if(total[i][4] >= 60) {
				grade[i] = "D";
			} else {
				grade[i] = "F";
			} 	
		
		}
		
		// 석차 입력
		for (int i = 0; i < total.length; i++) {
		    total[i][6] = 1;
		}

		for (int i = 0; i < total.length; i++) {
		    for (int j = 0; j < total.length; j++) {
			if (total[i][5] < total[j][5]) {
			    total[i][6]++;
			}
		    }
		}

		// 출력
		System.out
			.println("-----------------------------------------------------------------------");
		System.out
			.println("                              성         적         표                     ");
		System.out.println("번호\t이름\t자바\tjsp\tspring\t총점\t평균\t학점\t석차");
		System.out
			.println("-----------------------------------------------------------------------");

		for (int i2 = 0; i2 < total.length; i2++) {
		    System.out.print((int) total[i2][0] + "\t" + student[i2]    + "\t");

		    for (int j = 1; j < total[i2].length; j++) {

			if (j == 5) {
			    System.out.print(String.format("%.2f", total[i2][j])    + "\t" + grade[i2] + "\t");
			} else {
			    System.out.print((int) total[i2][j] + "\t");
			}

		    }
		    System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		
	}
}


