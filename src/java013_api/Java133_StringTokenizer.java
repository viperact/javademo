package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {
	
	public static void main(String[] args) {
		
		//구분자가 연속적으로 입력되어 있으면 두번째 구분자 부터는 무시를 한다.
		StringTokenizer st = new StringTokenizer("java,/jsp/spring", ",/");
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
			
		System.out.println("================================="); 
		
		//구분자 갯수만큼 문자열을 나누어준다 (.split)
		String[] data = new String("java,/jsp/spring").split("[,/]");
		//[] 대괄호 = or [,/] = , or /
		System.out.println(data.length);
		//4 = ,' '/ .split으로 구분자 사이를 공백값으로 지정함
		for(int i=0; i<data.length;i++) {
			System.out.printf("data[%d]=%s\n",i, data[i]);
		}
		
		
	}//end main()

	
}//end class
