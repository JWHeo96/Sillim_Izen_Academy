package PocketMoney;

public class Overr_Calc extends Who implements Int_Calc {
	int result;

	public Overr_Calc(int dad, int mom) {
		super(dad, mom);
	}

	@Override
	public void add() {
		result = super.dad + super.mom; 
	}
	
	public void output() {
		add();
		System.out.println("-----------------");
		System.out.println("아빠 용돈: " + super.dad + "원");
		System.out.println("엄마 용돈: " + super.mom + "원");
		System.out.println("용돈의 합계: " + result + "원");
		System.out.println("-----------------");
	}
}
