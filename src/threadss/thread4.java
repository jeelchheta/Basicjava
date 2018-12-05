package threadss;

public class thread4 {
	public static void main(String args[]) {

		tdemo a = new tdemo("start run");
		/*a.start();*/
	}
}

class tdemo extends Thread {
	String s;
	Thread h;
	tdemo(String t) {
		s = t;
		h=new Thread(this);
		h.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(s + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
 * public class thread4 { public static void main(String args[]) { Thread p=new
 * Thread(new AC("my name is jarvis")); p.start(); } }
 * 
 * class AC implements Runnable { String x; AC(String x) { this.x = x; }
 * 
 * public void run() { for (int i = 0; i < 8; i++) { System.out.println(x); try
 * { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace();
 * } } } }
 */