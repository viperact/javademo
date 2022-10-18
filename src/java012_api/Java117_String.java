package java012_api;

////////////////////////////// 외워야 할 부분 ///////////////////////////////////

public class Java117_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");

		// 문자열의 길이를 리턴해주는 .length()
		System.out.println("문자열 길이:" + str.length()); // 문자열 길이:14

		// 문자열을 대문자, 소문자로 바꿔주는 .toUpperCase(), .toLowerCase()
		System.out.println("대문자:" + str.toUpperCase()); // 대문자:KOREA,JSP,JAVA
		System.out.println("소문자:" + str.toLowerCase()); // 소문자:korea,jsp,java

		// 특정 문자열의 요소를 리턴해주는 .charAt()
		System.out.println("문자:" + str.charAt(0)); // 문자:K

		// 왼쪽부터 특정 요소를 찾아 그 요소의 인덱스값을 반환해주는 .indexOf()
		System.out.println("인덱스:" + str.indexOf('a')); // 인덱스:4
		// .indexOf는 아스키코드값도 가능 (a = 아스키코드 97) 
		System.out.println("인덱스:" + str.indexOf(97)); // 인덱스:4

		// 맨뒤에서부터 특정 요소를 찾아 그 요소의 인덱스값을 반환해주는 .lastIndexOf()
		System.out.println("인덱스:" + str.lastIndexOf('a')); // 인덱스:13

		// 지정 인덱스부터 마지막까지의 문자열을 리턴해주는 .substring
		System.out.println("범위:" + str.substring(5)); // 범위:,jsp,java

		// 지정한 첫번째 인덱스이상 두번째 인덱스 미만까지의 문자열을 리턴 (2이상 8미만의 인덱스)
		System.out.println("범위:" + str.substring(2, 8)); // 범위:REa,js

		// 메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		/*
		 * arr[0]=KoREa
		 * arr[1]=jsp
		 * arr[2]=java
		 */

		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n", x, y, x + y); // 10+20=30

		// int 값을 String값으로 바꾸기 (모든 요소를 String으로 바꿔줄때 씀)
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s+%s=%s\n", s1, s2, s1 + s2); // 10+20=1020
		
		// char 값을 String값으로 바꾸기
		char[] data = {'1', '2', '3'};
		String s3 = String.valueOf(data);
		System.out.println(s3); // 123
	}

}
