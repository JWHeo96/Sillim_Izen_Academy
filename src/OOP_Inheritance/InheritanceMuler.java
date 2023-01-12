package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceMuler implements mulerInterface {

	@Override
	public void muler(int x, int y) {
		int result = x * y;
		System.out.println("Muler(): " + result);
	}

}
