package basic;

public class expresionsofoprator {
	public static void main(String args[]) {
		int a, b, c, d;
		a = 10;
		b = 20;
		c = ++a; // s1 ++a (++a post increment)
		d = b++; // s2 b++ (b++ per increment)
		System.out.println("a=" + a);// here a one time increment see s1
		System.out.println("b=" + b);// here b one time increment see s2
		System.out.println("c=" + c);// here c store value as a because ++a
										// expression
		System.out.println("d=" + d);// here d store value of b as because b++
										// expression
	}

}
