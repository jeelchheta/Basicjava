package threadss;

public class thread5 {
	public static void main(String args[])/* throws Exception */{
		
		Thread a = /*new*/ Thread.currentThread();
		a.setName("first thread");
		a.setPriority(2);
		System.out.println(a.getName() + " priority " + a.getPriority());
		String s1 = null;
		String x = "jarvis";
		String[] y = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		boolean isalive=a.isAlive();
		System.out.println("is alive "+isalive);
		for (int i = 0; i < y.length; i++) {
			System.out.print(" start " + i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 0)

			{
				s1 = x +" " +y[0];
			} else if (i == 1) {
				s1 = x +" "+ y[1];
			} else if (i == 2) {
				s1 = x +" " +y[2];
			} else if (i ==3) {
				s1 = x +" "+ y[3];
			} else if (i == 4) {
				s1 = x +" " +y[4];
			} else if (i == 5) {
				s1 = x + y[5];
			} else if (i == 6) {
				s1 = x + y[6];
			} else if (i == 7) {
				s1 = x + y[7];
			} else if (i == 8) {
				s1 = x + y[8];
			} else if (i == 9) {
				s1 = x + y[9];
			}
			System.out.print(s1 + "\n");
		}

	}

}
