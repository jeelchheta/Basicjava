package pettern;

public class for8 {
	public static void main(String args[]) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int a = 0; a <= i; a++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
/*if i replace by "+"
 * ++++++
  	+++++
   	 ++++
      +++
       ++
        +

 * */
 
/*if i replace by a
 * 012345
    01234
     0123
      012
       01
        0
* */
 