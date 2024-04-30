package useful.ch04;

public abstract class Car {

	void startCar() {
		System.out.println("시동을 켭니다");
	}

	abstract void drive(); // 추상메서드 + abstract

	abstract void stop();

	void turnOff() {
		System.out.println("시동을 끕니다");
	}

	// ! 템플릿 메서드 패턴의 핵심 !
	// 클래스 + final = [상속] 할 수 없다!
	// 변수 + final = [상수]
	// 메서드 + final = 하위 클래스에서 [재정의] 할 수 없다!
	final void run() {
		// 실행의 흐름 만들기
		startCar();
		drive();
		stop();
		turnOff();
	}

}
