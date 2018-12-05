package exceptionhandl;

public class exception8 {
	static void damo() throws IllegalAccessException {
		System.out.println("hello java...!!!!!");
		throw new IllegalAccessException("not accessable");
	}

	public static void main(String args[]) {
		try {
			damo();
		} catch (IllegalAccessException ex) {
			System.out.println("jarvis "+ex);
		}

	}
}
