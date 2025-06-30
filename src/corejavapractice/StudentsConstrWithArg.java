package corejavapractice;

public class StudentsConstrWithArg {

	int a;
	int b;

	public StudentsConstrWithArg(int m1, int m2) {

		a = m1;
		b = m2;
	}

	void total() {
		System.out.println(a + b);
	}

	void percentage() {
		System.out.println((a + b) / 2);
	}

	public static void main(String[] args) {

		StudentsConstrWithArg s = new StudentsConstrWithArg(85, 85);
		s.total();
		s.percentage();

	}

}
