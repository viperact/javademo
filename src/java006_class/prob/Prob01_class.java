package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius;
	String name;

	public double getArea() {
		return radius * radius * 3.14;
		// 피자와 도넛의 면적을 구하는 식 // getArea() - 넓이를 구하는 메소드
	}
}

public class Prob01_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////
		Circle ca = new Circle(); // class Circle의 요소들이 가리킬 새로운 Circle 주소 할당
		ca.radius = 10;
		ca.name = "자바피자";

		Circle cb = new Circle();
		cb.radius = 2;
		cb.name = "자바도넛";

		System.out.println(ca.name + "의 면적은 " + ca.getArea());
		System.out.println(cb.name + "의 면적은 " + cb.getArea());
	}// end main()

}// end class
