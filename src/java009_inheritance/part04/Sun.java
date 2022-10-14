 package java009_inheritance.part04;

public class Sun extends Parent {
	String dept;
	
	public Sun() {
		
	}
	
	public Sun(String name, int age, String dept) {
		super(name, age); //상위클래스호출 (자손에서 부모를 호출할때)
		this.dept = dept;
		//부모요소에 인자값 저장공간이 있을때,
		// super로 넘겨주고
		// this로 현재 메모리의 인자값을 저장한다.
	}
	
	public String toString() {
		return String.format("%s %d %s", name, age, dept);
	}
}
