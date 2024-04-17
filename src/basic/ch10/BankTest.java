package basic.ch10;

public class BankTest {
	// 코드의 시작점 메인함수
	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		//bank1.name = "우리은행"; //private 붙여서 오류남.
		bank1.deposit(10_000);
		//bank1.withdraw(100_000); //통장에 100000 이 없어서 출금이 안됨.
		int getMoney = bank1.withdraw(5_000); 
		System.out.println(">>>>>>>>>>>>출금>>>>>>>>>>>");
		System.out.println("금액 :" + getMoney);
		// 여기 시점에서의 계좌 잔액 : 5000원
		
		
		//실수로 멤버 변수에 접근해서 수정 해버림. 
		// Bank에 돈을 넣어야함 -> deposit() 기능으로 만들어져있음
		//bank1.balance = 100_000; // Bank파일에서 balance앞에 private을 붙임으로 정보 은닉이됨. 오류를 일으킴으로 실수예방
		// 정상값은 10만 5천원이 있어야함.
		// bank1.showInfo();
		// 덮어쓰기 되어버려서 결과값은 10만원이 나옴. 
		//의도하지않은 실수를 발생시킬 수 있다.
		bank1.deposit(100_000);
		
		// 실행에 흐름을 만들예정
		// 현재 은행에 전체 잔고가 200_000 이하라면 본점에 금액 요청상황.
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if(money <= 200_000) {
			System.out.println("본점에 금액 요청해!");
		}
		System.out.println("-------------------------");
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		
		bank1.setBalance(10000000); // ( - 10000000) -> 방어적 코드로 인해서 이상한값은 입력되지않음! 
		System.out.println(bank1.getBalance());
		
		//set 메서드 이용해서 덮어쓰기됨. 은행이름 잔액 다 덮어쓰기해서 바뀜.
		
	} // end of main

} // end of class
