package basic.ch10;

// 은행
public class Bank {
	// 아무것도 지정하지않으면 defalt 제어지시자 이다.
	// private은 클래스 안에서만 사용 가능함.
	private String name;
	private int balance; // private 을 사용해서 외부에서는 확인할수 없도록 중요한 변수를 감추기.

	// 입금하다
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	}

	// 출금하다
	public int withdraw(int money) {
		// 방어적 코드 작성
		if (balance < money) {
			System.out.println("잘못된 요청입니다!");
			return 0; // 0을 적지않으면 int때문에 오류가 생김 .
		}
		balance = balance - money;
		showInfo();
		return money;
		
	}

	// 현재 은행의 총 잔액을 출력하다.
	public void showInfo() {
		
		System.out.println("현재 잔액은 :" + this.balance + "입니다.");
	}
	
	//정보 은닉 후 getter, setter 메서드를 설계해둘수있다.
	// get 메서드란? 단순히 객체의 상태 변수를 리턴하는 메서드 이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	//setter 멤버 변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드 (리턴타입 없음)
	public void setName(String inputName) { //파라미터 설계하기
		this.name = inputName;
	}
	public void setBalance(int money) {
		// 방어적 코드 작성하기 
		if(money < 0) {
			System.out.println(" 잘못된 입력입니다!");
		}else {
			this.balance = money;
		}
		this.balance = money;
	}
	
	
	
	

}
