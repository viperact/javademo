package java001_basic.prob;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
		// 여기에 구현하세요.
		int a = 123; // 사과의 수
		int b = 10; // 하나의 바구니에 담는 사과의 수
		int res = a % b == 0 ? a / b : a / b + 1; // 사과의 수와 바구니에 담는 사과의 수를 나눈 나머지가 0이라면
													// a/b가 참이라면 a/b 출력(12) , 거짓이라면 a/b + 1(13)출력
		System.out.printf("필요한 바구니의 수 : %d\n", res);

	}// end main()

}// end class
