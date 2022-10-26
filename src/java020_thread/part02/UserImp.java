package java020_thread.part02;

public class UserImp implements Runnable {

	public UserImp() {

	}

	@Override
	public void run() {
		for (int j = 0; j <= 5; j++) {
			System.out.printf("%s j=%d\n", Thread.currentThread().getName(), j);

		}

	}
}
