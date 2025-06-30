package oops_concept;

public class EncapsulationClass1 {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 4 || name.length() >10) {
			throw new  RuntimeException(" The  name should be Accept 4 to 10 Char");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <18 || age >60) {
			throw new RuntimeException("The Age Should be Accept 18 to 60");
		}
		
	}
	
	
	
	
	

}
