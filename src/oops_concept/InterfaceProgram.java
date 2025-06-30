package oops_concept;

interface PrintTable {

	public void print();
}

public class InterfaceProgram implements PrintTable {

	@Override
	public void print() {

		System.out.println("Printing");

	}

	public static void main(String[] args) {
		
		PrintTable obj= new InterfaceProgram();
		obj.print();
	}

}
