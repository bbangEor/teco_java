package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {

		System.out.println("main start");

		// 문제 !
		// MyThread2 를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출하세요
		// 힌트 -> Thread 문서를 반드시 확인하세요!

		// !새로운 작업자를 생성해서 위임시킬때는 Thread 메서드 안에 있는 start() 메서드를 호출해야한다!

		MyThread2 myThread2 = new MyThread2();
		// myThread2.run(); //일반 메서드 호출임!
		Thread thread1 = new Thread(myThread2); // new Thread(Runnable);
		thread1.start();
		// 결국 다른 작업자에게 일을 위임 하고싶다면,
		// 똑같은 스레드에 strat () 를 호출해야함!!

		System.out.println("---  end of thread ---");

	}//

}//
