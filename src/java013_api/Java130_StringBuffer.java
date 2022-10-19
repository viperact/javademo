package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");

		// 4인덱스에 :", jsp" 문자열을 삽입
		sb.insert(4, ",jsp");
		System.out.println(sb); // java,jsp test

		// 4index부터 8index미만 사이의 문자열을 삭제
		sb.delete(4, 8);
		System.out.println(sb); // java test

		// 마지막에 문자열을 추가
		sb.append(" start");
		System.out.println(sb); // java test start

		// 문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); // trats tset avaj
		
		//String -> StringBuffer -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data); 
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		
		//StringBuffer에 있는 값을 다시 String으로 리턴하는 메소드
		String re = sf.toString();
		System.out.println(re);
		
		System.out.println("======================");
		
		//char[] -> String -> StringBuffer
		char[] arr = {'k','o','r','e','a'}; // char 배열 생성
		String sp = String.valueOf(arr); // char 배열을 String으로 변환후 String 메모리 sp에 저장
		System.out.println(arr);
		StringBuffer se = new StringBuffer(sp);
//		StringBuffer sr = new StringBuffer();
//		sr.append(sp);
		se.reverse();
		System.out.println(se);
		
		System.out.println(String.valueOf(arr));
		// = char[] arr = {'k','o','r','e','a'};
		//	 String sp = String.valueOf(arr);
		
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());
		// String.valueOf(arr) -> new StringBuffer -> .reverse
		// = StringBuffer se = new StringBuffer(sp);
		// 	 se.reverse();
		// 	 System.out.println(se);
		
		System.out.println("==========================");
		//StringBuffer -> String -> char[]
		String st = se.toString(); //StringBuffer -> String
		char[] val = st.toCharArray(); //String -> char[]
		System.out.println(val);
		
		System.out.println(se.toString().toCharArray()); // 위 과정을 한줄로표현
	}// end main()

}// end class()







