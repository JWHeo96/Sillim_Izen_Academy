package Company;

import java.text.DecimalFormat;

public class Main_salaryCalculator extends Constructor_employee {

	public static void main(String[] args) {
		
		DecimalFormat decFormat = new DecimalFormat("###,###");
		
		Overr_inputInfo td = new Overr_inputInfo();
		td.inputInfo();
		
		Overr_Calculator calc = new Overr_Calculator();
		int sum = calc.add(salary, commition);
		Integer.toString(sum);
		

		String result = decFormat.format(sum);
		
		
		System.out.println(name + "님의 부서는 " + dept + 
				"이고,\n연봉과 수당을 합친 총 금액은 " + result + "원 입니다.");
	}
}
