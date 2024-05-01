package useful.ch05;

// 문법을 how , why 어떻게 왜 쓰는지
public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분 --> run() 메서드를 정의하면된다.
	// Thread start 하면 실행되는 부분
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker :" + name + ":" + i);

			try { // 예외처리
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
