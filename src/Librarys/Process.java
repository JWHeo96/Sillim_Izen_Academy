package Librarys;

/* Interface
 * 1. 책과 지불 금액을 입력 받아 값을 할인(학부모: 3000원)
 * 2. 책과 지불 금액을 입력 받아 값을 할인(학생: 4000원)
 * 3. 위 1, 2번 두가지 경우의 결과를 계산하여, 최종적으로 소비자가 받을 금액을 계산, 출력  
 */
/* abstract calss Procsee
 * 추상 클래스 = 인터페이스
 * implements 사용 부분을 extends로 변경
 * 다중 상속이 가능하지 않기 때문에, 상황에 맞게 사용
 * 추상클래스의 객체 생성 불가능
 */
public interface Process{
	// 1. 책과 지불 금액을 입력 받아 값을 할인(학부모: 3000원)
	public abstract void discountAdult();
	// 2. 책과 지불 금액을 입력 받아 값을 할인(학생: 4000원) 
	public abstract void discountStudent();
	// 3. 위 1, 2번 두가지 경우의 결과를 계산하여, 최종적으로 소비자가 받을 금액을 계산, 출력  
	public abstract void result();
}
