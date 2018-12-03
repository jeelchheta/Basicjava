package basic;

public class calculator {
	public static void main(String args[]) {
		double a = 5, b = 6;
		for (int i = 0; i < 4; i++) {

			switch (i) {
			case 0:
				System.out.println("sum is= "+(a + b));
				break;
			case 1:
				System.out.println("sub is= "+(a - b));
				break;
			case 2:
				System.out.println("mul is= "+(a * b));
				break;
			case 3:
				System.out.println("div is= "+(a / b));
				break;
				default:
					System.out.println("this case is not applicable....!!!!!!!!!");
				
			}

		}

	}
}
