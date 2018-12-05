package exceptionhandl;

public class exception1 {
	public static void main(String args[]) {
		int a = 0, b = 7, c;
		try {
			c = b / a;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("not div by zero ");
		}
		System.out.println("end programm");
	}

}
