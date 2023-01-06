package Repeat;

import java.util.Scanner;
import java.util.StringTokenizer;

public class forSample10_APIClass2 {

	public static void main(String[] args) {
		
		String s = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		if(sc.hasNext())
			s = sc.next(); // "홍길동 박수홍 하석.한강빈 안혜지 박이레.김수환 임서하"
		System.out.println("String: " + s);
		
		StringTokenizer st = new StringTokenizer(s,".");
		int surang = st.countTokens(); // 문자열의 갯수 입력
		
//		for(int i=0; i<surang ; i++) {
//			System.out.print(st.nextToken() + " "); /// "홍길동 박수홍 하석 한강빈 안혜지 박이레 김수환 임서하"
//		}
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
	}
}
