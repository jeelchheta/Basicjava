package objectandmethod;

public class factorial {
	

	int fact(int n) {
		 int  b;
		if(n==1)
		{return(1);}
		
		b = fact(n - 1) * n;
		return(b);
	}

	public static void main(String args[]) {
		factorial o1=new factorial();
	System.out.println("factorial of 1 no="+o1.fact(1));
	System.out.println("factorial of 2 no="+o1.fact(2));
	System.out.println("factorial of 3 no="+o1.fact(3));
	System.out.println("factorial of 4 no="+o1.fact(4));

	}

}
