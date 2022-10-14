package java009_inheritance.part01.prob;

public class ClassTest_2 extends ClassTest_1 {
	private String part;

	public ClassTest_2() {

	}

//	ClassTest_2(String p) {
//		part = p;
//	}

	public ClassTest_2(String n, int s, String p) {
		super(n, s);
		this.part = p;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Override
	public String toString() {

		return String.format("%s %d %s", getName(), getSalary(), getPart());
		
		
	}
	
	public void prn() {
		System.out.println("서브클래스");
	}

}
