package Inheritances;

public class simple {
	public static void main(String args[]) {
		subclass o1=new subclass();
		o1.sum();
	}
}

class superclass {
	int x = 18;

}

class subclass extends superclass {
	int y = 6, z = 3;

	void sum() {
		System.out.println("sum of = " + (x + y + z));
	}
}
