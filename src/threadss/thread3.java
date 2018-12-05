package threadss;

public class thread3 {
	public static void main(String args[]) throws InterruptedException {
		Thread a = Thread.currentThread();
		System.out.println(a);
		a.setName("first 1");
		a.setPriority(1);
		System.out.println("name of thread " + a);
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

			Thread.sleep(112);

		}
	}

}
