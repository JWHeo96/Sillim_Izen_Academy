package Calculator;

class Calculator implements Interface_Calculator {
	
	static int result = 0;	
	
	@Override
	public void add(int x, int y) {
		this.result = x + y;
	}

	@Override
	public void sub(int x, int y) {
		this.result = x - y;
	}

	@Override
	public void mul(int x, int y) {
		this.result = x * y;
	}

	@Override
	public void div(int x, int y) {
		this.result = x / y;
	}

	@Override
	public void rem(int x, int y) {
		this.result = x % y;
	}
	
}

