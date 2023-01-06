

//클래스 선언 : 
/*
 * 접근제한자: public 이어야 합니다. 왜? 정보를 공유해야 하니까, 접근이 용이해야 합니다.
 * class라는 키워드 사용
 * className을 적습니다.
 */

public class Sample1_Hello {
/* field area : 클래스 변수(전역변수)
	클래스 변수 선언, 클래스 메소드 선언
	생성자 선언도 가능, 일반 메소드 선언도 가능
*/
	
	// main method : 프로그램의 시작이면서 끝입니다.
	/*
	 * 지역 변수
	 * 메소드 만드는 방법
	 * 1. 접근제한자 : private, protected, public, 생략 가능
	 * 2. static : 정보 공유를 의미
	 * 3. void : 반환값이 없음을 의미, int, fload, double, char, <T>, String ...
	 * 4. main : main이라는 메소드명
	 * 5. String[] : 문자열 1차원 배열
	 * 6. args : 전달인자값이 있음을 의미합니다.
	 * 7. { ........} : 로직 코딩(알고리즘)
	 */

	public static void main(String[] args) {
		System.out.println("Hello Mr.hyun");
		System.out.println("안녕하세요?~~~");
		System.out.println("반갑습니다.");
		
		/* System: 클래스
		 * out : 객체(object) => 어떤 결과를 화면에 출력한다는 의미.
		 * println : 메소드명
		 * (" ... ") : 출력할 문자열
		 */
	} // main area

}

//한줄 주석 처리 

/*
여러줄 추석 처리

ctrl + f11 : 자바 실행

*/