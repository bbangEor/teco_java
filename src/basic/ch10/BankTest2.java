package basic.ch10;

public class BankTest2 {
	// 코드의 시작점 메인함수
	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		//bank1.name = "우리은행"; private  붙여서 오류남
		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(5_000);
		System.out.println(">>>>>>>>>>>>출금>>>>>>>>>>>");
		System.out.println("금액 :" + getMoney);
		
		
	} // end of main

} // end of class
