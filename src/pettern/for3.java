package pettern;

public class for3 {
	public static void main(String args[]) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
/* if i replace by j
 * 	0
	01
	012
	0123
	01234
	012345
 * */
/*if i replace by "+"
 * 	+
	++
	+++
	++++
	+++++
	++++++
 */
 