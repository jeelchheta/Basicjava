package exceptionhandl;

public class exception4 {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 25 / a;
			int c[] = { 1 };
			c[0] = 21;
		} catch (ArithmeticException e) {
			System.out.println("ARTM exception occures");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("out of index");
		}
		System.out.println("end of program");
	}
}
