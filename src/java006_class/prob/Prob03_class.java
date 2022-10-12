package java006_class.prob;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */

class Box {
	private int width, height; // 박스의 너비와 높이
	private char fillChar; // 박스를 그리는 데 사용하는 문자

	public Box() { // 매개 변수 없는 생성자
		this(10, 1); // this() 이용

	}

	public Box(int width, int height) { // 너비외 높이의 2 매개 변수를 가진 생성자
		this.width = width;
		this.height = height;
	}

	public void draw() { // 박스 그리는 메소드
		///////////// 여기에서 구현하세요.
//		for (int j = 1; j <= height; j++) {
//			// 높이를 지정
//			for (int i = 1; i <= width; i++) {
//				// 너비를 지정
//				System.out.print(fillChar);
//				// 박스를 그리는데 사용하는 문자로 너비와 높이를 채움
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(fillChar);
			}
			System.out.println();
			// height이 첫 조건문에 쓰는 이유
		}

	}// end draw()

	public void fill(char c) {
		// 박스를 그리는데 사용하는 문자 설정
		this.fillChar = c;
		// fillChar = c; 의 이유

	}// end fill( )
}// end class

public class Prob03_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.
		Box a = new Box();
		Box b = new Box(20, 3);
		a.fill('&');
		b.fill('%');
		a.draw();
		b.draw();
	}// end main()

}// end class
