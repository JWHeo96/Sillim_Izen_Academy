package getsetter;

import java.util.Scanner;

/* getter&setter => VO = DTO 역할(MVC2 pattern)
 * getter: 저장된 정보를 호출하여 출력
 * setter: 정보를 데이터베이스(여기서는 메모리로 한정)에 저장
 * 
 * 삼성 자동차 SM7이 색상은 발강색이고, 가격은 500원인데, 이름은 samsung_sm7이다.
 * 이것을 저장하고, 출력해 보세요.
 * 조건> get/setter 이용 
 * - setColor(): red, getColor(), String
 * - setPrice(): 500, getPrice(), int
 * - setName(): samsung_sm7, getName(), String
 */
public class Sample1_samsungsm7 {
	private String name;
	private int price;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차의 색상을 입력해주세요.");
		String color = sc.next();
		System.out.println("자동차의 가격을 입력해주세요.");
		int price = sc.nextInt();
		System.out.println("자동차의 이름을 입력해주세요.");
		String name = sc.next();
		
		Sample1_samsungsm7 ss7 = new Sample1_samsungsm7();
		ss7.setColor(color);
		ss7.setPrice(price);
		ss7.setName(name);
		
		System.out.println("자동차 색상: " + ss7.getColor());
		System.out.println("자동차 가격: " + ss7.getPrice());
		System.out.println("자동차 이름: " + ss7.getName());
	}




}
