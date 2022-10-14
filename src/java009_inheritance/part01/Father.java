package java009_inheritance.part01;

public class Father /*extends Object*/ {
	int a = 3;
	//private c = 10; // private 는 상속이되지않음
	public Father() {
		System.out.println("Father");
	}
	
	void display() {
		System.out.println("a="+ a);
	}
}
