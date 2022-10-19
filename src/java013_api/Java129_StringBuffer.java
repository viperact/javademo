package java013_api;

/*
 * java.lang.String : immutable(불변) - 데이터 수정 불가
 * java.lang.StringBuffer : mutable(가변) - 데이터 수정 가능, 동기화 (서버에 요청을 보냈을때 클라이언트가 작업불가능)
 * java.lang.StringBuilder : mutable(가변), 비동기화 (서버에 요청을 보냈을때 클라이언트가 작업가능)
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 "mutable(가변)"이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 * 3. StringBuffer와 String은 서로 다르다 (서로 독립적이다)
 */
public class Java129_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test java"); //메모리 생성
		String ss = sg.replace("java", "jsp"); // "java"를 "jsp"로 변경 sg.replace
		//새로운 메모리 생성후(StringBuffer)"java"를 "jsp"로 변경, ss메모리생성 후 대입
		System.out.println("ss : " + ss);
		System.out.println("sg : " + sg);
		System.out.println(ss == sg); // false - String은 불변이라 데이터 수정 불가능
		System.out.println(sg.toString()); 

		System.out.println("=================");
		
		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(0, 6, "framwokr"); //(index시작(포함), index끝(미포함), 변경할요소)
		//.replace = StringBuffer
		System.out.println("sb : " + sb);
		System.out.println("su : " + su);
		System.out.println(sb == su); // true - StringBuffer는 가변이라 메모리가 수정됨
		System.out.println(sb.equals(su)); // true - StringBuffer는 가변이라 메모리가 수정됨
		System.out.println(sb.toString());
		
		
		
		
		
		
	}// end main()

}// end class()
