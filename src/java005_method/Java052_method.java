package java005_method;

/*
 * method(메소드) 정의
 * 1. 값을 계산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method 정의 : 선언부 + 구현부
 * 반환자료형(void) 메소드명(main)(데이터 타입 매개변수) (String[] args) => 메소드 선언부 
 * {
 * 	 메소드가 호출되었을때 실행 구문;		=> 메소드 구현부
 * 	 return 값;
 * } 
 * 
 * 중괄호{}만 있어도 구현이되고있다.
 * 리턴값은 무조건 하나만 있어야한다.
 * void일때 return값은 어떠한 값도 있어서는 안된다.
 * 반환자료와 리턴값은 항상 일치.
 * 
 * 매개변수 = parameter
 * 인수 = argument (호출해서 값을 넘겨주는 값)
 * 
 * 
 * 1. 리턴값이 없고 매개변수도 없는 형태
 * 	  void add( ){
 * 		int x = 10;
 * 		int y = 20;
 * 		if(x<0)
 * 			return;
 * 		System.out.println(x+y);
 * 	  }	
 * 		
 * 	 add( ); //argument
 * 
 * 2. 리턴값은 있고 매개변수는 없는 형태
 * 	 double avg( ){
 * 	 	int x = 10;
 * 		int y = 20;
 * 		return (x+y)/2;			// double avg = (x+y)/2;
 * 	 }
 * 
 * 3. 리턴값이 없고 매개변수는 있는 형태
 * 	 void plus(int x, int y){
 * 		System.out.plntln(x+y);
 * 	 }
 * 	 
 * 	 plus(10, 20); // (int x, int y)
 * 
 * 4. 리턴값이 있고 매개변수도 있는 형태
 * 	 double avg(int x, int y){
 * 		return (x+y)/2.0;
 * 	 }
 * 
 * 	 avg(10, 20); // argument
 * 
 */
public class Java052_method {
	
	/*
	 *  
	 * 프로그램을 실행하면
	 * JVM (자바가상머신 - Java Virtual Machine) 에서
	 * main스레드가 main( )메소드를 호출한다.
	 * 
	 * JVM은 실행하는 운영체제에 특화된 코드로 변환하여 실행한다.
	 * 즉, 자바 프로그램 실행환경을 만들어주는 소프트웨어이다.
	 * 
	 */

	public static void main(String[] args) { //1 main의 구문 호출
		System.out.println("main start"); //2
		makeTest(); // 3 makeTest(){} 호출
		System.out.println("main end"); // 7 빠져나온것에서 와서 호출
		
	}//end main() //8 마무리
	
	public static void makeTest() { //4 
		System.out.println("makeTest");// 5
	} //6  //빠져나옴
	
}//end class
