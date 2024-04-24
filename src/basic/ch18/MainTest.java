package basic.ch18;

public class MainTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.startCar();
		// 1. 엔진시작 -> 2.자동차출발
		
		//엔진의 속성인 name 변수에 값을 초기화 해주고싶다면?!
		car1.engine.name = "V8";
		car1.engine.price = 4000;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
	}

}
