package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		// 현재 잔액은 100_000 원이다
		BankAccount account = new BankAccount();

		// --> 아버지와 어머니는 똑같은 account 를 바라보고있다.

		// 아버지 클래스 생성 new
		Father father = new Father(account); // 생성자 의존 주입 ( DI ) : 생성자를 통해서 다른객체를 주입!
		father.start();

		// 어머니 클래스 생성 new
		Mother mother = new Mother(account);
		mother.start();

		int resultMoney = account.getMoney();
		System.out.println("현재 잔액 : " + resultMoney);
		// 정상처리 : 10 만원 + 1만원 - 5천원 ==> 10만 5천원

	}

}
