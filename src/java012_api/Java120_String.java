package java012_api;

/*
 * [출력결과]
 * << 첫 번째 메시지 >>
 * 제품아이디 : PROD-00001
 * 제품명 : iPhone4
 * 가격 : 940000
 * 수량 : 4
 * 제조사 : 애플
 * << 두 번째 메시지 >>
 * 메시지 형식이 잘못되었습니다.
 * 메시지는 제품아이디 : 제품명 : 가격 : 수량 : 제조사 형식이어야 합니다
 */
public class Java120_String {

	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");

	}// end main

	private static void handleMessage(String sn) {
		// 제품아이디, 제품명, 가격, 수량, 제조사를 출력하는 프로그램을 구현하시오.
		String data[] = sn.split(":");
		//메모리에 저장된 문자열을 ":"로 구분해서 문자열 배열로 리턴
		if (data.length == 5) {
			System.out.println("제품 아이디 : " + data[0]);
			System.out.println("제품명 : " + data[1]);
			System.out.println("가격 : " + data[2]);
			System.out.println("수량 : " + data[3]);
			System.out.println("제조사 : " + data[4]);
		} else {
			System.out.println("메시지 형식이 잘못되었습니다.");
			System.out.println("메시지는 제품아이디 : 제품명 : 가격 : 수량 : 제조사 형식이어야 합니다");
		}

	}// end handleMessage()

}// end class
