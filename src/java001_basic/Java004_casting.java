package java001_basic;
/*
 * 이클립스에서 지원하는 단축키
 * ctrl + spaceBar : 자동완성
 * ctrl + / : 한 라인 주석 설정 및 해제
 * ctrl + shift + / : 여러 라인 주석 설정
 * ctrl + shift + \ : 여러 라인 주석 해제
 * ctrl + shift + f : 자동정렬 (Window - Preferences - general - keys - ctrl + shift + F를 ctrl + f 로 변경)
 * 
 * 시스템에서 인식하는 데이터 타입의 크기
 * byte < char, short < int < long < float < double
 *   1     2      2      4      8      4       8    (정해놓은것)
 */
 

public class Java004_casting {

	public static void main(String[] args) {

		byte bNum = 2; //1byte = -128 ~ 128
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l (대소문자 상관없음) l로 long함수라는걸 표시해야함
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; // true or false
		//실수는 double, 정수는 int type이 기본값
		
		System.out.println(lNum); // sysout + ctrl + space bar
		System.out.println(fNum);
		
		//형변환 (casting)
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		//명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		long gNum = 6; // int 값을 long으로 바꿈 , int값은 long보다 작기때문에 묵시적 형변환
 		System.out.println(gNum);//6
 		
// 		float tNum = 2.5; // 명시적 형변환 : double => float / 큰것을 작은것으로 바꿀때
 		float tNum = (float)2.5; // 강제 형변환 : 값 앞에 float(바꾸려는함수)를 붙여줌
 		System.out.println(tNum); // 2.5
 		
 		//데이터 손실이 발생되는 경우
 		byte data = (byte)128;
 		System.out.println(data); //-128
 		
	} //end main()

} // end class
