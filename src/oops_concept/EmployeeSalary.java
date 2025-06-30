package oops_concept;

class Employee {

	private String name;
	private String role;

	public Employee(String ename, String erole) {
		this.name = ename;
		this.role = erole;
	}

	public String getname() {

		return name;
	}

	public String getrole() {
		return role;
	}

	public double calculateSalary() {

		return 0.0;
	}
}

class Manager extends Employee {

	private double baseSalary;
	private double bonus;

	public Manager(String ename, double baseSalary, double bonus) {

		super(ename, "Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;

	}

	public double calculateSalary() {

		return baseSalary + bonus;
	}

}

class Programmer extends Employee {

	private double baseSalary;
	private double overtimePay;

	public Programmer(String ename, double baseSalary, double overtimePay) {
		
		super(ename, "programer");
		this.baseSalary = baseSalary;
		this.overtimePay=overtimePay;
	}
	
	public double calculateSalary() {
		
		return baseSalary +overtimePay;
	}
}

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee emp1 = new Manager("Chirag", 80000, 5000);
		Employee emp2= new Programmer("Dinesh", 50000, 500);
		
		System.out.println("Manager: " + emp1.getname() + "\nRole: " + emp1.getrole() + "\nSalary: $" + emp1.calculateSalary());
		
		System.out.println("\nProgrammer: " + emp2.getname() + "\nRole: " + emp2.getrole() + "\nSalary: $" + emp2.calculateSalary());

	}

}
