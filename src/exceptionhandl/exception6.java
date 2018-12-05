package exceptionhandl;

public class exception6 {
	public static void main(String args[]) {
		int b = 3500;
		int wb = 7000;
		try {
			if (b < wb) {
				throw new ArithmeticException("your balance is less");
			}
			int reminbalance = b - wb;
			System.out.println("remin balance:- " + reminbalance);
		} catch (ArithmeticException a) {
			System.out.println("information :-"+a.getMessage());
		}
		System.out.println("thank you for servies");

	}

}
