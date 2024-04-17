package basic.ch05;

public class StudentProgram2 {
	// 메인함수
	public static void main(String[] args) {
		
		int n1 = 1;
		double d1 = 5.0;
		
		//참조타입 (주소값 들어감)
		Student student1 =new Student();
		Student student2 =new Student();
		// . 연산자를 통해서 접근가능함.
		
		student1.name = "홍길동";
		//콘솔창에 student1 (변수에 연결되어있는 객체의 이름을 화면에 출력)
		System.out.println(student1.name);
		student2.name = "이순신";
		System.out.println(student2.name);
		
		System.out.println(student1);
		System.out.println(student2);
		
	} // end of main

} // end of class
