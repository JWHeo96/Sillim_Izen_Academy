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
			System.out.println("학부모에게 받은 금액: " + super.money + "원, " +
							"책의 가격: " + super.salesBook + "원, " +
							"할인 금액: " + super.saleParent +"원");
			System.out.println("최종 지불액: " + (money-result) + "원, " +
					"거스름돈: " + result + "원");
		} else if(person == 2) {
			System.out.println("------------------------");
			System.out.println("학생에게 받은 금액: " + super.money + "원, " +
						"책의 가격: " + super.salesBook + "원, " +
						"할인 금액: " + super.saleStudent +"원");
			System.out.println("최종 지불액: " + (money-result) + "원, " +
						"거스름돈: " + result + "원");
		}
	}

}