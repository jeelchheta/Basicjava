package Inheritances;

class A {
	int a = 7, b = 4;

	void put() {
		System.out.println("a+b = " + (a + b));
	}

}

class B extends A {
	void put1() {
		System.out.println("a*b = " + (a * b));
	}
}

public class semple1 extends A {
	public void put3() {
		System.out.println("a-b = " + (a - b));
	}

	public static void main(String args[]) {

		B obj = new B();
		semple1 obj1 = new semple1();
		obj1.put();
		obj.put1();
		obj1.put3();

	}

}