package java011_casting.part01;

/*
 * 데이터 타입
 * 1. primitive data type(기본데이터타입):byte, short, int, long, float, double, boolean, char
 * 2. reference data type(참조데이터타입):array, class
 * 
 * 형변환(casting) - 기본 데이터 타입
 * 1. 묵시적 형변환 : 작 -> 큰
 * 2. 명시적 형변환 : 큰 -> 작
 * 		int num = 3;
 * 		double data = num; // 묵시적 형변환
 * 		short val = (short)num; // 명시적 형변환
 * 
 * 객체 형변환 - 참조 데이터 타입
 * 1. 상속관계일때 형변환이 가능하다.(is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅 할 수 있다.
 * 	  - 업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 * 	  - 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환기술
 */
public class Java109_casting {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();

		// Parent p = new Child();
		p = c; // 업캐스팅 (up-casting) , 상속관계일때만 가능함
		p.process();

		// p.call(); // 자식클래스의 요소에는 직접 참조못함

		Child d = (Child) p; // 다운캐스팅 (down-casting)
		
		 //객체생성 및 업캐스팅
		 Parent pt = new Child();
		 pt.process();
		 //pt.call();
		 
		 //다운캐스팅
		 Child cn = (Child)pt;
		 cn.call();
	}

}
