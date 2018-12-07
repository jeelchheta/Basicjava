package threadss;

public class thread1 {
	public static void main(String args[]) {
		Thread f = new Thread(new A());
		Thread d = new Thread(new B());
		f.start();
		d.start();

	}

}

class A implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("thread A " + i);
			}
		}
	}

}

class B implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println("thread B " + i);
			}
		}
	}
}