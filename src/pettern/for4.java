package pettern;

public class for4 {
	public static void main(String args[]) {
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
				for (int k = 1; k <= i; k++) {
					System.out.print(i);
				}
				
				System.out.println();
			}
		}

	}
/* if i replace by "+"
 *   +
    ++
   +++
  ++++
 +++++

 * */
/* if i replace by j
 *   1
    12
   123
  1234
 12345

 * */

