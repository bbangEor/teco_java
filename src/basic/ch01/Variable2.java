package basic.ch01;

public class Variable2 {

	// 코드의 시작점(main) 함수 main ctrl space >main
	public static void main(String[] args) {

		// 변수의 이름을 만들때 규칙이 있다.

		// 1. 대소문자를 명확히 구분하며 길이에 제한이없다.
		// 값을 넣다. = 초기화 하다.
		int age = 10; // age에 10으로 초기화
		int AGE = 20;
		int aGe = 30;
		// 변수에 선언과 동시에 초기화(값넣기)
		// int age;

		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
		// int , double , if , for > 이런 예약어들은 변수로 선언할 수 없다.
		// int if; > 오류가 발생함.불가능

		// 3. 변수는 숫자로 시작할 수 없다.
		// int 30age; > 오류발생
		// int 20Man; > 오류발생

		// 4. 특수문자는 언더바 _ , 달러 $ 표기만 가능하다.
		int _count;
		int $_tel;
		// int*count;> 오류발생

		// 권장사항 ! 변수를 선언할때 소문자 부터 시작하자.
		int GIVE; // 오류는 생기지 않으나, 권장사항을 지키자!

		// 변수 선언과 동시에 초기화가 가능함.
		int score = 10;
		int score1, score2, score3; // 쉼표를 사용해서도가능함.권장하진않

	}// end of main

}// end of class
