package Librarys;

import java.util.Scanner;

/* Main 클래스
 * 1. SubClass의 객체를 생성
 * 2. 스캐너를 이용해 x:책과 y:지불 금액 입력
 * 3. 입력받은 x:책, y:지불 금액의 값을 미리 생성했던 SubClass의 메소드로 전달
 */
public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Sub클래스로 넘겨줄 책과 지불 금액 입력
		System.out.print("책의 가격: ");
		int book = sc.nextInt();
		System.out.print("\n지불 금액: ");
		int pay = sc.nextInt();
		
		// Cashier 클래스에 cash 객체 생성과 동시에 book과 pay의 값 전달
		Cashier cash = new Cashier(book, pay);
		
		// 학부모와 학생을 구분하여 switch~case문 설계
		System.out.println("\n학부모:1\t학생:2\n번호를 선택해주세요.");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: cash.discountAdult(); break;
			case 2: cash.discountStudent(); break;
		}
		// 결과문 출력
		cash.result();
		
	}
}
