package OOP_Inheritance;

class Calculator implements Interface_Calculator {
	
	int result = 0;
	
	@Override
	public int sum(int x, int y) {
		result = x + y;
		return result;
	}

	@Override
	public int dif(int x, int y) {
		result = x - y;
		return result;
	}

	@Override
	public int multi(int x, int y) {
		result = x * y;
		return result;
	}

	@Override
	public int div(int x, int y) {
		result = x / y;
		return result;
	}

	@Override
	public int remain(int x, int y) {
		result = x % y;
		return result;
	}
	
}

