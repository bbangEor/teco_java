package basic.ch23;

// !!중요!!동기화처리!
public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금 기능
	public synchronized void saveMoney(int money) {

		int currentMoney = getMoney();
		
		// 3초 정도의 시간이 소요됨
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 현재 남아있는 계좌잔액
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());

	}

	// 출금 기능
	public int withDraw(int money) {

		synchronized(this) {
		// 현재 잔액 10만원
		int currentMoney = getMoney();
		// 0.5 초정도의 시간이 소요됨
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// 방어적 코드 작성
		if (currentMoney >= money) { // 출금하려는 금액보다 잔액이 더 많다면
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 : " + getMoney());
			return money;
		} else {
			System.out.println("계좌 잔액이 부족합니다.");
			return 0;
		}
	}
	}
}
