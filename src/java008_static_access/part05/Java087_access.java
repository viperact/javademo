package java008_static_access.part05;
//modifier 변수 클래스 메소드 앞에 붙어있는것

//(public, private, protected,)
//Access Modifier 접근제어자
//외부에서 접근할 수 있는 권한을 제어해주는 명령어

/*
 * package 패키지명;		 	package java.lang;
 * import 패키지명.클래스		import java.util.Random;
 * import 패키지명.인터페이스	import java.lang.Seriable;
 * 
 * class 클래스{
 * 	멤버변수;
 * 	생성자;
 * 	메소드;
 * }
 * 
 * package :
 * 1. 비슷한 작업을 수행하는 클래스 및 인터페이스를 묶어서 사용한다.
 * 2. opne API에서 제공하는 클래스 : 클래스 및 인터페이스 중복을 피하기 위해서 사용한다.
 * 	  
 * 	  domain : www.gov.kr
 * 	  package : kr.gov (인터페이스 충돌을 막기위해)
 * 
 * import : 외부 클래스 및 인터페이스 위치를 JVM에 알려주기 위해서 사용한다.
 * 
 * 제어자(modifier)
 * 1. 클래스, 변수, 메소드, 생성자의 선언부에 사용되어 부가적인 의미를 부여한다.
 * 2. 제어자는 크게 접근제어자(Access Modifier)와 그 외의 제어자로 구분한다.
 * 3. 하나의 대상에 여러개의 제어자를 조합해서 사용할 수 있으나, 접근제어자 단 하나만 사용할 수 있다.
 * 	  접근제어자 - public, protected, default(=package), private (이중 하나만 사용가능)
 * 	  그외제어자 - static, final, abstract, synchronized...
 * 	  ex) public static final int data;
 * 접근제어자(Access Modifier)
 * 	: 멤버 또는 클래스에 사용되어, 외부로 부터의 접근을 제한한다.
 * 
 * 1. private : 정의된 클래스에서만 접근이 가능하다.
 * 2. default : 같은 패키지에서만 접근이 가능하다.
 * 3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
 * 4. public : 접근 제한이 없다.
 * 
 * 접근제어자 사용
 * class : default, public
 * variable, method, constructor : private, default, protected, public
 * 
 * 접근제어자 범위
 * private < default < protected < public
 */
public class Java087_access {
	private int var_private = 1;
	int var_default = 2;
	protected int var_protected = 3;
	public int var_public = 4;

	public Java087_access() {

	}
}