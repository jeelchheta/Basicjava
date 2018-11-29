package objectandmethod;

public class constructerpass {
	int a, b, c;

	constructerpass() {
		a = 5;
		b = 4;
		c = 3;
	}

	void dis() {

		System.out.println("a=" + a + "b=" + b + "c=" + c);
	}

	public static void main(String args[]) {
		constructerpass obj = new constructerpass();
		obj.dis();

	}

}
