package basic;

public class copyobject {
	private int a, b;

	copyobject(int x, int y) {
		a = x;
		b = y;
	}

	int input1(copyobject c) {
		int z = (c.a) * (c.b);

		return (z);
	}

	public static void main(String args[]) {
		copyobject o1 = new copyobject(5, 9);
		copyobject o2 = new copyobject(2, 9);

		System.out.println("area are = " + o1.input1(o2));

	}

}
