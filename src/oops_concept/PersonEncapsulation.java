package oops_concept;

class person{
	
	private String name;
	private int age;
	private String county;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
}


public class PersonEncapsulation {
	
	public static void main(String[] args) {
		
		person obj= new person();
		
		obj.setName("Dinesh");
		obj.setAge(35);
		obj.setCounty("India");
		
		String name =obj.getName();
		int age =obj.getAge();
		String country=obj.getCounty();
		
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
		
		
				
		
	}

	
}
