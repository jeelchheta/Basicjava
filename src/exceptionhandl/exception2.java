package exceptionhandl;

import java.util.*;

public class exception2 {
	public static void main(String args[]) {
		int i, a = 0, b = 0, c = 0;
		Random j = new Random();
		try {
			for (i = 0; i < 21; i++) {
				b = j.nextInt();
				c = j.nextInt();
				a = 12 / (b / c);
			}
		} catch (ArithmeticException s) {
			System.out.println("div by zero");
		}

		System.out.println("a = " + a);
	}

}
