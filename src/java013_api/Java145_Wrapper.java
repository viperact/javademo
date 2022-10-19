package java013_api;

public class Java145_Wrapper {
	
	public static void main(String[] args) {
		char data = 'a';
		
		System.out.println(Character.toUpperCase(data));//대문자 변환
		System.out.println(Character.toLowerCase(data));//소문자 변환
		System.out.println(Character.isUpperCase(data));//false is로 시작하면 결과값이 논리값
		System.out.println(Character.isLowerCase(data));//true
		System.out.println(Character.isAlphabetic(data));//true 알파벳임을 묻는 메소드
		System.out.println(Character.isDigit(data));//false 숫자임을 묻는 메소드
		System.out.println(Character.toString(data));//char값을 문자열로 바꿔주는 메소드
		
		
	}

}
