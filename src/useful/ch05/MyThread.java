package useful.ch05;

/**
 * 스레드를 추가하는 방법 - 상속을 활용할 수 있다. Thread --> Runnable --> run()
 */
public class MyThread extends Thread { // 다형성의 적용으로 MyThread 는 Thread 로 바라볼 수 있다!

	// 우리가 정의한 클래스에서 run() 이란 메서드를 [재정의] 할 수있다.
	// 스레드를 사용할때 알아야하는 필수 개념!! 암기 !!
	// 스레드가 가지고 있는 메서드 start() 를 호출 시키면
	// run() 메서드가 호출되어 동작하게 만들어져있다.
	
	public void run() {
		// 우리가 동작 시키고자 하는 일을 정의해서 코드를 설계할 수 있다.
		// 임무 - 반복문 200번을 수행해보자!
		for (int i = 0; i < 200; i++) {
			System.out.println(i + ", ");
			try {
				Thread.sleep(500); // 1000 = 1초 , 500 = 0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

}// end of class
