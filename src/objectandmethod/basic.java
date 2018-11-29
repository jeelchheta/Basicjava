package objectandmethod;

class Semple {
	private int a, b, c;

	void input(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	void display() {
		System.out.println("value of a=" + a);
		System.out.println("value of b=" + b);
		System.out.println("value of c=" + c);
	}
}

public class basic {

	public static void main(String args[]) {
		Semple o1 = new Semple();
		o1.input(2, 5, 4);
		o1.display();

	}

}
