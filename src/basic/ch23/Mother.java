package basic.ch23;

public class Mother extends Thread {

	BankAccount account; // 멤버

	public Mother(BankAccount account) {

		this.account = account;

	}

	@Override
	public void run() {
		account.withDraw(5_000); // 5천원 출금 처리 - 다른 작업자에게 위임

	}

}
