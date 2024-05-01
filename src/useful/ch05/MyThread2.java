package useful.ch05;

/**
 * 스레드를 만드는 두번째 방법 - Runnable 을 활용하기
 */
public class MyThread2 implements Runnable {

	private String name;

	public MyThread2() {

	}

	// Thread 클래스에서 start 메서드가 호출되면
	// 무조건 동작하는 부분이다!
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("i:" + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
