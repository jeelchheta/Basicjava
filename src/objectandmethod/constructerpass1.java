package objectandmethod;

public class constructerpass1 {
	private int a, b, c;

	constructerpass1() {
		a = 5;
		b = 7;
		c = 4;
	}

	constructerpass1(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void dis() {
		System.out.println("a value is=" + a);
		System.out.println("b value is=" + b);
		System.out.println("c value is=" + c);
	}

	public static void main(String args[]) {
		constructerpass1 a = new constructerpass1(4, 9, 7);

		a.dis();

	}

}
