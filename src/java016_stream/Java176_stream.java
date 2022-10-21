package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 직렬화 (Serializable)
 * 1. 객체를 연속적인 데이터로 변환하는 것이다.
 * 	  반대로는 역 직렬화이다.
 * 2. 객체의 멤버수들의 값을 일렬로 나열하는 것이다.
 * 3. 객체를 저장하기 위해서는 객체를 직렬화해야 한다.
 * 4. 객체를 저장한다는것은 객체의 멤버변수의 값을 저장한다는 것이다.
 * 5. 객체를 직렬화하여 입축력할 수 있는 스트림
 * 	  ObjectInputStream, ObjectOutputStream
 * 6. 직렬화에서 제외할 멤버변수에서는 transient를 선언한다.
 */

class Phone implements Serializable {
	String name;
	transient int price; //transient : 직렬화가 적용안되게

	public Phone() {

	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {

		return String.format("%s %d\n", name, price);
	}
}// end Phone

public class Java176_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/phone.dat");
		FileOutputStream fs = null; // phone.dat 에 연결
		ObjectOutputStream os = null; // ObjectStream 연결
		FileInputStream fi = null; // phone.dat 에 연결
		ObjectInputStream oi = null; // ObjectStream 연결

		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);

			// 객체에 직렬화가 안되어있으면 아래와같이 Exception이 발생한다.
			// java.io.NotSerializableException: java016_stream.Phone
			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			os.writeObject(new String("java"));
			System.out.println("객체 저장");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/////////////////////////////////////////////////

		try {
			fi = new FileInputStream(file); //stream 연결
			oi = new ObjectInputStream(fi); //stream 연결
			Phone p = (Phone) oi.readObject();
			System.out.println(p.toString());

			String sn = (String) oi.readObject();
			System.out.println(sn.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end main()

}// end class
