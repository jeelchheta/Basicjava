package Inheritances;

public class usinginterface2 {
	public static void main(String args[]) {
	fourth4 pr=new fourth4();
	pr.mess();
	pr.mess1();
	}

}

interface first1 {
	int c = 20;
}

class secound2 implements first1 {
	int a = 10, b = 12;

	void mess() {
		System.out.println("class first1 in " + (a + b + c));
	}
}

interface third3 extends first1 {
	int d = 30;

}

class fourth4 extends secound2 implements third3 {
	void mess1() {
		System.out.println("class fouth4 =" + a + " " + b + " " + c + " " + d);
	}
}