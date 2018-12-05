package exceptionhandl;

public class exception5 {
	public static void main(String args[]) {
		try {
			int a = args.length;
			int b = 23 / a;
			System.out.println("a =  " + a);
			try {
				int c[] = { 4 };
				c[4]=1;
			} catch (ArrayIndexOutOfBoundsException d) {
				System.out.println("Array out of index");
			}

		} catch (Exception e) {
			System.out.println("ATME exception");
		}
		System.out.println("end of progrm");

	}
}
