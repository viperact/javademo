package java017_collection.prob;

import java.util.ArrayList;

/*
 * 2 
 * 10 
 * 4 
 * 6
 */
public class Prob004_ArrayList {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 2, 7 };
		int[] num = { 1, 10, 15, 4, 6 };
		ArrayList<Integer> v = merge(arr, num);
		for (Integer it : v)
			System.out.println(it);
	}// end main()

	public static ArrayList<Integer> merge(int[] arr, int[] num) {
		// arr,num배열을 병합한후 2의 배수만 리턴하는 프로그램을 구현하시오.
		// return값 = ArrayList
		//크기 10의 배열생성
		int[] data = new int[arr.length + num.length];
		
		//num배열에서 0번째에서 data에 복사해서 넣어준다 0번째 인덱스에. arr.length 길이만큼
		System.arraycopy(arr, 0, data, 0, arr.length);
		//arr.length : 시작점(5)부터 num.length길이만큼 (5) data에 복사
		System.arraycopy(num, 0, data, arr.length, num.length);
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(Integer it : data) {
			if(it%2==0)
				aList.add(it);
		}
			
		
//		for (int i = 0; i < data.length; i++) {
//			if (data[i] % 2 == 0)
//				aList.add(data[i]);
//		}

		return aList;

	}// end merge();

}
