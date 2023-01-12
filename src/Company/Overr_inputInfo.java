package Company;

import java.util.Scanner;

public class Overr_inputInfo extends Constructor_employee implements Interface_inputInfo{
	Scanner sc = new Scanner(System.in);

	@Override
	public String inputName() {
		System.out.print("이름 입력:");
		String name = sc.next();
		return name;
	}

	@Override
	public String inputDept() {
		System.out.print("부서 입력:");
		String dept = sc.next();
		return dept;
	}

	@Override
	public int inputSalary() {
		System.out.print("연봉 입력:");
		int salary = sc.nextInt();;
		return salary;
	}

	@Override
	public int inputCommition() {
		System.out.print("수당 입력:");
		int commition = sc.nextInt();
		return commition;
	}
	
	public void inputInfo() {
		this.employee(inputName(), inputDept(), inputSalary(), inputCommition());
	}

}
