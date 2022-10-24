package java018_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java189_LinkedList {

	public static void main(String[] args) {
		System.out.println("====ArrayList====");
		ArrayList<String> aList = new ArrayList<String>();
		// append
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		

		ListIterator<String> ank = aList.listIterator();
		System.out.println("앞->뒤");
		while (ank.hasNext())
			System.out.println(ank.next());
		
		System.out.println("뒤->앞");
		while (ank.hasPrevious())
			System.out.println(ank.previous());

		System.out.println("====LinkedList====");
		LinkedList<String> aNode = new LinkedList<String>();

		// append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));

		ListIterator<String> ite = aNode.listIterator();

		System.out.println("앞->뒤");
		while (ite.hasNext())
			System.out.println(ite.next());
		// pointer가 2번째 index(spring)에 있는 상태

		System.out.println("뒤->앞");
		while (ite.hasPrevious())
			System.out.println(ite.previous());
		// 마지막 포인터를 기준으로 (2 index) 움직임

	}// end main()

}// end class
