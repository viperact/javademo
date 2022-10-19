package java013_api;

/*
 * sn변수에 저장된 문자열중에서 숫자갯수를 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 숫자갯수:3
 */
public class Java146_Wrapper {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;

//		for (int i = 0; i < sn.length(); i++) {
//			char data = sn.charAt(i);
//			if (Character.isDigit(data))
//				cnt++;
//		}
		
		char[] line = sn.toCharArray();
		//문자를 배열로 변환
		for(char data : line) {
			// : 다음엔 배열이나 컬렉션밖에 못옴
			if(Character.isDigit(data))
				//숫자를 물어보는 메소드
				cnt++;
		}

		System.out.println("숫자갯수 : " + cnt);
	}

}
