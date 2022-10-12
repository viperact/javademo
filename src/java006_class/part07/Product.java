package java006_class.part07;

/*
 * this : 현재 메모리에 생선된 객체 자신을 의미한다.
 * 1. this.멤버변수
 * 2. this.메소드
 * 3. this( ) : 생성자
 */
public class Product {
	String code;
	String pname;
	int cnt;

	public Product() {
		this("p002", "식품", 3000);

	}

	public Product(String code, String pname, int cnt) {

		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	
	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
	
	void prn() {
		this.display(); //this를 안써도 내부에서 this를 붙여서 처리함
	}
	
	
	
	
	

}
