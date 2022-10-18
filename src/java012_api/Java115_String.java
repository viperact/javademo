package java012_api;

public class Java115_String {
	
	public static void main(String[] args) {
		char[] data = {'j','a','V','A'};
		StringTest st = new StringTest(data);
		//배열의 길이
		System.out.println(st.length());
		
		//특정 index의 대문자여부
		System.out.println(st.isUpperCase(0));
		System.out.println(st.isUpperCase(2));
		
		//특정 index의 소문자 여부
		System.out.println(st.isLowerCase(3));
		System.out.println(st.isLowerCase(1));
		
		//특정 index의 요소 출력
		System.out.println(st.charAt(0));
		
		//st로 호출하면 내부에서 toString으로 처리하기에
		//st.toString과 st의 호출값은 같음
		System.out.println(st.toString());
		System.out.println(st);
	}
	
}
