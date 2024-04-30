package useful.ch04;

public class AICar extends Car {

	@Override
	void drive() {

		System.out.println("AI Car 가 자율주행을 시작합니다.");
		System.out.println("스스로 방향을 바꿉니다.");

	}

	@Override
	void stop() {

		System.out.println("자동으로 멈춥니다.");
		System.out.println("위험을 감지하여 급제동 합니다.");

	}

}
