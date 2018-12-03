package Inheritances;

public class superuse {
	public static void main(String args[])
	{BB o=new BB();
	o.sum();}

}

class AB {
	int a = 8, b = 4;

	void sum() {
		int c = a + b;
		System.out.println("sum = " + c);
	}
}

class BB extends AB {
	int a = 5;

	void sum() {
		super.sum();
		int c = (a * super.a) - b;
		System.out.println("sub = " + c);
	}
}