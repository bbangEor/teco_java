package basic.ch07;

public class StudentMainTest {
	//메인함수
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentID = 1001;
		student1.studentName = "샤코";
		student1.address = "푸른언덕";
		student1.study();
		student1.breakTime();
		student1.showInfo();
		System.out.println("------------------------------");
		
		Student student2 = new Student();
		student2.studentID = 2001;
		student2.studentName = "야스오";
		student2.address = "붉은 언덕";
		student2.showInfo();
		student2.takeTest();
		
		
	} // end of main

	
	// 메서드란 ?
	// 객체의 기능을 구현하기위해 클래스 내부에 구현되는 함수 
	//멤버함수 (member function) 라고도 한다. 
	// 메서드 - 멤버변수를 활용해서 기능을 구현한다.
	
	//연습문제 (메소드를 정의해 보세요.)
	//1. 시험을 친다 (takeTest). studentID + "학생이 시험을 칩니다."
	
	// 함수
	//자바에서 함수란 객체와 상관없이 독립적으로
	//기능을 수행하는 일련에 코드 묶음
	static double addDouble(double d1, double d2) {
		return d1 + d2;
	}

	
	
	//2. 청소를 한다 (cleanUp). studentName + "학생이 청소를 합니다."
	
	
	
	
	
} // end of class
