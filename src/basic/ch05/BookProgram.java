package basic.ch05;

public class BookProgram {
	//코드의 시작점 메인함수
	public static void main(String[] args) {

		// Book class 를 인스턴스화 시키기. 2개 
		// 참조타입 변수명은 bookBox1, bookBox2
		
		Book bookBox1 = new Book(); // 객체 생성
		Book bookBox2 = new Book(); // 객체 생성
		
		//참조타입의 변수 안에는 실제 값이 들어가는것이 아니라 
		//주소 값이 담긴다.레퍼런스 변수( Reference variable) 라고도 한다. 
		
		System.out.println(bookBox1);
		System.out.println(bookBox2);
		
		//Heap 메모리에 생성된 객체에 접근해서
		// 그 해당 객체의 속성값을 넣어보자. 
		
		bookBox1.title = "플러터UI실전";
		bookBox1.auther ="김근호";
		bookBox1.publishYear = 2022; //문자열 아니라서 "" 필요없음
		bookBox1.totalPage = 230;  //문자열 아니라서 "" 필요없음
		
		//콘솔창에 해당 객체의 속성값 (상태값)을 출력하자
		System.out.println(bookBox1.title);
		System.out.println(bookBox1.auther);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		//연습문제 
		// bookBox2 의 클래스 인스턴스에 접근해서 속성값을 대입하고 
		//콘솔창에 출력하기.
		
		bookBox2.title = "햄발UI실전";
		bookBox2.auther = "햄발";
		bookBox2.publishYear = 1999;
		bookBox2.totalPage = 100;
		
		System.out.println(bookBox2.title);
		System.out.println(bookBox2.auther);
		System.out.println(bookBox2.publishYear);
		System.out.println(bookBox2.totalPage);
		
		
		
	} // end of main

} // end of class
