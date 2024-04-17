package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {

		
		Student s1 = new Student("홍길동", 101, 3); //객체 "홍길동" >인수값
//		System.out.println(s1); // 주소값이 출력이된다.
//		s1.showInfo();
//		
		//연습문제 
		// s2참조 변수의 이름으로 학생을 메모리에 올리고 호출해보기
		
		//변수에 직접 접근해서 값을 초기화하세요
		
		Student s2 = new Student("햄발자" , 1216, 1);
		System.out.println(s2);
		s2.showInfo();
		
		System.out.println("------------------------");
		
		Student s3 = new Student(); //기본 생성자로 메모리가 올림
		s3.name = "가료이";
		s3.number = 1010;
		s3.grade = 1;
		s3.showInfo();
		
		
		//생성자를 여러개 만들어줄 수 있다.
		//생성자 오버로딩이라고 한다.
		
	}

}
