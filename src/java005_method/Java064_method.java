package java005_method;

/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 */

public class Java064_method {
	
	public static void main(String[] args) {
		char[] arr = {'j', 'a', 'v', 'a', ' ', 't','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
		
	}//end main()
	
	//shallow copy : 주소복사
	//deep copy : 요소 복사
	public static char[] reverse(char[] data) {
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		char[] arr = new char[data.length]; // 새로운 배열 생성 (기존의 주소값이 바뀌지않게 하기위해)
//		arr[0] = data[8];
//		arr[1] = data[7];
//		arr[8] = data[0];
		
		for(int i=0; i<data.length; i++) {
			arr[i] = data[data.length-1-i];
			//arr[0] = data[9-1-0] = data[8]
			//arr[1] = data[9-1-1] = data[7]
			//arr[2] = data[9-1-2] = data[6]
			//arr[3] = data[9-1-3] = data[5]
			//arr[4] = data[9-1-4] = data[4]
			//arr[5] = data[9-1-5] = data[3]
			//arr[6] = data[9-1-6] = data[2]
			//arr[7] = data[9-1-7] = data[1]
			//arr[8] = data[9-1-8] = data[0]
		} //reverse 식
		return arr;
	}

}//end class
