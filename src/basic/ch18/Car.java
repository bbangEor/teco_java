package basic.ch18;
// 자동차랑 엔진은 상속하면 절 ~ 대 안됨! 
public class Car {

	// 속성 
	String name;
	int price;
	Engine engine; // (Composition) 포함관계 (has a 관계) > 자동차 안에 엔진이 포함되어있는 관계다!
	
	public Car() { // 생성자 호출
		//포함관계 - Composition
		//객체안에 필요 객체를 직접 생성할 경우
		//Composition 관계라고 합니다.
		engine = new Engine(); //우선 초기화
		// Car 라는 객체가 생성될때, Engine 객체도 함께 생성됨.
		// 자동차가 생성이 되어야만 엔진도 생성이되는 관계
	}
	public void startCar() { // 메서드 생성
		engine.start();
		System.out.println(" 자동차가 출발합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
}
