package basic.ch12;

public class Card {

	// 문제 . 카드 번호가 발급될때마다 고유한 카드 번호를 가질 수 있도록 코드를 설계해주세요.

	// 멤버 변수, static 변수

	private int cardNum; // 카드번호
	static int empCardNumber = 1000;

	// 생성자
	public Card(int number) {
		// 멤버 함수
		this.cardNum = Card.empCardNumber;
		Card.empCardNumber++;
	}

	// 코드테스트(메인함수)
	public static void main(String[] args) {

		Card card1 = new Card(1);
		System.out.println("카드번호 " + card1.getEmpCardNumber() + " 으로 발급되었습니다.");

		Card card2 = new Card(2);
		System.out.println("카드번호 " + card2.getEmpCardNumber() + " 으로 발급되었습니다.");

		Card card3 = new Card(3);
		System.out.println("카드번호 " + card3.getEmpCardNumber() + " 으로 발급되었습니다.");

	}// end of main

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public static int getEmpCardNumber() {
		return empCardNumber;
	}

	public static void setEmpCardNumber(int empCardNumber) {
		Card.empCardNumber = empCardNumber;
	}

}// end of class
