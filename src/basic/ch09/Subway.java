package basic.ch09;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	//강제성 
	public Subway(int line) {
		lineNumber = line;
	}
	
	//기능 : 승객을 태우다
	public void take (int pay) {
		money += pay;
		passengerCount++; 
	}
	public void showInfo() {
		System.out.println("지하철번호 : " + lineNumber);
		System.out.println("지하철승객수 : " + passengerCount);
		System.out.println("수익 : " + money);
	}
}
