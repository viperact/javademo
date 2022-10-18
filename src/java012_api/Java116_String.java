package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		String sn = "java";
		String sg = "java";
		// 리터럴형식으로 값을 지정
		// 같은 주소가 하나의 값을 지정

		/*
		 * sn ----> java(1)
		 * 
		 * sg ----> java(1)
		 */

		String st = new String("java");
		String ss = new String("java");
		// 새로운 객체 생성
		// 새로운 메모리가 생성

		/*
		 * st (새로운 주소값의 메모리) -----> java(1)
		 * 
		 * ss (새로운 주소값의 메모리) -----> java(2)
		 */

		// 주소비교
		System.out.printf("sn==sg:%b\n", sn == sg); // true
		System.out.printf("st==ss:%b\n", st == ss); // false

		// 메모리에 저장된 문자열 비교 (내용비교)
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); // true
		System.out.printf("st.equals(ss):%b\n", st.equals(ss)); // true
		// st.equalsIgnoreCase(st) : 대소문자 구분 안함
		// st.equals(st) : 대소문자 구분함

		// 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);

	}
}
