package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceAdder implements adderInterface {

	@Override
	public void adder(int x, int y) {
		int result = x + y;
		System.out.println("Add(): " + result);
	}

}
