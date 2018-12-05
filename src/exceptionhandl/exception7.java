package exceptionhandl;

public class exception7 {
	public static void main(String args[]) {
		int totaldstnc = 300, td = 170;
		try {
			if (td > totaldstnc) {
				throw new ArithmeticException("invalid entry of distance");
			}
			int remindstnc = totaldstnc - td;
			System.out.println("remin distance = " + remindstnc + " km ");
		} catch (ArithmeticException k) {
			System.out.println(k.getMessage());
		}
		System.out.println("...............");
	}

}
