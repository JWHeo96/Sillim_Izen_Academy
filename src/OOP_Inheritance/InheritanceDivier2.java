package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceDivier2 implements divierInterface2 {

	@Override
	public void divier2(int x, int y) {
		int result = x % y;
		System.out.println("Divier1(): " + result);
	}

}
