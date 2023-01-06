package Repeat;

import java.util.Scanner;
import java.util.StringTokenizer;

public class forSample10_APIClass3 {

	public static void main(String[] args) {
		//replace: 대체 메소드
		
		String s = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		if(sc.hasNext())
			s = sc.next(); // "자바는.객체지향.언어.입니다.자바는.풍부한.API를.지원합니다."
		System.out.println("String: " + s);

		// 문제> 자바라는 단어를 Java로 변경
		// "Java는.객체지향.언어.입니다.Java는.풍부한.API를.지원합니다."
		String oldJava = s;
		
		String newJava = null;
		StringTokenizer st = new StringTokenizer(oldJava, ".");
		while(st.hasMoreTokens()) {
			newJava = (st.nextToken()).replace("자바", "Java");
			System.out.print(newJava + " ");
		}

	}
}

