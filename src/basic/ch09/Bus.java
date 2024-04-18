package basic.ch09;


public class Bus {
	
	int busNumber;
	int passengerCount; // 승객 수
	int money; // 수익
	
	//강제성
	public Bus(int number) {
		//객체 생성시에 제일 먼저 실행되는 부분
		busNumber = number;
	}
	//메서드 정의
	//승객을 태운다. <버스의 기능 ,파라미터설정()
	public void take(int pay) {
		//money = money + pay; // 기존값에서 새로들어오는 값을 더해야함. 수익을 쌓으려면
		money += pay;
		//passengerCount = passengerCount + 1;
		passengerCount++;
	}
	
	//현재 상황을 보여주는 기능인 상태창을 만들어보자
	public void showInfo() {
		System.out.println("버스번호 : " + busNumber);
		System.out.println("버스승객수 : " + passengerCount);
		System.out.println("수익 : " + money);
	}
	
}
