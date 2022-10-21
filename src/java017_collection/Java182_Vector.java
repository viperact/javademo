package java017_collection;

import java.util.Vector;

public class Java182_Vector {

	public static void main(String[] args) {
		// Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
		
		v.addElement(new String("java")); //append
		
		v.add(new String("jsp")); // append
		
		//2번째 index에 jsp가 복사가 된후 1번째 index에 Spring이 삽입됨
		v.add(1, new String("Spring")); //insert - 1번째 index에 Spring을 넣어라
		
		
		for(int i=0; i<v.size(); i++)
			System.out.printf("V[%d]=%s\n", i, v.get(i));
		
		//요소가 저장되어 있지 않은 메모리 제거
		v.trimToSize(); // 용량크기가 10에서 3으로 줄어들음
		
		System.out.println("용량크기 : " + v.capacity());
		System.out.println("요소갯수 : " + v.size());
		

	}
}
