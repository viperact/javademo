package java012_api;

import java.util.regex.Pattern;

/*
 * 아이디를 입력할때 영문자,숫자 조합으로 합니다. 최소 5자이상 10자이하까지만 가능합니다.
 * (반드시 영문자로 시작한다.)
 * 
 * [출력결과]
 * 	로그인 되었습니다.
 * 	회원이 아닙니다.
 */
public class Java128_RegEx {

	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("y23m1"));
		
		System.out.print("korea");
		display(process("korea"));
		
	}// end main()

	public static boolean process(String sn) {
		//여기를 구현하세요.
		
		return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();
		//[첫 영문자 표시] [영문자 숫자] , {남아있는 자릿수 (첫글자는 지정해서 4자리~9자리)} && 남은자릿수 숫자 찾기  
	}// end process()

	public static void display(boolean res) {
		if (res) {
			System.out.println(" 로그인이 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	}// end display()

}// end class()
