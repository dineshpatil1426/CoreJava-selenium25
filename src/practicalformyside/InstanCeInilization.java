package practicalformyside;

// https://www.youtube.com/watch?v=iauIFnXyOzI&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=33&ab_channel=NaveenAutomationLabs

public class InstanCeInilization {

	static {
		System.out.println("static Block-1");
	}
	////When we Call you Making Object of the class 
	{
	 System.out.println("InstanCe InilizationBlock");	
	}
	
	//When we Call you Making Object of the class 
	InstanCeInilization(){
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main block");
		
		//InstanCeInilization obj= new InstanCeInilization();

	}

}
