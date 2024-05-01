package useful.ch05;

public class MyThreadMainTest {
	// 기본적으로 메인 작업자 하나를 가지고 있다. 메인스레드라고 함.
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		
		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread();
		th1.start(); // start 가 호출되면 run() 메서드가 동작됨!		
		System.out.println("--------------------------------------");
		
		// 필요 하다면 추가 작업자를 더 만들수 있다.
		MyThread th2 = new MyThread();
		th2.start();
		
		// + 작업자 : 멀티스래딩 프로그램 
	}//

}//

