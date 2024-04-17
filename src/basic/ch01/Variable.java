package basic.ch01;

public class Variable {
	//코드의 시작점 (메인함수)
	/** 
	 * 여러줄 주석 
	 * 변수란 뭘까?
	 * 변하는 수 (변할수있는 데이터)
	 * 데이터 값 을 담을수 있는 메모리 공간 (상자)
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수를 활용하는 3가지 유형
		
		//1. 변수를 선언하다. 
		int ageBox; // 정수 값을 담을수있는 상자를 선언
		int telBox; // 정수 값을 담을수있는 상자를 선언
		// 공간만 만들었지 안에 값을 넣진않았음
		
		//2. 변수에 값을 넣기 (초기화 한다)
		ageBox = 30; // = 은 대입연산자 값을 대입해줌.
		telBox = 300;
		
		//3. 변수를 사용하기 (변수 이름 호출해서 출력)
		System.out.println(ageBox);// agebox 값을 출력
		ageBox = telBox;
		// 원래 있던 30의값은 사라지고 300의 값이됨.
		System.out.println("after --> ageBox : " + ageBox);
		System.out.println("---------------");
		System.out.println(telBox);// telbox 값을 출력
		//
		
		
	} // end of main

}// end of class
