package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java163_stream {

	public static void main(String[] args) {
		// 바이트스트림 연결 (콘솔)
		InputStream is = System.in;

		// 바이트스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		System.out.print("데이터 입력: ");

		// 문자 스트림
		BufferedReader br = new BufferedReader(ir);

		try {
			// int data = br.read();
			// System.out.println(data);
			// System.out.println((char)data);
			
//////////////////////////////////////////////////////////////
			
//			int data;
//
//			while ((data = br.read()) != 13) {
//				System.out.println((char) data);
//			}
			
//////////////////////////////////////////////////////////////			
			String line = br.readLine();
			System.out.println(line);
			//하나의 열로 정렬시켜 출력해줌
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}// end main()

}// end class
