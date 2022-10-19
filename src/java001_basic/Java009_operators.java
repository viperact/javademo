package java001_basic;

public class Java009_operators {
	public static void main(String[] args) {
		int x = 3;

		// 전위 연산자
		++x; // x = x + 1, x+=1
		System.out.println(x); // 4

		--x;
		System.out.println(x); // 3

		int y = 5;

		// 후위 연산자
		y++; // 증가 연산자

		System.out.println(y); // 6

		y--; // 감소 연산자
		System.out.println(y); // 5

		// 리터널은 증감연산자를 사용할 수 없다.
		// ex) 10++; (불가)

		// 상수 : 한번만 기억할 수 있는 메모리 공간 javascript에서의 const
		final int NUM = 4; // final 을 붙이면 상수로 지정, JAVA의 함수는 대문자로 표시
		// 상수는 증감연사자를 사용할 수 없다
		// NUM++;

	}

}
