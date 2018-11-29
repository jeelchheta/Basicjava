package pettern;

public class for7 {
	public static void main(String args[]) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; i <= j; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" "+i);

			}
		//	for (int k = 1; k <= i; k++) {     // L3 out of comment
			//	System.out.print(i);
			//}
			System.out.println();

		}

	}

}
/*if i replace k 
 *	   0
      0 1
     0 1 2
    0 1 2 3
   0 1 2 3 4
  0 1 2 3 4 5
 * 
 * */

/*if i replace " +" 
 *	   + 
      + + 
     + + + 
    + + + + 
   + + + + + 
  + + + + + + 
 * 
 * */

/*if L3 out of comment
 *	  0
     111
    22222
   3333333
  444444444
 55555555555
 * 
 * */

/*if L3 out of comment and i replace by "+"
 *	  +
     +++
    +++++
   +++++++
  +++++++++
 +++++++++++
 * 
 * */

