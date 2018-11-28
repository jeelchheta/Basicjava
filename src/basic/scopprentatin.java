package basic;

public class scopprentatin {
	public static void main(String args[]) {
		int x = 10;
		if (x == 10) {
			int y = x * 10;
			System.out.println("x=" + x);
			System.out.println("y=" + y);
		}
		int y=5;// y not known for system here if remove int keyword
		System.out.println("y="+y);
	}
}
