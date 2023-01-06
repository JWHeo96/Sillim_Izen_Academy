package Method;
/* method란? = function = 함수 
 * 자주 반복되는 특정 조건의 특정 기능(동작, 행위)을 구현한 것
 * ---------------------------
 *  returnValue		argument
 * ---------------------------
 * 1.	O				O
 * 2.	O				X
 * 3.	X				O
 * 4.	X				X
 * ---------------------------
 * 
 * 메소드 형식>
 * 접근제한자	반환값	메소드명(매개변수)		{ ... }		
 * public	void	xx(parameterValue)	{ ... } 
 * 
 * 접근제한자 4가지 종류
 * - public: 타클래스나 타 패키지에서 호출 사용 가능
 * - protected: 상속 관계에 있으면 호출 사용 가능
 * - private: 오로지 자신의 클래스 내부에서만 호출이 가능
 * - 생 략: 자신의 클래스와 같은 패키지인 경우에 사용 가능
 * 
 * 반환값: void, String, char, int, float, double ... 
 * 
 * 메소드명: 예약어는 사용 불가
 * 
 * 매개변수: 데이터를 받는 입장(수신)
 * 전달인자: 데이터를 주는 입장(송신)
 * 
 * call by value: int a = 100;
 *  값을 전달하고, 전달 받은 값을 처리하는데 서브프로그램의 결과가 주프로그램에 영향을 주지 않는다.
 *  대체적으로 return이 필요하지 않습니다.
 * call by reference: public void xx(parameterValue) { ... }
 *  값을 전달하고, 전달 받은 값을 처리하는데 서브프로그램의 결과가 주프로그램에 영향을 준다.
 *  대체적으로 return이 필요합니다.
 */
public class methodSample1_concept {	// 15000
// Field Area
	private static void Hello(int x) { // x: 매개변수값, static: 정보공유 = 주소공유 = 접근허용
		// TODO Auto-generated method stub
		for(int i=0; i<=x; i++) {
			System.out.println("안녕하세요.");
		}
	}

	// main 메소드는 프로그램의 시작이고 끝입니다.
	public static void main(String[] args) {	// 3000
	// Main Area
		// 안녕하세요
		Hello(5); //5: 전달인자

	}

}
