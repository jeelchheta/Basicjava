package pettern;

public class for9 {
	public static void main(String args[]) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int a = 0; a <= i; a++) {  //L2
				System.out.print("+ ");
			}
		//	for (int a = 1; a <= i; a++) {  //L3 out of comment
		//	System.out.print(i);
		//	}
			System.out.println();
		}
	}

}

/* if "+ " replace by " "+i
 * 5 5 5 5 5 5
   	4 4 4 4 4
     3 3 3 3
      2 2 2
       1 1
        0
 * */
/* if "+ " replace by " "+a
 * 0 1 2 3 4 5
    0 1 2 3 4
     0 1 2 3
      0 1 2
       0 1
        0
 * */
/* if L3 out of comment and "+ " replace by a
 *  01234555555
  	 012344444
   	  0123333
       01222
        011
         0

 * */
/* if L3 out of comment and L2,L3 in put "+"
 *  +++++++++++
     +++++++++
      +++++++
       +++++
        +++
         +
 * */
 