package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java167_Stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		FileReader fr = null;
		int data;

		try {
			fr=new FileReader(file);
//			for(long i=0; i<file.length(); i++)
//				System.out.print((char)fr.read());
			
			//read() : 파일의 끝일 때 (더이상 읽어올 게 없을때) -1을 리턴한다.
			// != -1 : 읽을 내용이 있으면
			while((data = fr.read())!= -1) {
				System.out.print((char)data);
			}
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}// end main()

}// end class
