package keywords;

public class staticusing {
	static void showdata(int x, int y) {
		int a = x, b = y, t;
		System.out.println("before swiping:-");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		t = a;
		a = b;
		b = t;
		System.out.println("after swipng:-");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

	public static void main(String args[]) {
		showdata(3, 7);

	}

}
