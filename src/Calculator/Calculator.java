package Calculator;

class Calculator implements Interface_Calculator {
	
	int result = 0;
	
	@Override
	public int add(int x, int y) {
		result = x + y;
		return result;
	}

	@Override
	public int sub(int x, int y) {
		result = x - y;
		return result;
	}

	@Override
	public int mul(int x, int y) {
		result = x * y;
		return result;
	}

	@Override
	public int div(int x, int y) {
		result = x / y;
		return result;
	}

	@Override
	public int rem(int x, int y) {
		result = x % y;
		return result;
	}
	
}

