package threadss;

public class thread2 {
	public static void main(String args[]) {
		A1 o1=new A1();
		B1 o=new B1();
		o1.start();
		o.start();
	
	}

}

class A1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(+i + " thread A ");
		}
	}
}

class B1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(+i + " thread B ");
		}
	}
}