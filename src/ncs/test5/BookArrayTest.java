package ncs.test5;

/*
 * 실행 결과
 * 자바의 정석, 남궁성, 도우출판, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 * 열혈강의 자바, 구정은, 29000원, 10% 할인
 * 할인된 가격 : 26100원
 * 객체지향 JAVA8, 금영욱, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 */

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", "도우출판", 30000, 10.0);
		bArray[1] = new Book("열혈강의 자바", "구정은", " ", 30000, 10.0);
		bArray[2] = new Book("자바의 정석", "남궁성", " ", 30000, 10.0);

		for (int i = 0; i < bArray.length; i++) {

		}
	}

}
