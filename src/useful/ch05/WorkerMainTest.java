package useful.ch05;

public class WorkerMainTest {

	// 메인 작업자 
	public static void main(String[] args) {
		System.out.println(" ---------------- main Thread 시작");
		System.out.println(Thread.currentThread());
		
		// 작업자 추가하기!
		Worker worker1 = new Worker("워커1"); // 생성은  main Thread 가 함! 
		// 명령어를 통해서 워커1 에게 위임받은일을 시킬수있다.
		worker1.start(); // 이것또한 mainThread 가 명령을 내림.
		
		System.out.println("----------- main Thread 종료 -----------");
		// 메인작업자는 새로 생성한 작업자에게 일을 시킴
		
	}

}
