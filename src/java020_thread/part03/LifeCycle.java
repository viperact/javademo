package java020_thread.part03;

/*
 * 스레드 생명주기 (Thread Life Cycle)
 * start() - 실행준비상태(RUNNABLE) - run() - TERMINATED (종료상태)
 * 		   - sleep(1000), wait() - 대기상태(WAITING)
 */

public class LifeCycle extends Thread {

	public LifeCycle() {

	}// end LifeCycle()

	@Override
	public void run() {
		System.out.println(getState()); // 현재 Thread의 상태 RUNNABLE
	}
}
