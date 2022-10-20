package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		// 파일에대한 정보를 불러올때
		File file = new File("sample.txt");
		System.out.println(file.exists()); // false
		System.out.println(file.isFile()); // false
		System.out.println(file.length()); // 0

		FileWriter fw = null;
		// 파일에 정보를 입력할때

		try {
			// mode의 값이 true이면 append
			// mode의 값이 false이면 update
			// mode의 값을 생략하면 false 이다.
			// update를 하려면 생략을해도 됨
			fw = new FileWriter(file, false);
			fw.write("java\n"); // buffer에 저장
			fw.flush();
			fw.write("jsp\n"); // buffer에 저장
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' });
			fw.write("\n");
			fw.flush();
			fw.write(97); // 유니코드
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' }, 0, 3);
			fw.write("\n");
			fw.close(); //연결종료
			fw.write("mybatis"); //Stream closed
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end main()

}// end class
