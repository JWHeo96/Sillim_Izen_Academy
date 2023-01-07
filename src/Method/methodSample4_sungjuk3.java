package Method;

import java.util.Scanner;

public class methodSample4_sungjuk3 {
	
	public static int n;
	public static int sum[];
	public static double avg[];
	public static String grade[];

	// 학생 수, 성적 입력
	public static int[][] inputScores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		n = sc.nextInt();
		int[][] stdScores = new int[n][3];
		// n명의 국어, 영어, 수학 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println((j+1) + "번째 학생의 국어 성적을 입력해주세요.");
				stdScores[j][0] = sc.nextInt();
				System.out.println((j+1) + "번째 학생의 영어 성적을 입력해주세요.");
				stdScores[j][1] = sc.nextInt();
				System.out.println((j+1) + "번째 학생의 수학 성적을 입력해주세요.");
				stdScores[j][2] = sc.nextInt();
			}
			System.out.println();
			break;
		}
		return stdScores;
	}
	
	// 학생들의 성적 합계 계산
	private static void calcTotal() {
		int stdScores[][] = inputScores();
		sum = new int[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				sum[i]+=stdScores[i][j];
			}
		}	
	}
	
	// 학생들의 성적 평균 계산
	private static void calcAvg() {
		avg = new double[n];
		for(int i=0; i<n; i++) {
			avg[i]=sum[i]/3.0;
		}	
	}
	
	// 학생들의 성적 학점 계산
	private static void calcGrade() {
		grade = new String[n];
		for(int i=0; i<n; i++) {
			if(avg[i]>100) grade[i] = "학점을 게산할 수 없습니다."; 
			else {
				switch((int)avg[i]/10) {
					case 9: grade[i]="A"; break;
					case 8: grade[i]="B"; break;
					case 7: grade[i]="C"; break;
					case 6: grade[i]="D"; break;
					default : grade[i]="F"; break;
				}
			}
		}
	}
	
	// 출력
	private static void outputScores() {
		calcTotal();
		calcAvg();
		calcGrade();
		//TotalCalc(); // (Easy.ver)
		for(int i=0; i<n; i++) {
//			System.out.println("No." + (i+1) + "학생===\n총 점수: " + sum[i] + "\n평균 점수: " + avg[i] + "\n학점: " + grade[i] +"\n");
			System.out.printf("%d번째 학생\n===========\n총 점수: %d\n평균 점수: %.2f\n학점: %s\n\n", i+1, sum[i], avg[i], grade[i]);
		}
	}
	
	
//	// 좀 더 쉽게 합치기(Easy.ver)
//	private static void TotalCalc() {
//		// 합계 계산
//		int stdScores[][] = inputScores();
//		sum = new int[n];
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<3; j++) {
//				sum[i]+=stdScores[i][j];
//				}
//			}	
//		// 평균 계산
//		avg = new int[n];
//		for(int i=0; i<n; i++) {
//			avg[i]=sum[i]/3;
//		}	
//		// 학점 계산
//		grade = new String[n];
//		for(int i=0; i<n; i++) {
//			if(avg[i]>100) grade[i] = "학점을 게산할 수 없습니다."; 
//			else {
//				switch(avg[i]/10) {
//				case 9: grade[i]="A"; break;
//				case 8: grade[i]="B"; break;
//				case 7: grade[i]="C"; break;
//				case 6: grade[i]="D"; break;
//				default : grade[i]="F"; break;
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
		/*
		 * 문제> 5명의 학생의 국어, 영어, 수학 입력받아서 총점, 평균을 구하고, 학점을 구하여 출력하세요.
		 * - method 4가지 중에 하나를 선택하여 작성합니다.
		 */
		outputScores();
	}
}
