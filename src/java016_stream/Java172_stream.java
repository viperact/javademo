package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException {
		// File file = new File("src/java016_stream/temp");
		// ystem.out.println(file.isDirectory()); // false -> 현재 temp라는 파일이 존재하지않아서
		// File file = new File("src/java016_stream/a/b");
		//File file = new File("src/java016_stream");
		//File.createTempFile("source", "test");
		File file = new File("src/java016_stream/sample.txt");
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();

		//if (file.isDirectory()) {
			// file.delete(); // 폴더 삭제
			// file.deleteOnExit();
			//System.out.println("폴더 삭제");
		//} else {
			//System.out.println("폴더 없음");
		//}
	}

}
