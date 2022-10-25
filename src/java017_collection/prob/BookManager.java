package java017_collection.prob;

import java.util.ArrayList;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int sum = 0; // 합계를 저장하기위한 메모리공간생성 

		for (BookDTO dto : bookList) {
			if (dto.getKind().equals(kind))
				sum += dto.getRentalPrice();
		}

		return sum;
	}// end getRentalPrice()

}// end class
