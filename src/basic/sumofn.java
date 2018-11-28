package basic;

public class sumofn {
	public static void main(String args[]) {
		double a = 10, sum = 0;
		double A;
		for (int i = 0; i < a; i++) {
			sum = sum + i;
			//System.out.println("sum is="+sum);//sum of each number display
		}
		A=sum/a;
		System.out.println("sum is="+sum);
		System.out.println("avrage is="+A);

	}

}
