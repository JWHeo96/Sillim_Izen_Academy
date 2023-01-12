package Company;

public class Overr_Calculator extends Constructor_employee implements Interface_Calculator  {
	int result = 0;
	
	@Override
	public int add(int salary, int commition) {
		result = salary + commition;
		return result;
	}
	

}
