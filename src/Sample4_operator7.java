import java.util.Scanner;

public class Sample4_operator7 {
	
	public static void main(String[] args) {
		// 삼항 연산자 : x = (조건식) ? 참(조건식, 수식) : 거짓(조건식, 수식)
//		int x = 1;
//		
//		String su = (x == 1)? "참":"거짓";
//		System.out.println(su);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int x2 = sc.nextInt();
//		System.out.println((x2 == 1) ? "남자입니다.":
//							(x2 == 2) ? "여자입니다." : "오류 입니다.");	
		
		// 문제> 어떤 숫자를 입력 받아서, 홀수인지 짝수인지를 판별하여 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요(홀,짝 판별):");
//		int y = sc.nextInt();
//		String result = ( y%2 == 0 ) ? "짝수 입니다." : "홀수 입니다.";
//		System.out.println(result);
//		sc.close();
		
		// 문제> 어떤 숫자를 입력 받아서, 배수인지, 아닌지를 판별하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의수를 입력하세요.");
		int x4 = sc.nextInt();
		System.out.println("확인하고자 하는 배수의 값을 입력하세요.");
		int y = sc.nextInt();
		int c2 = x4 % y;
		System.out.println((c2 ==0) ? y + "의 배수 입니다." : y + "의 배수가 아닙니다.");
		sc.close();
		
	}
}

