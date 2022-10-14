package java008_static_access.part01;

public class StaticEx {
	int x = 5 ;
	//new로 객체생성을 해야 영역에 생성가능함
	static int y = 10;
	//y는 class영역에 저장되기전에 메소드영역에 생성됨
	
	public StaticEx() {
		
		
	}
	
	public String toString() {
		return String.format("x=%2d y=%2d\n", x, y);
	}
}
