package java013_api;

//Ctrl + Shift + O
import java.util.StringTokenizer;

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자")
		// 문자열의 구분자 자리가 공백일때는 2번째 인자값은 생략가능
		// StringTokenizer st = new String("java,jsp", ",")

		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken()); //가지고올 토큰이 없다. - 에러발생
		
//		int count = st.countTokens();
//		for (int i = 0; i < count; i++) {
//			System.out.println(st.nextToken());
//		}
		
		//메소드명에서 has나 is로 시작하면 리턴타입이 논리값이다.
		//메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while(st.hasMoreTokens()) {
			//더 가져올 토큰이 있는지 묻는 식
			System.out.println(st.nextToken());
		}

	}

}
