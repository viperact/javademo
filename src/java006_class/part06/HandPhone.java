package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개 이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 *    [기본생성자]
 *    - 클래스의 접근제어자와 같고 파라미터가 없는 구조이다.
 *    public HandPhone() {}
 *    - 클래스에 정의된 생성자가 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
 */

public class HandPhone {

	// 멤버변수
	String name;
	String number;

	// 기본 생성자 = 따로 작성하지않아도 기본적으로 JVM에서 생성해주는 기본 생성자
	// public HandPhone() { } //클래스의 접근 제어자 (public) / 생성자는 클래스명(HandPhone)과 같아야한다

	HandPhone() {
	}

	HandPhone(String name) {
		this.name = name;
	}

//	HandPhone(String number){
//		this.number=number; //data type이 같아서 오류 
//	}

	// 따로 지정한 생성자
	HandPhone(String name, String number) {
		this.name = name; // this : heap area에 생성된 객체

		this.number = number;
	}

	// 메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}

}
