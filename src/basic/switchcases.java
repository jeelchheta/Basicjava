package basic;

public class switchcases {

	public static void main(String args[]) {
		for (int i = 0; i < 7; i++) {
			switch (i) {
			case 0:
				System.out.println("sunday");
				break;
			case 1:
				System.out.println("monday");
				break;

			case 2:
				System.out.println("tuseday");
				break;

			case 3:
				System.out.println("wednesday");
				break;

			case 4:
				System.out.println("thursday");
				break;

			case 5:
				System.out.println("firday");
				break;
			case 6:
				System.out.println("saturnday");
				break;
			default:
				System.out.println("no day was declared");

			}
		}
	}
}
