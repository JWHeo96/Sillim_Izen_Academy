package EZ25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EZ25 extends Log {
	void Logo_EZ25() {
		System.out.println("******************************************");
		System.out.println("*  /////// ///////      /////// ///////  *");
		System.out.println("*  //          //            // //       *");
		System.out.println("*  ///////    //        /////// ///////  *");
		System.out.println("*  //        //         //           //  *");
		System.out.println("*  /////// ///////      /////// ///////  *");
		System.out.println("******************************************");
	}
	void clearScreen() {
		for(int i=0; i<50; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		Register reg = new Register();
		EZ25 ez25 = new EZ25();
		Head_inquiry hi = new Head_inquiry();
		Head_Management hm = new Head_Management();
		Store_Inquiry si = new Store_Inquiry();
		

		// ID 상속자를 하나 선언
		// user id를 선언 이래 상속받아서 사용해야함.
		
		//실행 메소드마다 try ~ catch문 들어가기

		while(true) {
			ez25.Logo_EZ25();
			System.out.print("1. 로그인 2. 회원가입 3. 회원 탈퇴 4. 프로그램 종료\n> ");
			String main = sc.next();
			ez25.clearScreen();
			
			if(main.equals("1")) {
				// 로그인 메소드
				login();
				// 본사 관리자 계쩡을 1개로 특정해놓음
				while(true) {
					if(user.equals("admin")) {
						System.out.print("1. 조회 2. 상품 관리 3. 로그아웃\n> ");
						main = sc.next();
						ez25.clearScreen();

							if(main.equals("1")) {
								System.out.print("1. 회원 2. 상품 3. 매출 4. 점포 부족 재고 5. 이전\n> ");
								main = sc.next();
								ez25.clearScreen();
								if(main.equals("1")) {
									// 회원 정보 조회 메소드
									hi.hiMember();
								} else if(main.equals("2")) {
									// 본사 상품 조회 메소드
									hi.hiStock();
								} else if(main.equals("3")) {
									// 본사 매출 조회 메소드
									hi.hiSales();
								} else if(main.equals("4")) {
									// 수량 5개 이하의 점포 물건 파악 메소드 
									hi.hiFind();
								} else if(main.equals("5")) {
									logout();
								} else {
									throw new InputMismatchException();
								}
							
						
						
							
								
							} else if (main.equals("2")) {
								System.out.print("1. 등록 2. 수정 3. 삭제 4. 전달 5. 이전\n> ");
								main = sc.next();
								ez25.clearScreen();
								if(main.equals("1")) {
									// 상품 등록 메소드
									hm.headInsert();
								} else if(main.equals("2")) {
									// 상품 수정 메소드
									hm.headUpdate();
								} else if(main.equals("3")) {
									// 상품 삭제 메소드
									hm.headDelete();
								} else if(main.equals("4")) {
									// 상품 전달 메소드
									hm.floodStore();
								} else if(main.equals("5")) {
									logout();
								} else {
									throw new InputMismatchException();
								}
							} else if(main.equals("3")) {
								break;
							} else {
								throw new InputMismatchException("오류");
							}
						
					} else {
					// 그렇게 되면 나머지 사용자를 전부 점포로 인식하면 됨
						System.out.print("1. 조회 2. 판매 3. 영업 마감\n> ");
						main = sc.next();
						ez25.clearScreen();
						if(main.equals("1")) {
							System.out.print("1. 매출 2. 재고 3. 이전\n> ");
							main = sc.next();
							ez25.clearScreen();
							if(main.equals("1")) {
								// 점포 매출 조회
								si.siSales();
							} else if(main.equals("2")) {
								// 점포 재고 조회
								si.siStock();
							} else if(main.equals("3")) {
								logout();
							} else {
								throw new InputMismatchException();
							}
						} else if(main.equals("2")) {
							// 판매 메소드
							Product_Sales ps = new Product_Sales();
							ps.salesInsert();
							logout();
						} else if(main.equals("3")) {
							// 정산 메소드
							Calculator calc = new Calculator();
							calc.deadLine();
							// 로그아웃
							break;
						} else {
							throw new InputMismatchException();
						}
					}
				}
			}
		
		
			else if(main.equals("2")) {
				// 회원가입 메소드
				reg.storeOpen();
				System.out.println();
				// 메인 화면으로 돌아가기
				continue;
			} else if(main.equals("3")) {
				// 회원탈퇴 메소드
				reg.storeClose();
				// 메인 화면으로 돌아가기
				continue;
			} else if(main.equals("4")) {
				// 프로그램 종료
				break;
			} else {
				// 강제 오류 발생 시키기
				throw new InputMismatchException("오류 발생");
			}
		
		}
	}
}