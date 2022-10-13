package java008_static_access.part05;

/*
 * https://all-record.tistory.com/53
 * 
 * https://hongong.hanbit.co.kr/%EC%9E%90%EB%B0%94-%EC%A0%91%EA%B7%BC-%EC%A0%9C%ED%95%9C%EC%9E%90%EC%9D%98-%EC%A2%85%EB%A5%98%EC%99%80-%EC%B0%A8%EC%9D%B4public-protected-private/
 */
public class Java088_access {

	public static void main(String[] args) {
		Java087_access p = new Java087_access();
		//System.out.printf("var_private:%d\n", p.var_private);
		//private는 정의된곳아니면 사용하지못함
		System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);
	}
}
