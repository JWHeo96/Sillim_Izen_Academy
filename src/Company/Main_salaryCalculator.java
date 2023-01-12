package Company;

public class Main_salaryCalculator extends employee {

	public static void main(String[] args) {
		
		TransferData td = new TransferData();
		td.inputInfo();
		
		Calculator calc = new Calculator();
		int result = calc.add(salary, commition);
		
		System.out.println(name + "님의 부서는 " + dept + 
				"이고, 연봉과 수당을 합친 총 금액은 " + result + "원 입니다.");
	}
}
