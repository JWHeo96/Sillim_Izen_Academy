package Company;

public class Calculator extends employee implements Interface_Calculator  {
	int result = 0;
	
	@Override
	public int add(int salary, int commition) {
		result = salary + commition;
		return result;
	}
	

}
