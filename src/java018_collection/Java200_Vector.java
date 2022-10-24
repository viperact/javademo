package java018_collection;

import java.util.Vector;

public class Java200_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");

		System.out.println(v.toString());
		
		Vector<String> t= new Vector<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString());
		System.out.println(t.toString().length());
		//[] 안에 출력이되지만 배열이 아님
		//t.toString().length() = 13 , []도 문자로 포함
		
		v.removeAll(t); 
		System.out.println(v.toString());
		//v.toString - t.toString = v.removeAll(t);
	}// end main()

}// end class
