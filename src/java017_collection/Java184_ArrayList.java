package java017_collection;

import java.util.ArrayList;

/*
 * Vector와 ArrayList
 * 1. Vector는 동기화 처리가 되어있고 ArrayList는 비동기화 처리한다.
 * 2. Vector와 ArrayList는 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3. Vector와 ArrayList는 클래스의 처리방법이 비슷하다.
 * 4. Vector와 ArrayList로 수시로 요소의 삽입, 삭제를 처리하는 것은
 * 	  좋은 방법이 아니다.
 */

public class Java184_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10); // auto boxing -> up-casting
		aList.add(20);
		aList.add(30);

		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}

		System.out.println("============================");
		for (Integer it : aList) // 개선된 for문
			System.out.println(it);
		for (Integer it : aList) // 개선된 for문
			System.out.println(it);

		System.out.println("============================");
		System.out.println(aList.remove(0)); // 삭제된 요소값을 출력해줌

		System.out.println("============================");
		for (Integer it : aList) // 개선된 for문
			System.out.println(it); // 20 30 (10은 remove로 삭제된상태)

		System.out.println("============================");

		System.out.println(aList.remove(new Integer(20)));

		System.out.println("============================");
		for (Integer it : aList)
			System.out.println(it);

	}

}
