package basic.ch05;

public class StudentProgram {
	// 메인함수
	public static void main(String[] args) {
		
		// 변수의 값을 초기화 하다. 
		int grade = 10;
		String name = "홍길동" ;
		
		//변수에 선언 - 데이터 타입이 대문자로 시작하고있다.
		Student studentKim;
		//변수를 초기화하다. 
		studentKim = new Student();
		
		// 미리 설계한 클래스파일 (데이터 타입) 을 가지고와서 사용. 
		//클래스를 메모리에 올렸다. 
		//클래스를 인스턴스화 했다.
		Student studentLee = new Student();
		// 현재까지 Student 라는 객체 두명이 올라간것
		
		
	} // end of main

} // end of class
