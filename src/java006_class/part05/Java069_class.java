package java006_class.part05;

public class Java069_class {
	
	public static void main(String[] args) {
		MemberVar mv = new MemberVar();
		System.out.printf("var_byte=%d\n", mv.var_byte);
		System.out.printf("var_short=%d\n", mv.var_short);
		System.out.printf("var_long=%d\n", mv.var_long);
		System.out.printf("var_float=%.1f\n", mv.var_float);
		System.out.printf("var_double=%.1f\n", mv.var_double);
		System.out.printf("var_boolean=%s\n", mv.var_boolean);
		System.out.printf("var_string=%s\n", mv.var_string);
		System.out.printf("var_arr=%s\n", mv.var_arr);
		
		//null = 현제 메모리칸에 메모리가 생성이 안되있다
		
//		int num;
//		System.out.printf("num:%d\n", num);
		//The local variable num may not have been initialized
		//지역변수의 초기값은 설정되어있지 않다
		//값이 지정이 안되있는데 호출해서 오류가 발생
		//지역변수는 반드시 값을 지정해 줘야함  int num = 0;
	}

}
