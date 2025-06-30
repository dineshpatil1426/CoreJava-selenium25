package oops_concept;

class Encapsulation {

	private int branches;

	private String company;

	public int GetBranches() {

		return branches;

	}

	public void SetBranches() {

		System.out.println(branches);

	}

	public String GetCompany() {

		return company;

	}

	public void SetName(String name) {

		company = name;

		System.out.println(company);

	}

}

public class PracticeProgram {

	public static void main(String[] args) {

		Encapsulation e= new Encapsulation();
		e.GetBranches();
		e.SetBranches();

	}

}
