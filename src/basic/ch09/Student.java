package basic.ch09;

public class Student {
	
	String name;//학생이름
	int money;//소지금액
	
	//강제성주기
	
	public Student(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	
	}
	
	//기능
	
	// 학생이 버스를탄다.
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus. take(1500);
		money  = money -1500;
	}
	public void takeSubway(Subway subway) {
		// 어떻게 코드를 만들어야 할까?
		subway. take(1100);
		money  = money -1100;
	}
	// 학생이 지하철을 탄다.
	//상태창을 보여준다.
	
	public void showInfo() {
		System.out.println("학생이름 : " + name);
		System.out.println("학생 소지금 : " + money);
	}
}
