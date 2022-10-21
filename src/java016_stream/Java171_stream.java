package java016_stream;

import java.io.File;

public class Java171_stream {

	public static void main(String[] args) {
		// File file = new File("src/java016_stream/temp");
		// ystem.out.println(file.isDirectory()); // false -> 현재 temp라는 파일이 존재하지않아서
		File file = new File("src/java016_stream/a/b");

		if (!file.isDirectory()) {
			// file.mkdir();
			file.mkdirs();
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}
	}// end main()

}// end class
