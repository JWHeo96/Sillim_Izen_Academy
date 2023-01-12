package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceSuber implements suberInterface {

	@Override
	public void suber(int x, int y) {
		int result = x - y;
		System.out.println("Suber(): " + result);
	}

}
