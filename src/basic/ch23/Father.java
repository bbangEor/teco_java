package basic.ch23;

public class Father extends Thread {

	BankAccount account; // 포함관계

	public Father(BankAccount account) {
		// 객체가 될때 맨 처음 동작하는 코드는 생성자 이다.
		this.account = account;
	}

	// 위임 시킬 일을 요청 (정의) 할예정
	@Override
	public void run() {
		account.saveMoney(10_000); // 1만원 입금 처리 - 다른 작업자에게 위임
	}

}
