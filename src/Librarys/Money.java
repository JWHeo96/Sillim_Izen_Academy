package Librarys;

 /* Constructor(생성자)
 * 1. 책의 금액
 * 2. 지불 금액
 */
public class Money {
	// Money(int book, int pay)를 통해 입력받을 값을 저장할 변수 선언
	int book;
	int pay;
	
	// 생성자명은 클래스명과 같아야 함
	Money(int book, int pay){
		// SubClass에서 전달받은 값을 생성자의 클래스변수에 전달
		this.book = book;
		this.pay = pay;
	}
}
