package ArrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array4_2array3_2 {
	// 전역 변수 선언
	static Scanner sc= new Scanner(System.in);
	static String subject[] = {"국어", "영어", "수학", "사회", "과학", "한국사"};
	static int std=0, sub=0;
	static boolean sw = true;
	
	// 출력문
	public static void header(int repeat) {
		int i =0;
		for(i=0; i<repeat+6;i++) {
			System.out.printf("========");
		}
		System.out.printf("\n번호\t이름\t");
		for(i=0; i<repeat; i++) {
			System.out.printf("%s\t",subject[i]);
		}
		System.out.printf("총점\t평균\t학점\t석차\n");
		for(i=0; i<repeat+6;i++) {
			System.out.printf("========");
		}
	}

	public static void main(String[] args) {
		/*
		 * 학생수는 최저 5명,
		 * 과목수는 최저 3과목,
		 * 번호, 이름, 과목1, 과목2, ... 과목n, 총점, 평균, 학점, 석차 출력
		 * 내림차순 출력
		 * 
		 */
		
		// 학생 및 과목 수 입력
		while(sw) {
			try {
				System.out.println("학생 수를 입력해주세요.");
				std = sc.nextInt();
				System.out.println("과목 수를 입력해주세요.");
				sub = sc.nextInt();
				sw = false;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine();
			}
		}
		sw = true;
		
		// 입력 수에 따른 각 배열 생성 및 할당
		int rank[] = new int[std];
		int score[][] = new int[std][sub];
		int sum[] = new int[std];
		double avg[] = new double[std];
		String grade[] = new String[std];
		String name[] = new String[std];

		// 반복문에 사용될 변수 및, 정렬을 위한 쓰레기변수 선언
		int i=0; int j=0; 
		int tempScore[]; int tempInt=0; double tempDouble; String tempStr=null;
		
		while(sw) {
			// 학생의 이름, 성적 입력
			while(sw) {
				try {
					for(i=0; i<name.length; i++) {
						//학생 이름 입력
						System.out.println((i+1) + "번째 학생의 이름을 입력하세요.");
						name[i] = sc.next();
						// 학생의 과목별 점수 입력
							for(j=0; j<sub; j++) {
								System.out.println(name[i] + " 학생의 " + subject[j] + "점수를 입력하세요.");
								score[i][j] = sc.nextInt();
								// 입력받은 과목의 총 합계 점수 계산
								sum[i] += score[i][j];
							}
						} 
					sw = false;
				} catch (InputMismatchException e) {
					System.out.println("잘못된 값을 입력하셨습니다. 처음부터 다시 입력해주세요.");
					sc.nextLine();
				}
				sw = true;
			}

				// 학생별 평균 점수 계산
				avg[i] = (double)sum[i]/sub;
				
				// 학생별 평균점수에 따른 학점 계산
				// 100점 초과시에는 grade에 잘못된 성적 입력
				if(avg[i]>100.0) {grade[i] ="-";} 
				else {
					switch((int)avg[i]/10) {
					    case 10: case 9: grade[i] = "A"; break;
						case 8: grade[i] = "B"; break;
						case 7: grade[i] = "C"; break;
						case 6: grade[i] = "D"; break;
						default: grade[i] = "F"; break; 
					} 
				}
			
		
			
			// 석차 구하기
			for(i=0; i<name.length; i++) {
				rank[i] = 1;
				for(j=0; j<name.length; j++) {
					// 평균점수 100점 초과시에는 합계에 0을 입력하여 최저 순위 입력
					for(int k=0; k<name.length; k++) {
						if(avg[k]>100.0) {
							sum[k] = 0;
						}
					}
					// 앞뒤 숫자 비교하여 클수록 1씩 카운트
					if(sum[i] < sum[j]) {
						rank[i]++;
					}
				}
			}
			
			// 점수 높은 순 정렬
			for(i=0; i<name.length-1; i++) {
				for(j=i+1; j<name.length; j++) {
					// 평균점수 100점 초과시에는 평균값에 0을 입력하여 최하위 순위로 변경
					for(int k=0; k<name.length; k++) {
						if(avg[k]>100.0) {
							avg[k] = 0;
						}
					}
					// 앞, 뒤의 숫자를 비교하여 선언된 모든 배열 정렬
					if(sum[i] > sum[j]) {
						{	tempInt = sum[i];
							sum[i] = sum[j];
							sum[j] = tempInt;		}
						{	tempDouble = avg[i];
							avg[i] = avg[j];
							avg[j] = tempDouble;	}
						{	tempStr = name[i];
							name[i] = name[j];
							name[j] = tempStr;		}
						{	tempStr = grade[i];
							grade[i] = grade[j];
							grade[j] = tempStr;		}
						{	tempInt = rank[i];
							rank[i] = rank[j];
							rank[j] = tempInt;		}
						{	tempScore = score[i];
							score[i] = score[j];
							score[j] = tempScore;	}
					}
				}
			}
				
			// 결과 출력
			header(sub);
					System.out.println();
					for(i=0; i<name.length; i++) {
						System.out.printf("%d\t%s\t", i+1, name[i]);
						for(j=0; j<sub; j++) {
							System.out.printf("%s\t",score[i][j]);
						}
						System.out.printf("%d\t%.2f\t%s\t%d\n", sum[i], avg[i], grade[i], rank[i]);
					}

				// 프로세스 종료 질문
				System.out.println("\n계속하시겠습니까? (y/n)");
				String conti = sc.next();
				if(conti.equals("y")) {
					continue;
				} else {
					System.exit(0);
			}
		}
	
	}
}

