package Inheritances;

public class usinginterface {
	public static void main(String args[]) {
		Ba x= new Ba();
		x.print();
		x.mess();
	}

}

interface interA {
	int a = 4;

	public void print();
}

class Ba implements interA {
	public void print() {
		System.out.println("a= " + a);
	}
	public void mess()
	{System.out.println("class Ba");}

}