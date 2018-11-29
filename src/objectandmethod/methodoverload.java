package objectandmethod;

public class methodoverload {
	private int a, b, c;

	int input() {
		this.a = 3;
		this.b = 6;
		this.c = 5;
		return (a + b + c);

	}

	int input(int a, int b) {
		return (a + b);
	}

	int input(int a, int b, int c) {
		return (a * b * c);
	}

	public static void main(String args[]) {
		methodoverload obj = new methodoverload();
		System.out.println("sum=" + obj.input());
		System.out.println("sum=" + obj.input(2,6));
		System.out.println("sum=" + obj.input(8,4,3));
	}
}
