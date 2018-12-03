package Inheritances;

public class usinginterface1 {
	public static void main(String args[]) {
		fourth o=new fourth();
		o.sum();
		o.sub();
	}

}

interface first {
	int a = 10;
}

class secound {
	int b = 15;

}

class third extends secound implements first {
	void sum() {
		System.out.println("sum = " + (a + b));
	}
}

class fourth extends third {
	void sub() {
		System.out.println("sub = " + (a - b));
	}

}
