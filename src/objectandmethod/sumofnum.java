package objectandmethod;

class Abc {
	private int a, b, c;

	void input(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	void display() {
		System.out.println("sum of values=" + (a + b + c));
		
	}
	double dis()
	{return(a * b * c);}
}

public class sumofnum {
	public static void main(String args[]) {
		Abc a = new Abc();
		a.input(4, 7, 5);
		a.display();
		System.out.println("volume of cube="+a.dis());
	}

}
