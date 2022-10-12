package java006_class.part01;

public class Java065_class {

	public static void main(String[] args) { // 스레드1
		Person ps; // 객체참조변수 선언 (4byte 비어있는 메모리 생성)
		ps = new Person();
		// 메모리 확보
		// 객체 생성 - 초기값설정 현재는 값설정이없어 기본값(데이터타입에 따라서)
		// = : 메모리 주소를 할당 (heap area에 있는 객체주소를 가리킨다)

		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run(100); //Person에 있는 miter값을 입력하면 miter값을 저장할 메모리를 새로 만들고 출력한다.

		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);

		Person pn = new Person();
		pn.name = "김영희";
		pn.age = 28;
		pn.gender = '여';
		pn.develop();
		pn.run(200); //Person에 있는 miter값을 입력하면 miter값을 저장할 메모리를 새로 만들고 출력한다.
					 //메소드가 끝나면(main이 끝나면) 사라짐
		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender);
		
		ps.run(500);

	}// end main()
	
	

}// end class
