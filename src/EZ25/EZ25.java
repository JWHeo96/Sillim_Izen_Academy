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
		

		// ID ����ڸ� �ϳ� ����
		// user id�� ���� �̷� ��ӹ޾Ƽ� ����ؾ���.
		
		//���� �޼ҵ帶�� try ~ catch�� ����

		while(true) {
			ez25.Logo_EZ25();
			System.out.print("1. �α��� 2. ȸ������ 3. ȸ�� Ż�� 4. ���α׷� ����\n> ");
			String main = sc.next();
			ez25.clearScreen();
			
			if(main.equals("1")) {
				// �α��� �޼ҵ�
				login();
				// ���� ������ ������ 1���� Ư���س���
				while(true) {
					if(user.equals("admin")) {
						System.out.print("1. ��ȸ 2. ��ǰ ���� 3. �α׾ƿ�\n> ");
						main = sc.next();
						ez25.clearScreen();

							if(main.equals("1")) {
								System.out.print("1. ȸ�� 2. ��ǰ 3. ���� 4. ���� ���� ��� 5. ����\n> ");
								main = sc.next();
								ez25.clearScreen();
								if(main.equals("1")) {
									// ȸ�� ���� ��ȸ �޼ҵ�
									hi.hiMember();
								} else if(main.equals("2")) {
									// ���� ��ǰ ��ȸ �޼ҵ�
									hi.hiStock();
								} else if(main.equals("3")) {
									// ���� ���� ��ȸ �޼ҵ�
									hi.hiSales();
								} else if(main.equals("4")) {
									// ���� 5�� ������ ���� ���� �ľ� �޼ҵ� 
									hi.hiFind();
								} else if(main.equals("5")) {
									logout();
								} else {
									throw new InputMismatchException();
								}
							
						
						
							
								
							} else if (main.equals("2")) {
								System.out.print("1. ��� 2. ���� 3. ���� 4. ���� 5. ����\n> ");
								main = sc.next();
								ez25.clearScreen();
								if(main.equals("1")) {
									// ��ǰ ��� �޼ҵ�
									hm.headInsert();
								} else if(main.equals("2")) {
									// ��ǰ ���� �޼ҵ�
									hm.headUpdate();
								} else if(main.equals("3")) {
									// ��ǰ ���� �޼ҵ�
									hm.headDelete();
								} else if(main.equals("4")) {
									// ��ǰ ���� �޼ҵ�
									hm.floodStore();
								} else if(main.equals("5")) {
									logout();
								} else {
									throw new InputMismatchException();
								}
							} else if(main.equals("3")) {
								break;
							} else {
								throw new InputMismatchException("����");
							}
						
					} else {
					// �׷��� �Ǹ� ������ ����ڸ� ���� ������ �ν��ϸ� ��
						System.out.print("1. ��ȸ 2. �Ǹ� 3. ���� ����\n> ");
						main = sc.next();
						ez25.clearScreen();
						if(main.equals("1")) {
							System.out.print("1. ���� 2. ��� 3. ����\n> ");
							main = sc.next();
							ez25.clearScreen();
							if(main.equals("1")) {
								// ���� ���� ��ȸ
								si.siSales();
							} else if(main.equals("2")) {
								// ���� ��� ��ȸ
								si.siStock();
							} else if(main.equals("3")) {
								logout();
							} else {
								throw new InputMismatchException();
							}
						} else if(main.equals("2")) {
							// �Ǹ� �޼ҵ�
							Product_Sales ps = new Product_Sales();
							ps.salesInsert();
							logout();
						} else if(main.equals("3")) {
							// ���� �޼ҵ�
							Calculator calc = new Calculator();
							calc.deadLine();
							// �α׾ƿ�
							break;
						} else {
							throw new InputMismatchException();
						}
					}
				}
			}
		
		
			else if(main.equals("2")) {
				// ȸ������ �޼ҵ�
				reg.storeOpen();
				System.out.println();
				// ���� ȭ������ ���ư���
				continue;
			} else if(main.equals("3")) {
				// ȸ��Ż�� �޼ҵ�
				reg.storeClose();
				// ���� ȭ������ ���ư���
				continue;
			} else if(main.equals("4")) {
				// ���α׷� ����
				break;
			} else {
				// ���� ���� �߻� ��Ű��
				throw new InputMismatchException("���� �߻�");
			}
		
		}
	}
}