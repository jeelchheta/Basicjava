package Inheritances;

public class semple2 extends subB {

	public static void main(String args[]) {
		semple2 obj = new semple2();
		obj.sum();
	}
}

class superA {
	int a = 8;}

class subB extends superA {
	int c = 15, d = 2, e = 7;

	 void sum() {
		System.out.println("sum is = " + (a + c + d + e));
	}

}
