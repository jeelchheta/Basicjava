package basic;

public class ifelseifuse {
	public static void main(String args[]) {
		int a = 2, b = 9, c = 6;
		if (a > b) {
			if (a > c) {
				System.out.println("max=" + a);
			} else {
				System.out.println("max=" + c);
			}
		} else {
			if (b > c) {System.out.println("max="+b);
			}
			else
			{System.out.println("max="+c);}
		}
	}
}
