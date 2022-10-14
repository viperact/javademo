package java009_inheritance.part05;
//java.lang에서 가져오는 것들은 default로 제공됨
//import java.lang.Override;
//import java.lang.System;
//import java.lang.String;

public class Second extends First {
	int b = 20;

	@Override
	//선언부는 똑같이, 접근제어자는 같거나 크게 default = protected, public
	void display() {
		System.out.println("b=" + b);
		// overriding 되어있어서 First가 아닌 Second가 먼저 출력
		
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	//자손 class에서 부모class를 호출하는 법
	}
}
