package Librarys;

/* Sub Class
 * 1. Interface의 작업을 상속받아, 메소드 설계
 * - 책과 지불 금액을 입력 받아 값을 할인(학부모: 3000원)
 * - 책과 지불 금액의 금액을 입력 받아 값을 할인(학생: 4000원)
 * - 위 1, 2번 두가지 경우의 결과를 계산하여, 최종적으로 소비자가 받을 금액을 계산, 출력  
 * 2. Constuctor 클래스를 상속받아, Constructor 생성자로 값 전달
 */
class Cashier extends Money implements Process {
	// 학부모 할인 or 학생 할인의 결과값 저장
	int result = 0;

	/* Main 클래스에서 cashier(x, y)로 전달받은 값을 상속받은
	 * 생성자인 Money로 전달
	 */
	Cashier(int book, int pay) {
		super(book, pay);
	}

	// 학부모 할인 계산 값을 클래스 변수 result에 전달 
	@Override
	public void discountAdult() {
		result = super.pay - (super.book - 3000); 
	}

	// 학생 할인 계산 값을 클래스 변수 result에 전달
	@Override
	public void discountStudent() {
		result = super.pay - (super.book - 4000); 
	}

	// 계산 결과 출력
	@Override
	public void result() {
		System.out.println("\n지불 금액: " + super.pay);
		System.out.println("책의 금액: " + super.book);
		System.out.println("돌려받을 최종 금액: " + result);
	}
	
}
