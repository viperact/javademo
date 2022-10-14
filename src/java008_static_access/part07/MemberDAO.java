package java008_static_access.part07;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
		//true 하나의 주소를 두개의 값이 가리켜서 같은 값임
		
		//return new MemberDAO(); 
		//false 주소값을 하나하나 따로 새로 생성해서 같은값이 아님
	}

	public void display() {
		System.out.println("display");
	}
}
