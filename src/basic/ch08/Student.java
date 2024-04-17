package basic.ch08;

public class Student {

	//생성자 - constructoe
	//객체를 생성할떄 다음과 같은 모양으로 만들어라고 강제로 지시하는것
	//생성자는 객체를 생성할때 반드시 존재 해야한다.
	
	String name;
	int number;
	int grade;
	
	//생성자는 리턴타입이 없다.
	//클래스이름과 같다면 (대소문자까지 동일)
	//생성자 라고 부른다.
	public Student() {} // 기본 생성자
	//기본 생성자는 컴파일러가 .class 파일을 만들떄 
	//사용자 정의 생성자가 하나도없다면
	//자동으로 코드를 넣어준다. 
	
	
	//사용자 정의 생성자란?
	//클래스 설계자가 인스턴스화 했을때 정상적으로
	//동작해야 하는 초기값들이 필요하다면 강제성을 부여하는것
	public Student(String s, int n1, int n2) {
		name = s ;
		number = n1;
		grade = n2;
		//s 에 name 저장 ,n1에 number 저장, n2에 grade 저장
		//★★★ 중요!!
		// 생성자는 객체가 처음 만들어 질때 
		//제일 먼저 수행되는 코드 이다.
		
	}
	// 메서드 정의
	public void showInfo() {
		System.out.println("학생의 이름은 :" + name);
		System.out.println("학생의 번호는 :" + number);
		System.out.println("학생의 학년은 :" + grade);
	}
	
	
	
	
}
