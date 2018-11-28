package pettern;

public class for6 {
	public static void main(String args[]) {
		for (int i = 0; i <= 5; i++) {		//pattern 1
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}								
			System.out.println();	
		}									//pattern 1
		System.out.println();
		for (int a = 5; a >= 0; a--) {		//pattern 2
			for (int b = 5; b >= a; b--) {
				System.out.print(a);
			}
			System.out.println();			//pattern 2
		}
	}
}
