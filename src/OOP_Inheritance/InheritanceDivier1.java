package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceDivier1 implements divierInterface1 {

	@Override
	public void divier1(int x, int y) {
		int result = x / y;
		System.out.println("Divier1(): " + result);
	}



}
