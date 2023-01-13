package Librarys;

/* Interface
 * 1. 책과 지불 금액을 입력 받아 값을 할인(학부모: 3000원)
 * 2. 책과 지불 금액을 입력 받아 값을 할인(학생: 4000원)
 * 3. 위 1, 2번 두가지 경우의 결과를 계산하여, 최종적으로 소비자가 받을 금액을 계산, 출력  
 */
public interface Process{
	// 1. 책과 지불 금액을 입력 받아 값을 할인(학부모: 3000원)
	public abstract void discountAdult();
	// 2. 책과 지불 금액을 입력 받아 값을 할인(학생: 4000원) 
	public abstract void discountStudent();
	// 3. 위 1, 2번 두가지 경우의 결과를 계산하여, 최종적으로 소비자가 받을 금액을 계산, 출력  
	public abstract void result();
}
