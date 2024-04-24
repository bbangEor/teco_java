package basic.ch19;

public class ClassRoom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENT = 30; // 상수

	public ClassRoom(String className) { // 생성자
		this.className = className;
		students = new Student[MAX_STUDENT]; // Student[] - >라는 배열 , 30개의 네모칸이있는 배열.
		this.studentCount = 0; // 값을 주지않아도 0으로 초기화 되긴함.
	}

	// 학생을 추가하는 메서드 만들기 (기능)
	public void addStudent(Student student) { // (데이터타입 선언) < 매개변수넣기
		if (studentCount < MAX_STUDENT) { // 정원초과하지않게 방어적 코드 작성
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원초과");
		}

	}

	// 학급에 속한 모든 학생 정보를 출력하는 기능을 만드시오.
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			// 방어적코드
			if (students[i] != null) {
				System.out.println("name :" + students[i].getName() + ", age :" + students[i].getAge());
				// students[i] < [객체 주소] > heap영역 객체를 참조
			}

		}
	}

}
