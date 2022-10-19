package java013_api;

import java.util.Scanner;

public class Java140_Scanner {
	
	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어들이기 위해서 콘솔창과 연결 (System.in)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//next(), nextLine()메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고(콘솔창에) Enter를 하면
		//next(), netxLine() 메소드를 읽는다.
		
		//String name = sc.next();
		//한 단어만 입력받아 출력
		
		String name = sc.nextLine();
		//하나의 라인을 전부 입력받아 출력
		
		System.out.println(name);
		
	}//end main()

}//end class
