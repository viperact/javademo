package java013_api;

import static java.lang.Math.E;
import static java.lang.Math.min;
import static java.lang.Math.*; // Math의 모든 메소드를 호출 / * : 모든

public class Java134_Math {
	
	public static void main(String[] args) {
		/*
		 * 클래스에서 static키워드가 선언된 멤버변수, 메소드를 호출할때
		 * import static을 선언하면 클래스명 없이 메머변수, 메소드를 호출할 수 있다.
		 */
		
		System.out.println(Math.PI); //final 선언, 대문자
		System.out.println(Math.max(10, 20));
		System.out.println(E);
		System.out.println(min(10,20));
		System.out.println(sqrt(25)); //제곱근
		System.out.println(pow(2,3)); //거듭제곱 (2의 3승)
		
		
		
		 
	}//end main()

}//end class
