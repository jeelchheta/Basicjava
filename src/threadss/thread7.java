package threadss;


public class thread7 {
	public static void main(String args[]) /*throws InterruptedException*/ {
		AC target = new AC();
		HI o1 = new HI(target, "hi");
		HI o2 = new HI(target, "hello");
		/*
		 * HI o3 = new HI(target, "my"); HI o4 = new HI(target, "name"); HI o5 =
		 * new HI(target, "is");
		 */
		/*try {
			o1.t.join();
			o2.t.join();
			o3.t.join();
			o4.t.join();
			o5.t.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		
	}
}

class AC {
	synchronized void method(String s) {
		System.out.print("[" + s);
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		System.out.println("]");
	}
}
	class HI implements Runnable {
		String s1;
		AC target;
		Thread t;

		public HI(AC str, String s) {
			s1 = s;
			target = str;
			t = new Thread(this);
			t.start();
		}

		public void run() {
			target.method(s1);
		}
	}
