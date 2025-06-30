package oops_concept;

class Jan {
	public void roi(String monthname) {
		System.out.println(monthname + " " + "month ROI is : " + "8.5%");
	}
}

class Fab extends Jan {
	public void roi(String monthname) {
		System.out.println(monthname + " " + "month ROI is : " + "8.2%");
	}
}

class March extends Fab {
	public void roi(String monthname) {
		System.out.println(monthname + " " + "month ROI is : " + "8.4%");
	}
}

public class MethodOverriding1 extends March {
	public void roi(String monthname) {
		System.out.println(monthname + " " + "month ROI is : " + "8.6%");
	}

	public static void main(String[] args) {
		MethodOverriding1 obj = new MethodOverriding1();
		obj.roi("April");

	}

}
