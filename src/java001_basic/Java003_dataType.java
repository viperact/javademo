package java001_basic;

/*
 * 리너털(literal) : 그 자체의 값(1, 2, 3,..., 'a','b','c',..., true, false)
 * 변수 (variable) : 하나의 값을 저장하기 위한 메모리 공간
 * 자바에서 제공하는 데이터 타입(데이터가 갖는 함수)
 * 
 * 1.primitive DataType (기본 데이터 타입)
 * 	문자 - char(2byte) '' / 문자열 : ""
 * 	숫자 - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
 * 		- 실수 : float(4byte), double(8byte)
 * 	논리 - boolean(1byte)
 * 	
 * 
 * 2.Reference DataType(참조 데이터 타입)
 * 		Array, Class, Interface
 * 
 * 시스템에서 인식하는 데이터 타입의 크기
 * byte < char, short < int < long < float < double
 *   1     2      2      4      8      4       8    (정해놓은것)
 */
public class Java003_dataType {
	public static void main(String[] args) {

		// 1. 변수 선언
		int data; // 데이터타입 변수명; / data라는 변수는 4byte이고 정수여야한다.

		// 2. 값을 할당
		data = 3; // data변수에 3 값을 할당(저장)

		// int data = 3;

		System.out.println(data); // 3

		// data변수에 새로운 값 할당
		data = 10;
		System.out.println(data); // 10

		// 변수의 타입과 저장하려는 값의 타입이 일치해야한다.
		double avg = 4;
		// Type mismatch: cannot convert from double to int
		// int num = 4.0; //4.0이라는 값은 int의 데이터값과 맞지않다 / 4.0 = double값

		// long ko = 4.0F; //4.0F = float값, long은 float보다 작기때문에 오류

		int x = 0101;
		System.out.println(x); // 65 / 앞자리 수가 0이라면 8진수 표시

		int y = 65;
		System.out.println(y); // 65 / 10진수

		int z = 0B101;
		System.out.println(z); // 5 / 2진수 (0B) B는 대문자 소문자 상관없음 (0B101 == 0b101)

		int k = 0X101;
		System.out.println(k); // 257 / 16진수 (0X) (0X101 == 0x101)

		// 값 출력시 출력값들은 10진수로 바껴서 출력됨

	}
}
