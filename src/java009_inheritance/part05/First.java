package java009_inheritance.part05;

/*
 * 오버라이딩(overriding) - 자식클래스에서 사용
 * 1. 조상클래스의 메소드를 자식(손)클래스에서 재정의(메소드 구현부만)하는 기능이다.
 * 2. 오버라이딩 성립
 * 	  1) 부모클래스의 메소드와 자식클래스의 메소드 이름이 동일해야 한다.
 * 	  2) 매개변수의 타입, 개수, 순서가 일치해야한다. (선언부)
 * 	  3) 리턴타입이 동일해야 한다. (선언부)
 * 	  4) 접근제어자(제한자)는 부모클래스의 메소드와 같거나 더 넓은 범위어야 한다.
 * 			private < default < protected < public
 * 		 부모의 접근제어자가 protected 라면 자식클래스는 protected, public이어야 한다
 * 
 * super
 * 1. 자식클래스에서 조상클래스를 호출할때 사용한다.
 * 2. 	super.멤버변수
 * 	 	super.메소드()
 * 		super( ) => 생성자
 * 		
 * 단일클래스		 VS		상속관계의 자식클래스
 * overloading   VS		 overriding
 * this			 VS		 super
 */
public class First {
	int a = 10;

	
	void display() {
		System.out.println("a=" + a);
	}
}











