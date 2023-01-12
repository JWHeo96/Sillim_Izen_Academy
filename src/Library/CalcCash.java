package Library;

public class CalcCash extends customer implements cashier {
	static int result = 0;
	
	public CalcCash(int person, int money){
		super(person, money);
	}

	@Override
	public void disacountMoney() {
		if(person == 1) {
			result =super.money - (super.salesBook - super.saleParent); 
		} else if(person == 2) {
			result = super.money - (super.salesBook - super.saleStudent);
		}
	}

	@Override
	public void printMoney() {
		disacountMoney();
		if(person == 1 ) {
			System.out.println("------------------------");
			System.out.println("받은 금액: " + super.money + "원\n-");
			System.out.println("책의 가격: " + super.salesBook + "원\n+");
			System.out.println("할인 금액: " + super.saleParent + "원\n=");
			System.out.println("최종 금액: " + result + "원");
		} else if(person == 2) {
			System.out.println("------------------------");
			System.out.println("받은 금액: " + super.money + "원\n-");
			System.out.println("책의 가격: " + super.salesBook + "원\n+");
			System.out.println("할인 금액: " + super.saleStudent + "원\n=");
			System.out.println("최종 금액: " + result + "원");
			System.out.println();
		}
	}

}
