package basic.ch10;

// 은행
public class Bank2 {
	// 아무것도 지정하지않으면 defalt 제어지시자 이다.
	// private은 클래스 안에서만 사용 가능함.
	String name; //은행이름
	int balance; //잔액

	// 입금하다
	public void deposit(int money) {
		balance = balance + money; // 입금 = 기존 잔고에 +money 
	}
	// 출금하다
	public int withdraw(int money) {
		// 방어적 코드 작성
		if(balance < money) {
			System.out.println("잘못된 요청입니다!");
			return 0;
		}
		balance = balance - money ; //  기존잔고에서 - money
		showInfo();
		return money ;
		
	}
	
	// 현재 은행의 총 잔액을 출력하다.
	public void showInfo() {
		System.out.println("현재 잔액은 :" + this.balance + "입니다.");
	}
	
	
		
	
	

}
