package java009_inheritance.part02;

public class MyChild extends MyFather{
	public MyChild() { // 2 호출이 되서 3 실행 
		super(); // 3
		System.out.println("MyChild"); // 11
	} // 12
}
